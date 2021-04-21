package com.example.trello_project_alcohol.model;

import javax.persistence.*;

@Entity
public class Card_Labels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Card card;
    @OneToOne
    private Labels labels;
}
