package com.han.gateway.payload;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class RentalShortResponse {
    private UUID rentalUid;
    private PaymentInfoResponse payment;
    /*private CarShortResponse car;*/
    private UUID carUid;
    private String username;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String status;
}
