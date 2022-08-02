package com.example.fms.dto;

import com.example.fms.entity.Traveller;

import java.util.List;

public class BookingRequest {

    private final String flightId;
    private final List<Traveller> travellers;
    private final String loggedInUserId;

    public BookingRequest(String flightId, List<Traveller> travellers, String loggedInUserId) {
        this.flightId = flightId;
        this.travellers = travellers;
        this.loggedInUserId = loggedInUserId;
    }

    public String getFlightId() {
        return flightId;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public String getLoggedInUserId() {
        return loggedInUserId;
    }
}
