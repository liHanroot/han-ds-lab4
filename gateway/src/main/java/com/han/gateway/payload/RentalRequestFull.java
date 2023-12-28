package com.han.gateway.payload;


import com.han.gateway.model.Car;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Data
public class RentalRequestFull {
    @NotNull
    private UUID rentalUid;
    @NotNull
    private UUID paymentUid;
    @NotNull
    private Car car;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    @NotBlank
    private String status;
}
