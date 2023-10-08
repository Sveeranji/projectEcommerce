package com.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.dto.ProductDTO;
import com.springBoot.services.ServiceIMP;
import com.springBoot.services.ServiceInterface;

@SpringBootApplication
public class SpringProject2Application implements CommandLineRunner {
	@Autowired
	private ServiceInterface ServiceInterface;

	public static void main(String[] args) {
		SpringApplication.run(SpringProject2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		addProduct();
		productByID();
//		update();
//		deleteByID();
	}
	
	

	

	public void addProduct() 
	{
		System.out.println("new Product");
		ProductDTO p=new ProductDTO();
		
	p.setId(1);
	p.setName("Motorola edge 40");
	p.setQuantity(10);
	p.setPrice(30000);
	p.setDiscount(10.00f);
	p.setDescription("this is maotorola smart phone with IPS68");
	p.setBrand("Motorola");
	ServiceInterface.addProduct(p);
	System.out.println(p);
		
	}
	
	public void productByID() {
		Integer prodctID=1;
		ProductDTO dto=ServiceInterface.findByID(prodctID);
		System.out.println(dto);
		
	}
	public void update() {
		ProductDTO dto=new ProductDTO();
		dto.setName("redmi");
		dto.setPrice(200000);
		dto.setDiscount(20);
		System.out.println(ServiceInterface.updateByID(dto, 1));
		
	}
	
	public void deleteByID() {
		Integer productID=1;
		ProductDTO dto=ServiceInterface.deleteByID(productID);
		System.out.println("product details are deleted by this id "+productID);
		
	}

}
