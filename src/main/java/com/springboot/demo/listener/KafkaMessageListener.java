package com.springboot.demo.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费
 */
//@Component
//public class KafkaMessageListener {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @KafkaListener(topics = "test",groupId = "test-consumer")
//    public void listen(String message){
//        logger.info("接收消息：{}",message);
//    }
//
//
//}
