package com.demo.SpringServices.entities;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_order_item")
public class OrdemItem implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@EmbeddedId
	private OrderItemPK id;

	private Integer quantity;
	private Double price;

	public OrdemItem() {

	}

	public OrdemItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;

	}

	public OrdemItem(OrderItemPK id) {
		super();
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Order getOrder() {
		return id.getOrder();
	}

	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Order product) {
		id.setOrder(product);
	}


}
