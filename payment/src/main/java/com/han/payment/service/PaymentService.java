package com.han.payment.service;

import com.han.payment.payload.PaymentPut;
import com.han.payment.payload.PaymentRequest;
import com.han.payment.payload.PaymentResponse;

import java.util.UUID;

public interface PaymentService {
    PaymentResponse createPayment(PaymentRequest paymentRequest);

    PaymentResponse updatePayment(UUID paymentUid, PaymentPut paymentPut);

    PaymentResponse getPayment(UUID paymentUid);
}
