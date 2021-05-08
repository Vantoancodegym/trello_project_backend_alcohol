package com.example.trello_project_alcohol.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    @ManyToMany
    private Set<AppUser> appUser;
    public Notification() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<AppUser> getAppUser() {
        return appUser;
    }

    public void setAppUser(Set<AppUser> appUser) {
        this.appUser = appUser;
    }
}
