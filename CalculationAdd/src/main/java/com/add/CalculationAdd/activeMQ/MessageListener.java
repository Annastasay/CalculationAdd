package com.add.CalculationAdd.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    //тут слушаем сообщения из очереди
    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        System.out.println("Receive message " + message);
    }
}
