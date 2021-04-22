package com.example.trello_project_alcohol.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private AppUser appUserCreate;

    public Board() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppUser getAppUserCreate() {
        return appUserCreate;
    }

    public void setAppUserCreate(AppUser appUserCreate) {
        this.appUserCreate = appUserCreate;
    }
}
