package com.wetzelware.springuser.users.dto;

import java.util.Date;
import java.util.List;
import com.wetzelware.springuser.users.dto.UserRepo;

public class User {
    private String  userName;
    private String displayName;
    private String avatar;
    private String geo_location;
    private String email;
    private String url;
    private Date createdAt;
    private List<UserRepo> repos;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGeo_location() {
        return geo_location;
    }

    public void setGeo_location(String geo_location) {
        this.geo_location = geo_location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<com.wetzelware.springuser.users.dto.UserRepo> getRepos() {
        return repos;
    }

    public void setRepos(List<UserRepo> repos) {
        this.repos = repos;
    }

}
