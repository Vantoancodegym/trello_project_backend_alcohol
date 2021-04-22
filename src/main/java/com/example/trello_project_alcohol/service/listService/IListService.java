package com.example.trello_project_alcohol.service.listService;

import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.service.IService;

import java.util.ArrayList;
import java.util.Collection;

public interface IListService extends IService<List> {
    void editPositionList(ArrayList<List> lists);
    java.util.List<List> findListByBoardId(Long id);
    List editTitleList(List list, Long id);
}