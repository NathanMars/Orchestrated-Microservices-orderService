package com.mars.microservices.order.service;

import com.mars.microservices.order.client.InventoryClient;
import com.mars.microservices.order.dto.OrderRequest;
import com.mars.microservices.order.model.Order;
import com.mars.microservices.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    public void placeOrder(OrderRequest orderRequest) {
        var isProductinStock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());

        if (!isProductinStock) {
            throw new RuntimeException("Produto fora de estoque: " + orderRequest.skuCode());
        }
        else {
            Order order = new Order();

            order.setOrderNumber(UUID.randomUUID().toString());
            order.setSkuCode(orderRequest.skuCode());
            order.setPrice(orderRequest.price());
            order.setQuantity(orderRequest.quantity());

            orderRepository.save(order);
        }
    }
}
