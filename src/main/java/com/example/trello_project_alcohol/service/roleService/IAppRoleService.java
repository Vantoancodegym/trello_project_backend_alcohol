package com.example.trello_project_alcohol.service.roleService;

import com.example.trello_project_alcohol.model.AppRole;
import com.example.trello_project_alcohol.service.IService;

public interface IAppRoleService extends IService<AppRole> {
    AppRole findByName(String name);

}
