package com.example.fms.repository;

import com.example.fms.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface FLightRepository extends JpaRepository<Flight, String> {
    List<Flight> findBySourceAndDestinationAndDepartureDateOrderByFare(String source, String destination, LocalDate departureDate);
}
