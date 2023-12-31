	
	package com.example.demo.config;

	import org.apache.kafka.clients.producer.ProducerConfig;
	import org.apache.kafka.common.serialization.StringSerializer;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
	import org.springframework.kafka.core.KafkaTemplate;
	import org.springframework.kafka.core.ProducerFactory;
	import org.springframework.kafka.support.serializer.JsonSerializer;

import com.example.demo.model.Employee;

import java.util.HashMap;
import java.util.Map;

	@Configuration
	@EnableKafka
	public class KafkaProducerConfig {
	    private final Logger LOG = LoggerFactory.getLogger(getClass());
	    @Value("${kafka.bootstrap-servers}")
	    private String bootstrapServers;

	    @Bean
	    public ProducerFactory<String, ?> userProducerFactory() {
	        Map<String, Object> configProps = new HashMap<>();
	        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
	        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
	        return new DefaultKafkaProducerFactory<>(configProps);
	    }

	   
	    @Bean
	    public KafkaTemplate<String, ?> kafkaTemplate() {
	        return new KafkaTemplate<>(userProducerFactory());
	}
	}


