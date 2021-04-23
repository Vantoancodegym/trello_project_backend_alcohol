package com.example.trello_project_alcohol.service.broad.boardTagAppUser;

import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.repo.TagUser_Board_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardTagAppUserService implements IBoardTagAppUserService{
    @Autowired
    private TagUser_Board_Repo tagUserBoardRepo;

    @Override
    public List<TagUser_Board> findAll() {
        return tagUserBoardRepo.findAll();
    }

    @Override
    public TagUser_Board findById(Long id) {
        return null;
    }

    @Override
    public TagUser_Board save(TagUser_Board tagUser_board) {
        return tagUserBoardRepo.save(tagUser_board);
    }

    @Override
    public void delete(Long id) {
    }
    // Test duyệt board
}
