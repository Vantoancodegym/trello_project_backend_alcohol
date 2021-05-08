package com.example.trello_project_alcohol.service.broad.boardTagAppUser;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface IBoardTagAppUserService extends IService<TagUser_Board> {
    List<AppUser> getListTagUser(Long board_id);
}
