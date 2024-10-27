package com.shopingCartBackend.Shoping.cart.backend.Repos;

import com.shopingCartBackend.Shoping.cart.backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUserId(Long userId);
}
