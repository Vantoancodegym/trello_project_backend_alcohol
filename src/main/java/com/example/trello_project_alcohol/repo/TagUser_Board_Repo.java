package com.example.trello_project_alcohol.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagUser_Board_Repo extends JpaRepository<TagUser_Board_Repo,Long> {
}
