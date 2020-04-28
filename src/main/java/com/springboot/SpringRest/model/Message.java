package com.springboot.SpringRest.model;

public class Message {

    private String content;

    //Default constructor
    public Message() {
    }

    //Constructor with parameters
    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
