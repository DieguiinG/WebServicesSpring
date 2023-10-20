package com.demo.SpringServices.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringServices.entities.Product;
import com.demo.SpringServices.services.ProductServices;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductServices service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> findById(@PathVariable (value="id") Long id){
		Object orderobj = service.findById(id);
		return ResponseEntity.ok().body(orderobj);
	}

}
