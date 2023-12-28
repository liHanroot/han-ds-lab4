package com.han.cars.repository;


import com.han.cars.pojo.Car;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface CarRepository extends PagingAndSortingRepository<Car, Integer> {

    Optional<Car> findByCarUid(UUID car);

    boolean existsByCarUid(UUID carUid);

}
