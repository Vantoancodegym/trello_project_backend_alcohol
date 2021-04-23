package com.example.trello_project_alcohol.controller;

import com.example.trello_project_alcohol.model.Card;
import com.example.trello_project_alcohol.service.cardService.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cards")
public class CardController {
    @Autowired
    private ICardService cardService;
    @GetMapping("/list/{id}")
    public ResponseEntity<List<Card>> findCardsByListId(@PathVariable Long id){
        return new ResponseEntity<>(cardService.findCardsByListId(id), HttpStatus.OK);
    }
    @PutMapping("changePosition")
    public ResponseEntity<?> changePositionCard(@RequestBody List<Card> cards){
        for (Card card:cards) {
            cardService.save(card);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("edit/{id}")
    public ResponseEntity<?> editCard(@PathVariable Long id, @RequestBody Card card){
        card.setId(id);
        cardService.save(card);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Card> findCardById(@PathVariable Long id){
        return new ResponseEntity<>(cardService.findById(id), HttpStatus.OK);
    }
    @PostMapping("create")
    public ResponseEntity<?> createCard(@RequestBody Card card){
        return new ResponseEntity<>(cardService.save(card), HttpStatus.OK);
    }
}


