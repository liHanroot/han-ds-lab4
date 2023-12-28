package com.han.gateway.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
@AllArgsConstructor
@Data
public class CreateRentalRequest {
    private UUID carUid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTo;
}
