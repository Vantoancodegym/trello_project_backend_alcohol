package com.example.trello_project_alcohol.service.listService;

import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.repo.ListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ListService implements IListService{
    @Autowired
    private ListRepo listRepo;

    @Override
    public Collection<List> findAllList() {
        return listRepo.findAll();
    }

    @Override
    public List createList(List list) {
        Collection<List> lists = findAllList();
        int position = lists.size()+1;
        list.setPosition(position);
        return listRepo.save(list);
    }
}
