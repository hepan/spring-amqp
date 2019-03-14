package com.example.amqp.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author hp
 */
@Service
public class MessageConsumer {

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @RabbitListener(queues = "mits_hp_no_up_test")
    public void onMessageNoUp(Message message) {
        logger.info("------消费者处理消息  mits_hp_no_up_test------ receive message {} " ,new String(message.getBody()) );


//        throw new NullPointerException();
    }


    @RabbitListener(queues = "mits_hp_progress_test")
    public void onMessageProgress(Message message) {
        logger.info("------消费者处理消息  mits_hp_progress_test------ receive message {} " ,new String(message.getBody()) );


        throw new NullPointerException();
    }
    @RabbitListener(queues = "mits_hp_done_test")
    public void onMessageDone(Message message) {
        logger.info("------消费者处理消息  mits_hp_done_test------ receive message {} " ,new String(message.getBody()) );


//        throw new NullPointerException();
    }
    @RabbitListener(queues = "mits_hp_add_test")
    public void onMessageAdd(Message message) {
        logger.info("------消费者处理消息  mits_hp_add_test------ receive message {} " ,new String(message.getBody()) );


//        throw new NullPointerException();
    }



}
