package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.service.broad.boardTagAppUser.BoardTagAppUserService;
import com.example.trello_project_alcohol.service.broad.boardTagAppUser.IBoardTagAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/tagUser")
public class BoardTagAppUserController {
    @Autowired
    private IBoardTagAppUserService boardTagAppUserService;

    @GetMapping("")
    public ResponseEntity <List<TagUser_Board>> showAll(){
        return new ResponseEntity<>(boardTagAppUserService.findAll(),HttpStatus.OK);
    }

     @PostMapping("create")
    public ResponseEntity<TagUser_Board> create(@RequestBody TagUser_Board tagUserBoard){
         return new ResponseEntity<>(boardTagAppUserService.save(tagUserBoard), HttpStatus.OK);
     }
}
