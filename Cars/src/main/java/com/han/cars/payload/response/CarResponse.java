package com.han.cars.payload.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
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
