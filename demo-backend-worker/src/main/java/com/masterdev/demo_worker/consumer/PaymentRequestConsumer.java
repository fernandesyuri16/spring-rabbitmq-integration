package com.masterdev.demo_worker.consumer;

import com.masterdev.demo_worker.producer.PaymentErrorProducer;
import com.masterdev.demo_worker.producer.PaymentSuccessProducer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PaymentRequestConsumer {
    @Autowired private PaymentErrorProducer errorProducer;
    @Autowired private PaymentSuccessProducer successProducer;

    @RabbitListener(queues = {"payment-request-queue"})
    public void receiveMessage(@Payload Message message) {
        System.out.println(message);

        //Simulando pagamentos para validar o fluxo
        if (new Random().nextBoolean()) {
            successProducer.generateResponse("Mensagem de sucesso" + message);
        } else {
            errorProducer.generateResponse("Mensagem de erro" + message);
        }
    }
}
