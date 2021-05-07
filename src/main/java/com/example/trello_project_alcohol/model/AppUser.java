package com.example.trello_project_alcohol.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 3, max = 30)
    private String userName;
    private String passWord;
    private String avatar;
    @Transient
    private MultipartFile avatarMul;
    @Email
    @NotBlank
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> appRole;
    @Transient
    private String oldPassWord;
    @Transient
    private String newPassWord;
    public AppUser() {
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
        return appRole;
    }

    public void setAppRoles(Set<AppRole> appRoles) {
        this.appRole = appRole;
    }

    public String getOldPassWord() {
        return oldPassWord;
    }

    public void setOldPassWord(String oldPassWord) {
        this.oldPassWord = oldPassWord;
    }
}

