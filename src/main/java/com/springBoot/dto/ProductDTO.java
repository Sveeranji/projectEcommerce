package com.springBoot.dto;



public class ProductDTO {
	
	private Integer id;
		private String name;
		private Integer quantity;
		private long price;
		private float discount;
		private String description;
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
		return "ProductDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", discount="
				+ discount + ", description=" + description + ", brand=" + brand + "]";
	}

	public ProductDTO(Integer id, String name, Integer quantity, long price, float discount, String description,
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

	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
