package com.connectsoftware.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectsoftware.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
