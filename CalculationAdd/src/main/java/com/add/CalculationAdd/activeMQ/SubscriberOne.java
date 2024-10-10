package com.add.CalculationAdd.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriberOne {

    //тут слушаем сообщения из топика
    @JmsListener(destination = "example.topic.test", containerFactory = "topicListenerContainerFactory")
    public void receiveMessage(String message) {
        System.out.println("Услышали сообщение:  " + message + " в subOne");
    }
}
