package com.lucianoortizsilva.springboot.kafka.components;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.lucianoortizsilva.springboot.kafka.payload.User;
import com.lucianoortizsilva.springboot.kafka.util.KafkaConstants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
class KafkaListeners {

	@KafkaListener(groupId = KafkaConstants.GROUP_VIAGEM, topics = { KafkaConstants.TOPIC_LOGIN, KafkaConstants.TOPIC_DESTINO, KafkaConstants.TOPIC_SEGURO_VIAGEM }, containerFactory = "kafkaJsonListenerContainerFactory")
	void listener(final Message<User> message) {
		log.info("Mensagem recebida:");
		log.info("Topic: {}", message.getHeaders().get("kafka_receivedTopic"));
		log.info("payload: {}", message.getPayload());
		log.info("");
		log.info("-----------------------------------------------------");
		log.info("");
	}

}