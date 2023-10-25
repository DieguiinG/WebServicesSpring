package com.demo.SpringServices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringServices.entities.User;
import com.demo.SpringServices.repositories.UserRepository;
import com.demo.SpringServices.services.exceptions.ResourceNotFoundException;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	public User insert(User obj){
		return repository.save(obj);
	}
	
	public void delete(Long id){
		repository.deleteById(id);
	}
}
