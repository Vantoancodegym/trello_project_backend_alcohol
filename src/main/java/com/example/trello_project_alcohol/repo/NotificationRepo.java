package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepo extends JpaRepository<Notification,Long> {
////    @Query("select n from Notification  as n join notification_app_user on n.id = ")
//    List<Notification> findNotificationByAppUser();
}
