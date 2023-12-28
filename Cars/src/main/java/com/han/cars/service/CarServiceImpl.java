package com.han.cars.service;

import com.han.cars.payload.request.CarRequest;
import com.han.cars.payload.response.CarResponse;
import com.han.cars.payload.response.PaginationResponse;
import com.han.cars.pojo.Car;
import com.han.cars.repository.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    private CarResponse buildCarResponse(Car car){
        return CarResponse.builder()
                .id(car.getId())
                .carUid(car.getCarUid())
                .brand(car.getBrand())
                .model(car.getModel())
                .registrationNumber(car.getRegistrationNumber())
                .power(car.getPower())
                .price(car.getPrice())
                .type(car.getType())
                .availability(car.getAvailability())
                .build();

    }

    private Car buildCar(CarRequest request){
        Car car = new Car();
        car.setCarUid(request.getCarUid());
        car.setBrand(request.getBrand());
        car.setModel(request.getModel());
        car.setRegistrationNumber(request.getRegistrationNumber());
        car.setPower(request.getPower());
        car.setPrice(request.getPrice());
        car.setType(request.getType());
        car.setAvailability(request.getAvailability());
        return car;
    }

    @Override
    public PaginationResponse getCars(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<CarResponse> pageResponse = carRepository.findAll(pageable).map(this::buildCarResponse);
        List<CarResponse> items = new ArrayList<>(pageResponse.getContent());

        return PaginationResponse.builder()
                .items(items)
                .page(page)
                .pageSize(size)
                .totalElements(pageResponse.getTotalElements())
                .build();
    }

    @Override
    public boolean existsByCarUid(UUID carUid) {
        return carRepository.existsByCarUid(carUid);
    }

    @Override
    public CarResponse getCar(UUID carUid) {
        return buildCarResponse(carRepository.findByCarUid(carUid).orElseThrow(
                () -> new EntityNotFoundException("Not found car uid " + carUid)
        ));
    }
}
