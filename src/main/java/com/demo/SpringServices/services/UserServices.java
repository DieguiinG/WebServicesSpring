package com.demo.SpringServices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringServices.entities.User;
import com.demo.SpringServices.repositories.UserRepository;
import com.demo.SpringServices.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

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
	
	public User update(	Long id, User obj){
		try {
		User entity = repository.getReferenceById(id);
		updateDate(entity, obj);
		return repository.save(entity);
		} catch(EntityNotFoundException e){
			e.printStackTrace();
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateDate(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
