package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.Card_Labels;
import com.example.trello_project_alcohol.model.Card_tagUser;
import com.example.trello_project_alcohol.model.Labels;
import com.example.trello_project_alcohol.service.CardTagUserService.ICardTagUserService;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Controller
@RequestMapping("card/tagUser")
public class CardTagUserController {
    @Autowired
    private IAppUserService appUserService;
    @GetMapping("/{id}")
    public ResponseEntity<List<AppUser>> findListAppUserByCardId(@PathVariable Long id){
        return new ResponseEntity<>(appUserService.findListAppUserByCardId(id), HttpStatus.OK);
    }
    @GetMapping("selected/{id}")
    public ResponseEntity<List<AppUser>> findListSelected(@PathVariable Long id){
        return new ResponseEntity<>(appUserService.findListSelected(id), HttpStatus.OK);
    }
    @PostMapping("addAppUserToCard")
    public ResponseEntity<?> addAppUserToCard(@RequestBody Card_tagUser card_tagUser){
        appUserService.addNewAppUserToCard(card_tagUser);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
