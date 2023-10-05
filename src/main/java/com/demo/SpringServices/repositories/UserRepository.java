package com.demo.SpringServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringServices.entities.User;


public interface UserRepository  extends JpaRepository<User, Long>{

}
