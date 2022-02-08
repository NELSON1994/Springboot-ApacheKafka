package com.pubsub.kafkapubsub.controller;

import com.pubsub.kafkapubsub.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public TestController(Producer producer) {
        this.producer = producer;
    }

    private final Producer producer;

@PostMapping("/publish")
    public void sendMessage(@RequestParam String message){
        this.producer.sendMessage(message);
        System.out.println("=====SENDING OF MESSAGE DONE");
    }
}
