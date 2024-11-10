package com.masterdev.demo_backend.consumer;

import com.masterdev.demo_backend.facade.PaymentFacade;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PaymentResponseSuccessConsumer {
    @Autowired private PaymentFacade paymentFacade;

    @RabbitListener(queues = { "payment-response-success-queue" } )
    public void receive(@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        paymentFacade.successPayment(payload);
    }
}
