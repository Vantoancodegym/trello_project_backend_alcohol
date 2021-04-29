package com.example.trello_project_alcohol.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    @Size(min = 3, max = 30)
    private String userName;
    @NotBlank
    @NotNull
    @Size(min = 6, max = 20)
    private String passWord;
    private String avatar;
    @Transient
    private MultipartFile avatarMul;
    @Email
    @NotBlank
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> appRoles;


    public AppUser() {
    }

    public AppUser(Long id, @NotBlank @NotNull @Size(min = 3, max = 30) String userName, @NotBlank @NotNull @Size(min = 6, max = 20) String passWord, String avatar, MultipartFile avatarMul, @Email @NotBlank String email, Set<AppRole> appRoles) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.avatar = avatar;
        this.avatarMul = avatarMul;
        this.email = email;
        this.appRoles = appRoles;
    }

    public AppUser(@NotBlank @NotNull @Size(min = 3, max = 30) String userName, @NotBlank @NotNull @Size(min = 6, max = 20) String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public MultipartFile getAvatarMul() {
        return avatarMul;
    }

    public void setAvatarMul(MultipartFile avatarMul) {
        this.avatarMul = avatarMul;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<AppRole> getAppRoles() {
        return appRoles;
    }

    public void setAppRoles(Set<AppRole> appRoles) {
        this.appRoles = appRoles;
    }
}

