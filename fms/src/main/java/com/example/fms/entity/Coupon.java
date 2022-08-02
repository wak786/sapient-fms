package com.example.fms.entity;

import com.example.fms.enums.Badge;

import javax.persistence.*;

@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String couponId;
    private Integer discountPercentage;
    private Integer maxDiscount;
    private Integer minimumFare;
    @Enumerated(EnumType.STRING)
    private Badge badge;

    public String getCouponId() {
        return couponId;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public Integer getMaxDiscount() {
        return maxDiscount;
    }

    public Integer getMinimumFare() {
        return minimumFare;
    }

    public void setCouponId(String coupanId) {
        this.couponId = coupanId;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setMaxDiscount(Integer maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public void setMinimumFare(Integer minimumFare) {
        this.minimumFare = minimumFare;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }
}
