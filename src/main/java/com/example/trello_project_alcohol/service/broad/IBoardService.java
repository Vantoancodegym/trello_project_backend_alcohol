package com.example.trello_project_alcohol.service.broad;
import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface IBoardService extends IService<Board> {
    List<Board> findAllNameByTagUserBoard(Long app_user_id);
}
