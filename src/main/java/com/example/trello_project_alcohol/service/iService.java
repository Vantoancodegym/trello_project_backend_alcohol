package com.example.trello_project_alcohol.service;

import java.util.List;

public interface iService<T> {
    List<T> findAll();
    T findById (Long id);
    T save( T t);
    void delete( Long id);
}
