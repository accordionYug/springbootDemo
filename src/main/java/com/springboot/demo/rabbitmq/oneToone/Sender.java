package com.springboot.demo.rabbitmq.oneToone;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送端
 * rabbitTemplate是springboot提供的默认实现
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello" + new Date();
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
