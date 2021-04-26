package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Board;
import com.example.trello_project_alcohol.model.TagUser_Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagUser_Board_Repo extends JpaRepository<TagUser_Board,Long> {
}
