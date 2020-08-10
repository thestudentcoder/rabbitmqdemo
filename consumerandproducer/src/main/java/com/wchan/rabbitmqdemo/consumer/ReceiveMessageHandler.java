package com.wchan.rabbitmqdemo.consumer;

import com.google.gson.Gson;
import com.wchan.rabbitmqdemo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiveMessageHandler {

    private Gson gson = new Gson();

    public void handleMessage(String message) {
        log.info("handleMessage");
        log.info("message {}", message);
        User user = gson.fromJson(message, User.class);
        log.info("user object: {}", user);
    }
}
