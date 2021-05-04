package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.Notification;
import com.example.trello_project_alcohol.service.notificationService.INotificationService;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private INotificationService iNotificationService;
    @Autowired
    private IAppUserService userService;

    @PostMapping("")
    public ResponseEntity<Notification> create(@RequestBody Notification notification){
        return new ResponseEntity<>(iNotificationService.save(notification), HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<Notification>> findNotificationByUser(){
        AppUser appUser = userService.getUserCurrent();
        return new ResponseEntity<>(iNotificationService.findNotificationByUser(appUser.getId()),HttpStatus.OK);
    }
}
