package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("list")
public class UserController {
    @Autowired
    private IAppUserService iAppUserService;

    @GetMapping("")
    public ResponseEntity<List<AppUser>> showAll (){
        return new ResponseEntity<>(iAppUserService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<AppUser> createUser(@RequestBody AppUser appUser) {
        return new ResponseEntity<>(iAppUserService.save(appUser), HttpStatus.OK);
    }

}
