package com.demo.SpringServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringServices.entities.User;

@RestController
@RequestMapping( value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l,"Maria","maria@gmail.com","99-9999-9999","123bf");
		return ResponseEntity.ok().body(u);
	}
	
}
