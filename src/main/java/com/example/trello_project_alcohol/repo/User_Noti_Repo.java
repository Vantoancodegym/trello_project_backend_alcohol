package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.NotificaionAppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Noti_Repo extends JpaRepository<NotificaionAppUser,Long> {
}
