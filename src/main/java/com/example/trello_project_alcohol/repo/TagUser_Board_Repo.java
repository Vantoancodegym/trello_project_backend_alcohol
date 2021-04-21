package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.TagUser_Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagUser_Board_Repo extends JpaRepository<TagUser_Board,Long> {
}
