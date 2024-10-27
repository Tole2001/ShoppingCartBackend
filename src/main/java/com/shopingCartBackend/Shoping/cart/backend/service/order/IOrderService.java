package com.shopingCartBackend.Shoping.cart.backend.service.order;

import com.shopingCartBackend.Shoping.cart.backend.dto.OrderDto;
import com.shopingCartBackend.Shoping.cart.backend.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
