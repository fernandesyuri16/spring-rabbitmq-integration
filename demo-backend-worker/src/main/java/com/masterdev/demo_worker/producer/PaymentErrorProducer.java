package com.masterdev.demo_worker.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentErrorProducer {
    @Autowired AmqpTemplate amqpTemplate;

    public void generateResponse(String message) {
        amqpTemplate.convertAndSend(
                "payment-response-error-exchange",
                "payment-request-error-rout-key",
                message
        );
    }
}
