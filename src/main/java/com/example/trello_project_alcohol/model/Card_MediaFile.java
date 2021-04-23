package com.example.trello_project_alcohol.model;

import javax.persistence.*;

@Entity
public class Card_MediaFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Card card;
    @ManyToOne
    private MediaFile mediaFile;

    public Card_MediaFile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public MediaFile getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }
}
