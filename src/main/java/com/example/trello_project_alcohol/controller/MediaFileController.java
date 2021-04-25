package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.MediaFile;
import com.example.trello_project_alcohol.service.mediaFileService.MediaFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/mediafile")
public class MediaFileController {
    @Autowired
    private MediaFileService mediaFileService;
    @GetMapping("findByCard/{id}")
    public ResponseEntity<List<MediaFile>> findMediaFileCard(@PathVariable Long id){
        return new ResponseEntity<>(mediaFileService.findMediaFileByCard(id), HttpStatus.OK);
    }
}
