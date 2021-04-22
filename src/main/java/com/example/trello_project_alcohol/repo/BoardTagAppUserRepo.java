package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.BoardTagAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardTagAppUserRepo extends JpaRepository<BoardTagAppUser,Long> {
}
