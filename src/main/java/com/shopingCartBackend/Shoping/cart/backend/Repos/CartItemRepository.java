package com.shopingCartBackend.Shoping.cart.backend.Repos;

import com.shopingCartBackend.Shoping.cart.backend.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
