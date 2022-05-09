package com.christianoette.controller;

import com.christianoette.services.Article;
import com.christianoette.services.OrderDto;
import com.christianoette.services.OrderService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class ApiController {

    private final OrderService orderService;

    public ApiController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public OrderDto createNewOrder(@RequestParam Article article) {
        return orderService.createNewOrder(article);
    }

    @PutMapping("/order")
    public void getOrderById(@RequestBody OrderDto dto) {
        orderService.updateExistingOrder(dto);
    }

    @GetMapping("/order/{id}")
    public OrderDto getOrderById(@PathVariable(value = "id") Long id) {
        return orderService.getOrderById(id);
    }
}
