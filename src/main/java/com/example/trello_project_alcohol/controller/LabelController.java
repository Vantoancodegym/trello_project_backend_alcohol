package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Card_Labels;
import com.example.trello_project_alcohol.model.Labels;
import com.example.trello_project_alcohol.service.labels.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("labels")
@CrossOrigin("*")
public class LabelController {
    @Autowired
    private LabelsService labelsService;
    @GetMapping("card/{id}")
    public ResponseEntity<List<Labels>> findListLabelsByCardId(@PathVariable Long id){
        return new ResponseEntity<>(labelsService.findListLabelsByCardId(id), HttpStatus.OK);
    }
    @GetMapping("selected/{id}")
    public ResponseEntity<List<Labels>> findListSelected(@PathVariable Long id){
        return new ResponseEntity<>(labelsService.findListSelected(id), HttpStatus.OK);
    }
    @PostMapping("addLabelToCard")
    public ResponseEntity<?> addLabelToCard(@RequestBody Card_Labels card_labels){
        labelsService.addNewLabelToCard(card_labels);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(labelsService.showAllLabel(),HttpStatus.OK);
    }
}
