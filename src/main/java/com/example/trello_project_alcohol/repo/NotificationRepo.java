package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {
    @Query(value = "select n from Notification  as n join Notification_appUser on n.id = Notification_appUser.notification.id " +
            "where Notification_appUser.appUser.id = ?1")
    List<Notification> findNotificationByAppUser(Long id);
}
