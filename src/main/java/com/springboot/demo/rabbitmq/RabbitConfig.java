package com.springboot.demo.rabbitmq;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**\
 * rabbitmq 配置
 */

@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }

    @Bean
    public Queue Queue1(){
        return new Queue("neo");
    }
}
