package com.example.amqp.demo;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hp
 */
@Configuration
public class MQConfig {
    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory= new CachingConnectionFactory();
        connectionFactory.setHost("192.168.1.243");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        return connectionFactory;
    }
    @Bean
    public AmqpAdmin amqpAdmin() {
        RabbitAdmin amqpAdmin= new RabbitAdmin(connectionFactory());
       amqpAdmin.setIgnoreDeclarationExceptions(true);
       return amqpAdmin;
    }
    @Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(connectionFactory());
    }
    @Bean
    public Queue myQueue() {
        return new Queue("queueTestKey");
    }
    @Bean
    public Queue noUpQueue(){
        return new Queue("mits_hp_no_up_test",true);
    }

    @Bean
    public Queue progressQueue(){
        return new Queue("mits_hp_progress_test",true);
    }

    @Bean
    public Queue doneQueue(){
        return new Queue("mits_hp_done_test",true);
    }


    @Bean
    public Queue addQueue(){
        return new Queue("mits_hp_add_test",true);
    }
}
