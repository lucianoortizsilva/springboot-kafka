package com.lucianoortizsilva.springboot.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.lucianoortizsilva.springboot.kafka.util.KafkaConstants;

@Configuration
class KafkaTopicConfig {

	@Bean
	public NewTopic login() {
		return TopicBuilder.name(KafkaConstants.TOPIC_LOGIN).build();
	}

	@Bean
	public NewTopic destino() {
		return TopicBuilder.name(KafkaConstants.TOPIC_DESTINO).build();
	}

	@Bean
	public NewTopic seguroViagem() {
		return TopicBuilder.name(KafkaConstants.TOPIC_SEGURO_VIAGEM).build();
	}

}