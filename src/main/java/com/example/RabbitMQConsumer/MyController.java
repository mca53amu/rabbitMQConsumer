package com.example.RabbitMQConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.AbstractRequestLoggingFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyController {

    @Resource
    private  TestBean testBean;

    @Autowired
    private List<OncePerRequestFilter> filterList;

    /*public MyController(TestBean testBean) {
        this.testBean = testBean;
    }*/

    @GetMapping("/test")
    public String test() {
        testBean.testMehodBean();
        filterList.stream().forEach(a-> System.out.println(a));
        return "success";
    }
}
