package com.han.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
@AllArgsConstructor
public class Car {

    private Integer id;

    private UUID carUid;

    private String brand;

    private String model;

    private String registrationNumber;

    private Integer power;

    private Integer price;

    private String type;

    private Boolean availability;
}
