package com.han.cars.payload.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;
@Data
@AllArgsConstructor
public class CarRequest {
    @NotNull
    private UUID carUid;
    @NotBlank
    private String brand;
    @NotBlank
    private String model;
    @NotBlank
    private String registrationNumber;
    @NotNull
    private Integer power;
    @NotNull
    private Integer price;
    @NotBlank
    private String type;
    @NotNull
    private Boolean availability;
}
