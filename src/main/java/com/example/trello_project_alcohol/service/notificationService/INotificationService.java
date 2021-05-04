package com.example.trello_project_alcohol.service.notificationService;

import com.example.trello_project_alcohol.model.Notification;
import com.example.trello_project_alcohol.service.IService;

import java.util.List;

public interface INotificationService extends IService<Notification> {
    List<Notification> findNotificationByUser(Long id);
}
