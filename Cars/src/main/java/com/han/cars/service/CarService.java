package com.han.cars.service;

import com.han.cars.payload.response.CarResponse;
import com.han.cars.payload.response.PaginationResponse;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public interface CarService {
    PaginationResponse getCars(Integer page, Integer size);

    boolean existsByCarUid(UUID carUid);

    CarResponse getCar(UUID carlUid);
}
