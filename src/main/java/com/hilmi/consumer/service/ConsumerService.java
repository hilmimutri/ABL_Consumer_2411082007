package com.hilmi.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.hilmi.consumer.config.RabbitMQConfig;

@Service
public class ConsumerService {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        System.out.println("Received: " + message);
    }
}
