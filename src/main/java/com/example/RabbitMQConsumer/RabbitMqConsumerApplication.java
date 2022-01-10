package com.example.RabbitMQConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import javax.sound.midi.Receiver;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class RabbitMqConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqConsumerApplication.class, args);

	}

	@Bean
	public Channel channel() throws IOException, TimeoutException {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setRequestedHeartbeat(10);
		factory.setAutomaticRecoveryEnabled(true);
		factory.setTopologyRecoveryEnabled(true);
		factory.setHost("localhost");
		factory.setPort(5672);
		Connection connection = factory.newConnection();
		return connection.createChannel();
	}


}
