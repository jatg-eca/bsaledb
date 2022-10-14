package com.bsale.commerce.bsalecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bsale.commerce.bsalecommerce.entity.Product;
import com.bsale.commerce.bsalecommerce.repository.IProductRepository;

public class ProductServiceImp implements IProductService {
	
	@Autowired
	IProductRepository productRepository;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepository.findAll();
	}

}
