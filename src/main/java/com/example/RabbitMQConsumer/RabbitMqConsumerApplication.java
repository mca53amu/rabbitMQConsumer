package com.example.RabbitMQConsumer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;

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

    @Bean
    public TestBean2 testBean2(){
        return new TestBean2();
    }

    @Bean
    public TestBean2 testBean23(){
        return new TestBean2();
    }

    @Bean
    public OncePerRequestFilter filters(){
        return new JWTSecuityFilter();
    }

}
