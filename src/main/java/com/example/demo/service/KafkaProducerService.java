package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class KafkaProducerService {
    private final Logger LOG = LoggerFactory.getLogger(KafkaProducerService.class);
    @Autowired
    private KafkaTemplate<String, List<Employee>> kafkaTemplate;

    String kafkaTopic = "kafka-topic";

    public void send(List<Employee> user) {
        LOG.info("Sending User Json Serializer : {}", user);
        kafkaTemplate.send(kafkaTopic, user);
    }
}