package com.example.trello_project_alcohol.service.boardTagAppUser;

import com.example.trello_project_alcohol.model.BoardTagAppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardTagAppUserService implements IBoardTagAppUserService{
    @Autowired
    private BoardTagAppUserService boardTagAppUserService;
    @Override
    public List<BoardTagAppUser> findAll() {
        return null;
    }

    @Override
    public BoardTagAppUser findById(Long id) {
        return null;
    }

    @Override
    public BoardTagAppUser save(BoardTagAppUser boardTagAppUser) {
        return boardTagAppUserService.save(boardTagAppUser);
    }

    @Override
    public void delete(Long id) {

    }
}
