package com.example.RabbitMQConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.filter.OncePerRequestFilter;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestMyController {

    @InjectMocks
    private MyController myController;
    @Mock
    private TestBean testBean;

    @Mock
    private List<OncePerRequestFilter> filterList;


    @Test
    public void test(){
        myController.test();
    }
}
