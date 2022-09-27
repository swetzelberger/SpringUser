package com.wetzelware.springuser.users.rest.service.impl;

import com.wetzelware.springuser.users.dto.User;
import com.wetzelware.springuser.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/rest/users")
public class UserRestService {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET, value="", produces={MediaType.APPLICATION_JSON_VALUE})
    public User getUserInformation(
        @RequestParam(value="userName", required=true) String userName) {
        if (!StringUtils.hasLength(userName)) {
            System.out.println("getUserInformation: Must pass user name.");
            return null;
        }
        User myUser = userRepository.findByUserName(userName);
        return myUser;
    }
}
