package com.shopingCartBackend.Shoping.cart.backend.dto;
import lombok.Data;

import com.shopingCartBackend.Shoping.cart.backend.model.Cart;
import com.shopingCartBackend.Shoping.cart.backend.model.Order;
import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}