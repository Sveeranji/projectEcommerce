package com.springBoot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.dto.ProductDTO;
import com.springBoot.entity.Product;
import com.springBoot.repository.RepositoryInterface;

@Service(value="ServiceInterface")
public class ServiceIMP implements ServiceInterface{
	@Autowired
	private RepositoryInterface RepositoryInterface;

	@Override
	public String addProduct(ProductDTO ProductInfoByUser) {
		Product p=new Product();
		p.setId(ProductInfoByUser.getId());
		
//		Integer i=ProductInfoByUser.getId();
		
		p.setName(ProductInfoByUser.getName());
		p.setQuantity(ProductInfoByUser.getQuantity());
		p.setPrice(ProductInfoByUser.getPrice());
		p.setDiscount(ProductInfoByUser.getDiscount());
		p.setDescription(ProductInfoByUser.getDescription());
		p.setBrand(ProductInfoByUser.getBrand());
		RepositoryInterface.save(p);
		return "product added successfully ";
	}

	@Override
	public ProductDTO findByID(Integer id) {
		Optional<Product> opt= RepositoryInterface.findById(id);
		Product p=opt.orElseThrow(()->new RuntimeException("no product found with this id"+id));
		ProductDTO dto=new ProductDTO();
		dto.setId(p.getId());
		dto.setName(p.getName());
		dto.setQuantity(p.getQuantity());
		dto.setPrice(p.getPrice());
		dto.setDiscount(p.getDiscount());
		dto.setDescription(p.getDescription());
		dto.setBrand(p.getBrand());
		return dto;
	}

	@Override
	public String updateByID(ProductDTO dto,Integer id) {
		Optional<Product> opt= RepositoryInterface.findById(id);
		Product p=opt.orElseThrow(()->new RuntimeException("no product found with this id"+id));
		p.setName(dto.getName());
		p.setPrice(dto.getPrice());
		p.setDiscount(dto.getDiscount());
		RepositoryInterface.save(p);
		
		return "product details are up[dated successfully";
	}

	@Override
	public ProductDTO deleteByID(Integer id) {
		Optional<Product> opt= RepositoryInterface.findById(id);
		Product p=opt.orElseThrow(()->new RuntimeException("no product found with this id"+id));
		if(RepositoryInterface.existsById(id))
		{
			 RepositoryInterface.deleteById(id);
		}
		return null ;
	}

}
