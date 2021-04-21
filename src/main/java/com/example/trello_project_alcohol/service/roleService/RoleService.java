package com.example.trello_project_alcohol.service.roleService;

import com.example.trello_project_alcohol.model.AppRole;
import com.example.trello_project_alcohol.repo.AppRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IAppRoleService {
    @Autowired
    private AppRoleRepo appRoleRepo;

    @Override
    public List<AppRole> findAll() {
        return (List<AppRole>) appRoleRepo.findAll();
    }

    @Override
    public AppRole findById(Long id) {
        return appRoleRepo.findById(id).get();
    }

    @Override
    public AppRole save(AppRole appRole) {
        return appRoleRepo.save(appRole);
    }

    @Override
    public void delete(Long id) {
        appRoleRepo.deleteById(id);
    }

    @Override
    public AppRole findByName(String name) {
        return appRoleRepo.findAppRoleByName(name);
    }
}
