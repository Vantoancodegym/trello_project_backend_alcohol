package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {
    @Query(value = "select n from Notification  as n join Notification_appUser as a on n.id = a.notification.id " +
            "where a.appUser.id = :id", nativeQuery = false)
    List<Notification> findNotificationByAppUserQ(@Param("id") Long id);
}
