package com.example.trello_project_alcohol.service.notificationService;

import com.example.trello_project_alcohol.model.Notification;
import com.example.trello_project_alcohol.repo.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements INotificationService{
    @Autowired
    private NotificationRepo notificationRepo;

    @Override
    public List<Notification> findAll() {
        return null;
    }

    @Override
    public Notification findById(Long id) {
        return null;
    }

    @Override
    public Notification save(Notification notification) {
        return notificationRepo.save(notification);
    }

    @Override
    public void delete(Long id) {

    }
    @Override
    public List<Notification> findNotificationByUser(Long id) {
        return notificationRepo.findNotificationByAppUserQ(id);
    }
}
