package com.lucianoortizsilva.springboot.kafka.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import com.lucianoortizsilva.springboot.kafka.payload.User;
import com.lucianoortizsilva.springboot.kafka.util.KafkaConstants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class InicializaTesteEnvio {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	@EventListener
	void initiateSendingMessage(final ApplicationReadyEvent event) throws InterruptedException {

		Thread.sleep(7000);
		final Message<User> message1 = new GenericMessage<>(new User(1, "Luciano"));
		this.kafkaTemplate.setDefaultTopic(KafkaConstants.TOPIC_LOGIN);
		log.info("Mensagem Enviada: {}", message1);
		this.kafkaTemplate.send(message1);

		Thread.sleep(7000);
		final Message<User> message2 = new GenericMessage<>(new User(1, "Luciano"));
		this.kafkaTemplate.setDefaultTopic(KafkaConstants.TOPIC_DESTINO);
		log.info("Mensagem Enviada: {}", message2);
		this.kafkaTemplate.send(message2);

		Thread.sleep(7000);
		final Message<User> message3 = new GenericMessage<>(new User(1, "Luciano"));
		this.kafkaTemplate.setDefaultTopic(KafkaConstants.TOPIC_SEGURO_VIAGEM);
		log.info("Mensagem Enviada: {}", message3);
		this.kafkaTemplate.send(message3);

	}

}