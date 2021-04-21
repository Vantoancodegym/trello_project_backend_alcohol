package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.service.broad.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    public ResponseEntity <List<Board>> showAll(){
        return new ResponseEntity<>(boardService.findAll(), HttpStatus.OK);
    }
    public ResponseEntity<Board> create(@RequestBody Board board){
        return new ResponseEntity<>(boardService.save(board), HttpStatus.OK);
    }
}
