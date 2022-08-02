package com.example.fms.service;

import com.example.fms.dto.BookingResponse;
import com.example.fms.entity.*;
import com.example.fms.repository.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookingService {
    private final TravellerRepository travellerRepository;
    private final ReservationRepository reservationRepository;
    private final FLightRepository fLightRepository;
    private final UserRepository userRepository;
    private final CouponRepository couponRepository;

    public BookingService(TravellerRepository travellerRepository, ReservationRepository reservationRepository, FLightRepository fLightRepository, UserRepository userRepository, CouponRepository couponRepository) {
        this.travellerRepository = travellerRepository;
        this.reservationRepository = reservationRepository;
        this.fLightRepository = fLightRepository;
        this.userRepository = userRepository;
        this.couponRepository = couponRepository;
    }

    @Transactional
    public BookingResponse createBooking(String flightId, List<Traveller> travellers, String loggedInUserId) {
        Flight flight = fLightRepository.findById(flightId).get();
        List<Traveller> savedTravellers = travellerRepository.saveAll(travellers);
        Reservation reservation = new Reservation(savedTravellers, flight);
        reservationRepository.save(reservation);
        User user = userRepository.findById(loggedInUserId).get();
        List<Coupon> coupons = couponRepository.findByBadge(user.getBadge());
        return new BookingResponse(flight.getFare(), coupons);
    }
}
