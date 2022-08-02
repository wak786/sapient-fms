package com.example.fms.utilities;

import com.example.fms.entity.Flight;
import com.example.fms.entity.Reservation;
import com.example.fms.entity.Traveller;
import com.example.fms.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

public class Helper {

    public static void main(String[] args) {
        Traveller wasim = new Traveller("Wasim", "Khan", "M", 30);
        Traveller heena = new Traveller("Heena", "Khan", "F", 30);
        Flight flight = new Flight();
        flight.setSource("Pune");
        flight.setDestination("Delhi");
        flight.setDepartureDate(LocalDate.now());
        Reservation reservation = new Reservation(List.of(wasim, heena), flight);

    }
}
