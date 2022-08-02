package com.example.fms.repository;

import com.example.fms.entity.Coupon;
import com.example.fms.enums.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, String> {
    List<Coupon> findByBadge(Badge badge);
}
