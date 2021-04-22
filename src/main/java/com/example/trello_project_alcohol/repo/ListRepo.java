package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepo extends JpaRepository<List,Long> {
    java.util.List<List> findListByBoard_Id(Long id);
}
