package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.service.broad.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public ResponseEntity <List<Board>> showAll(){
        return new ResponseEntity<>(boardService.findAll(), HttpStatus.OK);
    }
    @PostMapping("create")
    public ResponseEntity<Board> create(@RequestBody Board board){
        return new ResponseEntity<>(boardService.save(board), HttpStatus.OK);
    }
    
}
