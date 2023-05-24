package edu.miu.onlineretailsytemclient.kafkaReceiver;

import org.springframework.kafka.annotation.KafkaListener;

public class MessageListener {


    @KafkaListener(topics = {"deliverOrder"})
    public void handleMessage(String receivedMessage) {
        System.out.println("sss");

        System.out.println(receivedMessage);

    }
}
