package com.masterdev.demo_backend.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.masterdev.demo_backend.dto.PaymentDTO;
import com.masterdev.demo_backend.producer.PaymentRequestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentFacade {
    @Autowired private PaymentRequestProducer producer;

    public String paymentRequest(PaymentDTO request) {
        try {
            producer.integration(request);
        } catch (JsonProcessingException e) {
            return "Ocorreu um erro ao solicitar pagamento..." + e.getMessage();
        }
        return "Pagamento aguardando confirmação...";
    }

    public void errorPayment(String payload) {
        System.err.println("============ ERROR ============" + payload);
    }

    public void successPayment(String payload) {
        System.out.println("============ SUCCESS ============" + payload);
    }
}
