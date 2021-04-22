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
    @PutMapping("changePositon")
    public ResponseEntity<?> changePositionCard(@RequestBody List<Card> cards){
        for (Card card:cards) {
            cardService.save(card);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
