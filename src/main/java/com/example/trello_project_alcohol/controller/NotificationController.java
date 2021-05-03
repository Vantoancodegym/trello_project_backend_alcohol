package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Notification;
import com.example.trello_project_alcohol.service.broad.IBoardService;
import com.example.trello_project_alcohol.service.notificationService.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("notification")
public class NotificationController {
    @Autowired
    private INotificationService iNotificationService;

    @PostMapping("create")
    public ResponseEntity<Notification> create(@RequestBody Notification notification){
        return new ResponseEntity<>(iNotificationService.save(notification), HttpStatus.OK);
    }
}
