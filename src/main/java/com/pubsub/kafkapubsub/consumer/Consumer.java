package com.pubsub.kafkapubsub.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println("======Consumed Message : "+message);
        System.out.println("Message Consumed successfully");
    }
}