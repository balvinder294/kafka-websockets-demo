package com.tekraze.kafka.web.rest;

import com.tekraze.kafka.service.KafkaDemoKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/kafka-demo-kafka")
public class KafkaDemoKafkaResource {

    private final Logger log = LoggerFactory.getLogger(KafkaDemoKafkaResource.class);

    private KafkaDemoKafkaProducer kafkaProducer;

    public KafkaDemoKafkaResource(KafkaDemoKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
