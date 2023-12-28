package com.han.gateway.payload;


import com.han.gateway.model.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Data
public class RentalResponse {
    private Integer id;
    private UUID rentalUid;
    private String username;
    private UUID paymentUid;
    private UUID carUid;
    /*private Car car;*/
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String status;
}
