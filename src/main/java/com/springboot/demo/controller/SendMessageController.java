package com.springboot.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.kafka.support.SendResult;

/**
 * kafka发送消息
 */

@RestController
public class SendMessageController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("send/{messsage}")
    public void send(@PathVariable String message){
        ListenableFuture<SendResult<String,String>> future = kafkaTemplate.send("test",message);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable throwable) {
                logger.error("消息: {} 发送失败 原因：{}",message,throwable.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, String> result) {
                logger.info("成功发送消息:{},offset=[{}]",message,result.getRecordMetadata());
            }
        });
    }
}
