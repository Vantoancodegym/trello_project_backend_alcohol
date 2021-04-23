package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepo extends JpaRepository<Board,Long> {
    @Query(value = "select b.id as id, b.name as name from board as b join app_user au on au.id = b.app_user_id where app_user_id =?", nativeQuery = true)
    List<Board> findAllByNameByTagAppUserBoard(Long app_user_id);
}
