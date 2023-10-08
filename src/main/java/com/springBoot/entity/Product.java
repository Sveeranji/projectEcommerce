package com.springBoot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Column(name="product_id")
	@Id
	private Integer id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="product_quantity")
	private Integer quantity;
	
	@Column(name="product_price")
	private long price;
	
	@Column(name="product_discount")
	private float discount;
	
	@Column(name="product_description")
	private String description;
	
	@Column(name="product_brand")
	private String brand;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", discount="
				+ discount + ", description=" + description + ", brand=" + brand + "]";
	}

	public Product(Integer id, String name, Integer quantity, long price, float discount, String description,
			String brand) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.description = description;
		this.brand = brand;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
