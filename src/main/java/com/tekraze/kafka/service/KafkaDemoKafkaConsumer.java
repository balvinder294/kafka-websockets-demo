package com.tekraze.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaDemoKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(KafkaDemoKafkaConsumer.class);
    private static final String TOPIC = "topic_kafkademo";

    @KafkaListener(topics = "topic_kafkademo", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
