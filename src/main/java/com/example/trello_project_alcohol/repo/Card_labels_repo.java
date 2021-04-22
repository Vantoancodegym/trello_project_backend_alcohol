package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Card_Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Card_labels_repo extends JpaRepository<Card_Labels,Long> {
}
