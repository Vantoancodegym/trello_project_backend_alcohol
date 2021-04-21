package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card,Long> {
}
