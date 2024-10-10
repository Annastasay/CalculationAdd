package com.add.CalculationAdd.activeMQ;

import jakarta.jms.JMSException;
import jakarta.jms.Topic;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageSend {
    private final Topic topic;
    private final JmsTemplate jmsTemplate;

    public void sendMessageToQueue(String destination, String message) {
        System.out.println("Sending message " + message + " to destination " + destination);
        jmsTemplate.convertAndSend(destination, message);
    }

    public void sendMessageToTopic(String message) throws JMSException{
        System.out.println("Sending message " + message + " to destination " + topic.getTopicName());
        jmsTemplate.convertAndSend(topic, message);
    }
}
