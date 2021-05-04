package com.example.trello_project_alcohol.service.commentService;

import com.example.trello_project_alcohol.model.Comment;
import com.example.trello_project_alcohol.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public List<Comment> findAll() {
        return commentRepo.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return commentRepo.findById(id).get();
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepo.save(comment);
    }

    @Override
    public void delete(Long id) {
        commentRepo.deleteById(id);
    }

    @Override
    public List<Comment> findCommentsById(Long commentId) {
        return commentRepo.findCommentsById(commentId);
    }

    @Override
    public Iterable<Comment> findCommentByAppUserId(Long userId) {
        return commentRepo.findCommentByAppUserId(userId);
    }

    @Override
    public List<Comment> findAllByCard(Long cardId) {
        return commentRepo.findAllByCard(cardId);
    }
}
