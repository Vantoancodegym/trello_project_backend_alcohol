package com.example.trello_project_alcohol.service.listService;

import com.example.trello_project_alcohol.model.List;

import java.util.Collection;

public interface IListService {
    Collection<List> findAllList();
    List createList(List list);
}
