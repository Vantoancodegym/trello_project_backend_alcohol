package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelsRepo extends JpaRepository<Labels,Long> {
}
