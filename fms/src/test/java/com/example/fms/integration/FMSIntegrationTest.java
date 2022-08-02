package com.example.fms.integration;

import com.example.fms.FmsApplication;
import com.example.fms.entity.Flight;
import com.example.fms.entity.Reservation;
import com.example.fms.entity.Traveller;
import com.example.fms.repository.ReservationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest(classes = {FmsApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource(locations = {"classpath:application-test.properties"})
public class FMSIntegrationTest {

    @Autowired
    private ReservationRepository reservationRepository;

    @Test
    public void populateTestData() {
        Traveller wasim = new Traveller("Wasim", "Khan", "M", 30);
        Traveller heena = new Traveller("Heena", "Khan", "F", 30);
        Flight flight = new Flight();
        flight.setSource("Pune");
        flight.setDestination("Delhi");
        flight.setDepartureDate(LocalDate.now());
        Reservation reservation = new Reservation(List.of(wasim, heena), flight);
        reservationRepository.save(reservation);
    }

}
