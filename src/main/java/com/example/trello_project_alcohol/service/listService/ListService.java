package com.example.trello_project_alcohol.service.listService;

import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.repo.ListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService implements IListService{
    @Autowired
    private ListRepo listRepo;
    @Override
    public List createList(List list) {
        return listRepo.save(list);
    }
}
