package com.shopingCartBackend.Shoping.cart.backend.Repos;

import com.shopingCartBackend.Shoping.cart.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
