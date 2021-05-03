package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepo extends JpaRepository<Card,Long> {
    List<Card> findCardsByList_IdOrderByPosition(Long id);
    void deleteByContent(String content);
    @Query(nativeQuery = true,value = "select * from card")
    List<Card> findAllCard();
    @Query(nativeQuery = true, value = "select * from card join card_labels on card.id = card_labels.card_id where labels_id = ?")
    List<Card> findCardsByLabel(Long labels_id);
}
