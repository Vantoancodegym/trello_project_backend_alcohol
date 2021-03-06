package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {
    List<Card> findCardsByList_IdOrderByPosition(Long id);
    void deleteByContent(String content);
    @Query(nativeQuery = true, value = "select * from card_tag_user join card on card_tag_user.card_id = card.id join list on card.list_id = list.id join board on list.board_id = board.id where board_id = ? and card_tag_user.app_user_id = ?")
    List<Card> findCardByUserIdAndBroadId(Long broadId, Long userId);
    @Query(nativeQuery = true, value = "select * from card")
    List<Card> findAllCard();
    @Query(nativeQuery = true, value = "select * from card join card_labels on card.id = card_labels.card_id join list on card.list_id = list.id join board on list.board_id = board.id where labels_id = ?1 and board_id = ?2")
    List<Card> findCardsByLabel(Long labels_id, Long board_id);
}
