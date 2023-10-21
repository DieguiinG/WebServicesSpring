package com.demo.SpringServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringServices.entities.OrderItem;


public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
