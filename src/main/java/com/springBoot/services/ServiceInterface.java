package com.springBoot.services;

import com.springBoot.dto.ProductDTO;

public interface ServiceInterface {
	
	public abstract String addProduct(ProductDTO ProductInfoByUser);
	
	ProductDTO findByID(Integer id);
	
	public String  updateByID(ProductDTO dto,Integer id);
	
	ProductDTO deleteByID(Integer id);

}
