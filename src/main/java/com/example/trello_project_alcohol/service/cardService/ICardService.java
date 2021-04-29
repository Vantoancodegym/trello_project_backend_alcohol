package com.example.trello_project_alcohol.service.cardService;

import com.example.trello_project_alcohol.model.Card;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface ICardService extends IService<Card> {
    List<Card> findCardsByListId(Long id);
    List<Card> findCardsByContent(String input);
    List<Card> findCardsByTitle(String input);
}
