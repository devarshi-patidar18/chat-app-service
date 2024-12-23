package com.chat.chat_app_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@CrossOrigin("*")
public class TestingController {

    

    @GetMapping("/msg-test")
    public String testMsg(){
        String str = "Message test is working";
        return str;
    }

}
