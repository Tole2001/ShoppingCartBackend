package com.shopingCartBackend.Shoping.cart.backend.service.cart;

import com.shopingCartBackend.Shoping.cart.backend.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    Cart getCartByUserId(Long userId);
}
