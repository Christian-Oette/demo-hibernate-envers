package com.christianoette.services;

import com.christianoette.database.Order;
import com.christianoette.database.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDto getOrderById(Long id) {
        Order order = orderRepository.findByIdOrThrow(id);
        return new OrderDto(order);
    }

    @Transactional
    public OrderDto createNewOrder(Article article) {
        Order order = new Order(article);
        orderRepository.save(order);

        return new OrderDto(order);
    }

    @Transactional
    public void updateExistingOrder(OrderDto orderDto) {
        Order order = orderRepository.findByIdOrThrow(orderDto.id);
        order.updateArticle(orderDto.article);
        order.updateDescription(orderDto.description);
    }
}
