package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.model.TagUser_Board;
import com.example.trello_project_alcohol.model.virtual.BoardByTagAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagUser_Board_Repo extends JpaRepository<TagUser_Board,Long> {
    @Query(value = "select name, tub.app_user_id as appUserId from board join tag_user_board tub on board.id = tub.board_id where tub.app_user_id =?", nativeQuery = true)
    List<Board> findBoardByTagUser(Long user_id);
    List<BoardByTagAppUser> showAllNameByTagUserBoard(Long app_user_id);
}
