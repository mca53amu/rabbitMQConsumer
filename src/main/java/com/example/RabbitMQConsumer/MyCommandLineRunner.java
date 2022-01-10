package com.example.RabbitMQConsumer;

import com.rabbitmq.client.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private Channel channel;

    @Override
    public void run(String... args) throws Exception {
        channel.basicConsume("test_queue", new RMQConsumer(channel));
        System.out.println("Hi");
    }
}
