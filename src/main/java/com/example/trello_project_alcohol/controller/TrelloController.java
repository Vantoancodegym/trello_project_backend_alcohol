package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.DTO.ResultResponse;
import com.example.trello_project_alcohol.model.List;
import com.example.trello_project_alcohol.service.listService.IListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TrelloController {
    @Autowired
    private IListService listService;
    @PostMapping("createList")
    public ResponseEntity<?> createList(@RequestBody List list){
        return new  ResponseEntity<>(new ResultResponse("Create obj List success"), HttpStatus.OK);
    }
}
