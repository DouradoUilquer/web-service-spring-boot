package com.connectsoftware.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectsoftware.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
