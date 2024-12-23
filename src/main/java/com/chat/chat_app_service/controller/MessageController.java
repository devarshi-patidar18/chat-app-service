package com.chat.chat_app_service.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.chat_app_service.Models.Message;



@RestController
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public MessageController(SimpMessagingTemplate simpMessagingTemplate){
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @MessageMapping("/message") // client will send message on /message
    // @SendTo("/topic/return-to") // People who have subscribed /topic/return-to --> message will be sent to all of them
    public Message getContent(@RequestBody Message message){
        simpMessagingTemplate.convertAndSend("/topic/return-to/"+message.getReceiver().getUserId(),message);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // e.printStackTrace();
            System.out.println(e);
        }
        return message;
    }



}
