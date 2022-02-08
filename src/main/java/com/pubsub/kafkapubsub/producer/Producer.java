package com.pubsub.kafkapubsub.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC="test_topic";

    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        System.out.println("++++ PREPARING TO SEND THE MESSAGE TO : "+TOPIC);
        this.kafkaTemplate.send(TOPIC,message);
        System.out.println("MESSAGE SENT : "+message);
        System.out.println("MESSAGE SENT SUCCESSFULLY");
    }


}
