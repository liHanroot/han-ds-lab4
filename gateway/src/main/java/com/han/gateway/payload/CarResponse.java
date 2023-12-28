package com.han.gateway.payload;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@Setter
public class CarResponse {
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
