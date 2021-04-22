package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.DTO.ResultResponse;
import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.service.listService.IListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("")
@CrossOrigin("*")
public class TrelloController {
    @Autowired
    private IListService listService;
    @GetMapping("")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(listService.findAllList(),HttpStatus.OK);
    }
    @PostMapping("createList")
    public ResponseEntity<?> createList(@RequestBody List list){
        listService.createList(list);
        return new  ResponseEntity<>(new ResultResponse("Create obj List success"), HttpStatus.OK);
    }
    @PutMapping("editPositionList")
    public ResponseEntity<?> changePositionList(@RequestBody ArrayList<List> lists){
        return new ResponseEntity(new ResultResponse("Change position ok"),HttpStatus.OK);
    }
}
