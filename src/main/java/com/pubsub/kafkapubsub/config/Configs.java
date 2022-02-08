package com.pubsub.kafkapubsub.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Configs {
    @Bean
    public NewTopic compactTopicExample() {
        return TopicBuilder.name("test_topic")
                .partitions(6)
                .replicas(3)
                .compact()
                .build();
    }
}
