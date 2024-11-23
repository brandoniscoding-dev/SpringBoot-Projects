package com.brandoniscoding.shops.service.order;

import com.brandoniscoding.shops.dto.OrderDto;
import com.brandoniscoding.shops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
