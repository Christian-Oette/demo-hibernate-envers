package com.christianoette.database;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Long> {

    default Order findByIdOrThrow(Long id) {
        Optional<Order> orderOptional = findById(id);
        return orderOptional.orElseThrow(() -> new IllegalArgumentException("Order with id " + id + " not found"));
    }
}
