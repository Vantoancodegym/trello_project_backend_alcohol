package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Card_tagUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Card_tagUser_repo extends JpaRepository<Card_tagUser,Long> {
}
