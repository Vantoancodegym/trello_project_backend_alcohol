package com.example.trello_project_alcohol.DTO;

public class ResultResponse {
    private int id;
    private String content;

    public ResultResponse() {
    }

    public ResultResponse(String content) {
        this.content = content;
    }

    public ResultResponse(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
