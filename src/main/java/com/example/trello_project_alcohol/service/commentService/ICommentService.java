package com.example.trello_project_alcohol.service.commentService;

import com.example.trello_project_alcohol.model.Comment;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface ICommentService extends IService<Comment> {
    List<Comment> findCommentsById(Long commentId);
    Iterable<Comment> findCommentByAppUserId (Long userId);
    List<Comment> findAllByCard(Long cardId);
}
