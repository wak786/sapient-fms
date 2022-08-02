package com.example.fms.controller;

import com.example.fms.dto.BookingRequest;
import com.example.fms.entity.Traveller;
import com.example.fms.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public void createBooking(@RequestBody BookingRequest request){
        bookingService.createBooking(request.getFlightId(), request.getTravellers(), request.getLoggedInUserId());
    }
}
