package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.AppUser;
import com.example.trello_project_alcohol.model.Card;
import com.example.trello_project_alcohol.model.Comment;
import com.example.trello_project_alcohol.service.commentService.ICommentService;
import com.example.trello_project_alcohol.service.userService.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private ICommentService commentService;
    @Autowired
    private IAppUserService userService;

    @GetMapping("")
    public ResponseEntity<?> showAll(){
        return new ResponseEntity<>(commentService.findAll(),HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<?> createComment (@RequestBody Comment comment){
        return new ResponseEntity<>(commentService.save(comment),HttpStatus.OK);
    }

}
