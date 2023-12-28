package com.han.payment.service;

import com.han.payment.payload.PaymentPut;
import com.han.payment.payload.PaymentRequest;
import com.han.payment.payload.PaymentResponse;
import com.han.payment.pojo.Payment;
import com.han.payment.repository.PaymentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    private Payment getOne(UUID paymentUid) {
        return paymentRepository.findByPaymentUid(paymentUid).orElseThrow(
                () -> new EntityNotFoundException("Not found payment by uid " + paymentUid)
        );
    }

    private PaymentResponse buildPaymentResponse(Payment payment) {
        return PaymentResponse.builder()
                .paymentUid(payment.getPaymentUid())
                .price(payment.getPrice())
                .status(payment.getStatus())
                .build();
    }

    private Payment buildPayment(PaymentRequest paymentRequest) {
        Payment payment = new Payment();
        payment.setPaymentUid(paymentRequest.getPaymentUid());
        payment.setPrice(paymentRequest.getPrice());
        payment.setStatus(paymentRequest.getStatus());
        return payment;
    }

    @Override
    public PaymentResponse createPayment(PaymentRequest paymentRequest) {
        return buildPaymentResponse(paymentRepository.save(buildPayment(paymentRequest)));
    }

    @Override
    public PaymentResponse updatePayment(UUID paymentUid, PaymentPut paymentPut) {
        Payment payment = getOne(paymentUid);
        payment.setStatus(paymentPut.getStatus());
        return buildPaymentResponse(paymentRepository.save(payment));
    }

    @Override
    public PaymentResponse getPayment(UUID paymentUid) {
        return buildPaymentResponse(getOne(paymentUid));
    }
}
