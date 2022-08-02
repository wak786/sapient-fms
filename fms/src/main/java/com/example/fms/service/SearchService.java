package com.example.fms.service;

import com.example.fms.dto.SearchResult;
import com.example.fms.entity.Flight;
import com.example.fms.repository.FLightRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

@Service
public class SearchService {
    private final FLightRepository flightRepository;

    public SearchService(FLightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public SearchResult searchFlights(String source, String destination, String departureDate, String returnDate) {
        List<Flight> flights = flightRepository.findBySourceAndDestinationAndDepartureDateOrderByFare(source, destination, LocalDate.parse(departureDate));
        flights.sort(comparing(Flight::getDuration,Comparator.reverseOrder()));
        return new SearchResult(flights, getReturnFlights(source, destination, returnDate));
    }

    private List<Flight> getReturnFlights(String source, String destination, String returnDate) {
        if (Optional.ofNullable(returnDate).isPresent()){
            List<Flight> flights = flightRepository.findBySourceAndDestinationAndDepartureDateOrderByFare(destination, source, LocalDate.parse(returnDate));
            flights.sort(comparing(Flight::getDuration,Comparator.reverseOrder()));
            return flights;
        }
        return Collections.emptyList();
    }
}
