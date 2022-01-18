package com.example.RabbitMQConsumer;

import org.springframework.stereotype.Component;

@Component
public class TestBean {


    public TestBean(TestBean2 testBean2){
        System.out.println(testBean2);
    }

    public void testMehodBean() {
        System.out.println("I am Mr bean");
    }

}
