package com.han.gateway.payload;


import com.han.gateway.model.Car;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class RentalLongResponse {

    private UUID rentalUid;
    private PaymentResponse payment;
    private Car car;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String status;

}
