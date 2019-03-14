package com.example.amqp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author hp
 */
@Service
public class MessageProducer {
    private Logger logger = LoggerFactory.getLogger(MessageProducer.class);
//    @Resource
//    private AmqpTemplate amqpTemplate;
//
//
//
//    public void sendMessage(Object message) {
//        logger.info("发送消息");
//        logger.info("to send message:",message);
//        amqpTemplate.convertAndSend("queueTestKey",message);
//    }

}
