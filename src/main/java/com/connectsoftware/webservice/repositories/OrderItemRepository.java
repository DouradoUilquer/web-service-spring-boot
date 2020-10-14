package com.connectsoftware.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectsoftware.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
