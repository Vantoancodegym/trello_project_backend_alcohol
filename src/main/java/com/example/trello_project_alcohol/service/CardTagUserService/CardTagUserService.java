package com.example.trello_project_alcohol.service.CardTagUserService;

import com.example.trello_project_alcohol.model.Card_tagUser;
import com.example.trello_project_alcohol.repo.Card_tagUser_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardTagUserService implements ICardTagUserService{
    @Autowired
    private Card_tagUser_repo card_tagUser_repo;
    @Override
    public Card_tagUser create(Card_tagUser card_tagUser) {
        return card_tagUser_repo.save(card_tagUser);
    }
}
