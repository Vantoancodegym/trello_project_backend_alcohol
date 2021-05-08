package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.service.broad.boardTagAppUser.BoardTagAppUserService;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/boardAppUser")
public class BoardTagAppUserController {
    @Autowired
    private BoardTagAppUserService boardTagAppUserService;

    @Autowired
    private IAppUserService userService;

    @GetMapping("")
    public ResponseEntity <List<TagUser_Board>> showAll(){
        return new ResponseEntity<>(boardTagAppUserService.findAll(),HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<TagUser_Board> create(@RequestBody TagUser_Board tagUserBoard){
         return new ResponseEntity<>(boardTagAppUserService.save(tagUserBoard), HttpStatus.OK);
     }

    @GetMapping("list/{id}")
    public ResponseEntity<List<AppUser>> getListUserTag(@PathVariable Long id){
        AppUser currentUser = userService.getUserCurrent();
        List<AppUser> users = boardTagAppUserService.getListTagUser(id);
        for (AppUser user: users) {
            if (user.getId() == currentUser.getId()) users.remove(user);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
