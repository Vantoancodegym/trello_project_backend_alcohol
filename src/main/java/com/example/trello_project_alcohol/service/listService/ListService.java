package com.example.trello_project_alcohol.service.listService;

import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.repo.ListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListService implements IListService{
    @Autowired
    private ListRepo listRepo;
    @Override
    public java.util.List<List> findAll() {
        return listRepo.findAll();
    }

    @Override
    public List findById(Long id) {
        return listRepo.findById(id).get();
    }

    @Override
    public List save(List list) {
        return listRepo.save(list);
    }

    @Override
    public void delete(Long id) {
        listRepo.deleteById(id);

    }

    @Override
    public void editPositionList(ArrayList<List> lists) {
        for (int i = 0; i < lists.size(); i++) {
            listRepo.save(lists.get(i));
        }
    }

    @Override
    public java.util.List<List> findListByBoardId(Long id) {
        return listRepo.findListByBoard_IdOrderByPosition(id);
    }
    @Override
    public List editTitleList(List list, Long id) {
        list.setId(id);
        return listRepo.save(list);
    }

}

