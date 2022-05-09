package com.christianoette.services;

import com.christianoette.database.Order;

public class OrderDto {
    public Long id;
    public Article article;
    public String description;

    public OrderDto() {

    }

    public OrderDto(Order order) {
        this.id = order.getId();
        this.article = order.getArticle();
        this.description = order.getDescription();
    }
}
