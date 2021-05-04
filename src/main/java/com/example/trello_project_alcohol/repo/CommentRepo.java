package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment> findCommentsById(Long commentId);
    Iterable<Comment> findCommentByAppUserId (Long userId);
    @Query(nativeQuery = true,value = "select * from comment where card_id =?")
    List<Comment> findAllByCard(Long cardId);
}
