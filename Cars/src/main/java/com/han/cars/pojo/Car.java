package com.han.cars.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "car_uid",nullable = false, unique = true)
    private UUID carUid;

    @Column(nullable = false, length = 80)
    private String brand;

    @Column(nullable = false,length = 80)
    private String model;

    @Column(nullable = false,length = 20)
    private String registrationNumber;

    @Column()
    private Integer power;

    @Column(nullable = false)
    private Integer price;

    @Column(columnDefinition = "VARCHAR(20) CHECK (type IN ('SEDAN', 'SUV', 'MINIVAN', 'ROADSTER'))")
    private String type;

    @Column(nullable = false)
    private Boolean availability;
}
