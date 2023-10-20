package com.demo.SpringServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringServices.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Long>{

}
