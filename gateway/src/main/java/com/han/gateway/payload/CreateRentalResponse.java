package com.han.gateway.payload;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class CreateRentalResponse {
    private UUID rentalUid;
    private UUID carUid;
    private PaymentInfoResponse payment;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String status;
}
