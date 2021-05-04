package com.example.trello_project_alcohol.service.cardService;

import com.example.trello_project_alcohol.model.Card;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface ICardService extends IService<Card> {
    List<Card> findCardsByListId(Long id);
    List<Card> findCardsByBroadIdAndUserId (Long broadId, Long userId);
    List<Card> findAllCard();
    List<Card> findCardByLabel(Long label_id,Long board_id);

}
