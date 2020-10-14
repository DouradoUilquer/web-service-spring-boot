package com.connectsoftware.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectsoftware.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
