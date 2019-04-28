package com.springboot.demo;


import com.springboot.demo.rabbitmq.many.NeoSender1;
import com.springboot.demo.rabbitmq.many.NeoSender2;
import com.springboot.demo.rabbitmq.oneToone.Receiver;
import com.springboot.demo.rabbitmq.oneToone.Sender;
import com.springboot.demo.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *  rabbitmq测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class RabbitMqHelloTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Sender sender;

    @Autowired
    private NeoSender1 neoSender1;

    @Autowired
    private NeoSender2 neoSender2;

    @Autowired
    private TopicSender topicSender;

    @Autowired
    private Receiver receiver;

    @Test
    public void helloTest() throws Exception{
        logger.info("发送=");
        sender.send();
        logger.info("---");
        System.out.println();
//        logger.info("接收==");
////        receiver.process();
    }

    /**
     * 一个发送 两个接收
     * @throws Exception
     */
    @Test
    public void oneToMant() throws Exception{
        for (int i=0;i<100;i++){
            neoSender1.send(i);
        }
    }

    /**
     * 多个发送多个接收
     */
    @Test
    public void manyToMany() throws Exception{
        for (int i=0; i< 100;i++){
            neoSender1.send(i);
            neoSender2.send(i);
        }
    }

    @Test
    public void TopicTest() throws Exception{
        topicSender.send();
        topicSender.send1();
        topicSender.send2();
    }
}
