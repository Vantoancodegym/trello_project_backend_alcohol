package com.example.trello_project_alcohol.service.broad;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.repo.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService implements IBoardService {
    @Autowired
    private BoardRepo boardRepo;

    @Override
    public List<Board> findAll() {
        return boardRepo.findAll();
    }

    @Override
    public Board findById(Long id) {
        return boardRepo.findById(id).get();
    }

    @Override
    public Board save(Board board) {
        return boardRepo.save(board);
    }

    @Override
    public void delete(Long id) {
    }


    @Override
    public List<Board> findAllNameByTagUserBoard(Long tag_user_id) {
        return boardRepo.findBoardByNameTagUser(tag_user_id);
    }

    @Override
    public List<Board> findAllNameBoardAppUser(Long app_user_id) {
        return boardRepo.findBoardByAppUser_Id(app_user_id);
    }
}

