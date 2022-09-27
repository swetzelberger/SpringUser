package com.wetzelware.springuser.users.repository;

import com.wetzelware.springuser.users.dto.User;
import com.wetzelware.springuser.users.dto.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class UserRepository {
    @Autowired
    RestTemplate restTemplate;

    public User findByUserName(String userName) {
        if (!StringUtils.hasLength(userName)) {
            System.out.println("findByUserName: userName cannot be empty");
            return null;
        }
        User user = restTemplate.getForObject(
        "https://api.github.com/users/" + userName, User.class);
        List<UserRepo> userRepos = restTemplate.getForObject(
        "https://api.github.com/users/" + userName + "/repos", List.class);
        user.setRepos(userRepos);
        return user;
    }
}