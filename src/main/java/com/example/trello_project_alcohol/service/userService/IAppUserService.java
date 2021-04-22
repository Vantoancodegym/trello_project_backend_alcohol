package com.example.trello_project_alcohol.service.userService;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.service.IService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IAppUserService extends IService<AppUser>, UserDetailsService {
    Optional<AppUser> findByUsername(String username);
}
