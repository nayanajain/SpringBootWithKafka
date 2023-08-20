package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.service.KafkaProducerService;

@RestController
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/producer")
    public String sendMessage(@RequestBody List<Employee> user)
    {
//    	System.out.print(user);
//    	System.out.print(user.size() +"size of user array");
//    	
//    	for(int i=0;i<user.size();i++)
//    	{
//    		Employee u1 = user.get(i);
        kafkaProducer.send(user);
//    	}
        return "Message sent successfully to the Kafka topic kafka-topic";
    }

}
