package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepo extends JpaRepository<AppRole,Long> {
    AppRole findAppRoleByRoleName(String name);
}
