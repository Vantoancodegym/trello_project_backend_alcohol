package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findAppUserByUserName(String username);
}
