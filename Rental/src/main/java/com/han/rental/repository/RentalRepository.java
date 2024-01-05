package com.han.rental.repository;

import com.han.rental.pojo.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {

    Optional<Rental> findByUsername(String username);

    Optional<Rental> findByRentalUid(UUID rentalUid);

    List<Rental> findAllByUsername(String username);

}
