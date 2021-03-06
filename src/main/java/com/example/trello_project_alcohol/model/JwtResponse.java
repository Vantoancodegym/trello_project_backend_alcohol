package com.example.trello_project_alcohol.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtResponse {
    private Long id;
    private String accessToken;
    private String type = "Bearer";
    private String username;
    private String email;
    private String avatar;
    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(String accessToken, Long id, String username, String email, Collection<? extends GrantedAuthority> roles, String avatar) {
        this.accessToken = accessToken;
        this.username = username;
        this.roles = roles;
        this.email = email;
        this.id = id;
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getUsername() {
        return username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

}
