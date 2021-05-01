package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Card_tagUser;
import com.example.trello_project_alcohol.service.CardTagUserService.ICardTagUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin("*")
@Controller
@RequestMapping("card/tagUser")
public class CardTagUserController {
    @Autowired
    private ICardTagUserService cardTagUserService;
    @PostMapping("create")
    public ResponseEntity<?> addMemberCard(@RequestBody Card_tagUser card_tagUser){
        return new ResponseEntity<>(cardTagUserService.create(card_tagUser), HttpStatus.OK);
    }
}
