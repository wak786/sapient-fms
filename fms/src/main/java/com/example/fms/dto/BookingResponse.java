package com.example.fms.dto;

import com.example.fms.entity.Coupon;

import java.util.List;

public class BookingResponse {

    private final Integer fare;
    private final List<Coupon> coupons;

    public BookingResponse(Integer fare, List<Coupon> coupons) {
        this.fare = fare;
        this.coupons = coupons;
    }

    public Integer getFare() {
        return fare;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }
}
