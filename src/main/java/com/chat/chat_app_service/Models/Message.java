package com.chat.chat_app_service.Models;

public class Message {

    private String name;

    private String content;

    private Long senderId;
    private Long receiverId;

    private String destination;

    public Message(String name, String content, Long senderId, Long receiverId, String destination) {
        this.name = name;
        this.content = content;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message() {
    }

    

}
