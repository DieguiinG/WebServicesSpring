package com.demo.SpringServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringServices.entities.Category;


public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
