package com.connectsoftware.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectsoftware.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
