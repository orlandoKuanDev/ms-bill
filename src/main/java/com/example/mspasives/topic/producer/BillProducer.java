package com.example.mspasives.topic.producer;

import com.example.mspasives.models.entities.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BillProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    private String createdBillTopic = "created-bill-topic";

    @Autowired
    public BillProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendCreatedAccount(Bill bill) {

        kafkaTemplate.send(createdBillTopic, bill);

    }
}
