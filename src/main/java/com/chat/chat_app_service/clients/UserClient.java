package com.chat.chat_app_service.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "CHAT-APP-SERVICE",value = "CHAT-APP-SERVICE")
public interface UserClient {

    

    
} 
