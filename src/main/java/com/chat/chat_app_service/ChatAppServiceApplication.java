package com.chat.chat_app_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChatAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatAppServiceApplication.class, args);
	}

}
