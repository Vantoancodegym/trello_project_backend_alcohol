package com.example.trello_project_alcohol.service.broad.boardTagAppUser;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.repo.TagUser_Board_Repo;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardTagAppUserService implements IBoardTagAppUserService{
    @Autowired
    private TagUser_Board_Repo tagUserBoardRepo;

    @Autowired
    private IAppUserService userService;

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

    @Override
    public List<AppUser> getListTagUser(Long board_id) {
        List<AppUser> listTagUser = new ArrayList<>();
        List<AppUser> allUsers = userService.findAll();
        List<AppUser> listUsersByBoard = userService.findUserAndTagUserByBoard(board_id);
        for (AppUser user: allUsers ) {
            if (!checkListContainItem(user, listUsersByBoard)) listTagUser.add(user);
        }
        return listTagUser;
    }

    public boolean checkListContainItem(AppUser appUser, List<AppUser> appUserList){
        for (AppUser a: appUserList) {
            if (a.getId()==appUser.getId()) return true;
        }
        return false;
    }
}
