package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepo extends JpaRepository<Board,Long> {
    @Query(value = "select board.id, board.name, board.appUserId as appUserId from board join tag_user_board tub on board.id = tub.board_id where tub.app_user_id =?", nativeQuery = true)
    List<Board> findBoardByNameTagUser(Long tagUser);
    List<Board> findBoardByAppUser_Id (Long app_user_id);

}
