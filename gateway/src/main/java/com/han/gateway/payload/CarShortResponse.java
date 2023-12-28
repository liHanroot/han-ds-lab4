package com.han.gateway.payload;


import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CarShortResponse {
    private UUID carUid;
    private String brand;
    private String model;
}
