package com.example.fms.dto;

import com.example.fms.entity.Flight;

import java.util.List;

public class SearchResult {
    private final List<Flight> departFlights;
    private final List<Flight> returnFlights;

    public SearchResult(List<Flight> departFlights, List<Flight> returnFlights) {
        this.departFlights = departFlights;
        this.returnFlights = returnFlights;
    }

    public List<Flight> getDepartFlights() {
        return departFlights;
    }

    public List<Flight> getReturnFlights() {
        return returnFlights;
    }
}
