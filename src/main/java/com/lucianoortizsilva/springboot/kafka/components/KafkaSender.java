package com.lucianoortizsilva.springboot.kafka.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.lucianoortizsilva.springboot.kafka.payload.User;

@Component
class KafkaSender {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	void sendMessage(final User message, final String topicName) {
		kafkaTemplate.send(topicName, message);
	}

}