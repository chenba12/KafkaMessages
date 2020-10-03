package com.example.kafkaMessages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaMessagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaMessagesApplication.class, args);
		System.out.println("Kafka messaging server ready to go!");
	}

}
