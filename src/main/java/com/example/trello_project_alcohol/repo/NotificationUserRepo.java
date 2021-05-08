package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Notification_appUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationUserRepo extends JpaRepository<Notification_appUser, Long> {
    void deleteNotification_appUsersByAppUser_Id(Long id);
}
