package com.wchan.rabbitmqdemo.producer;

import com.google.gson.Gson;
import com.wchan.rabbitmqdemo.ConfigureRabbitMq;
import com.wchan.rabbitmqdemo.model.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    private final RabbitTemplate rabbitTemplate;
    private Gson gson = new Gson();

    public SendMessageController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody User user) {
        rabbitTemplate.convertAndSend("userRegistrationTopic", "user.Registered", gson.toJson(user));
    }
}
