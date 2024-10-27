package com.shopingCartBackend.Shoping.cart.backend.dto;

import java.math.BigDecimal;
import com.shopingCartBackend.Shoping.cart.backend.model.Product;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
