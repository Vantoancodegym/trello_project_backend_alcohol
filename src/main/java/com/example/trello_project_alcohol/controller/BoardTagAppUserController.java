package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.model.virtual.BoardByTagAppUser;
import com.example.trello_project_alcohol.service.broad.boardTagAppUser.BoardTagAppUserService;
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

    @GetMapping("")
    public ResponseEntity <List<TagUser_Board>> showAll(){
        return new ResponseEntity<>(boardTagAppUserService.findAll(),HttpStatus.OK);
    }

     @PostMapping("create")
    public ResponseEntity<TagUser_Board> create(@RequestBody TagUser_Board tagUserBoard){
         return new ResponseEntity<>(boardTagAppUserService.save(tagUserBoard), HttpStatus.OK);
     }
     @GetMapping("listBoardTagUser/{id}")
    public ResponseEntity<List<BoardByTagAppUser>> showAllBoardTagUser(@PathVariable Long id){
        return new ResponseEntity<>(boardTagAppUserService.findAllNameByTagUserBoard(id),HttpStatus.OK);
     }
}
