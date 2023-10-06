package com.demo.SpringServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
