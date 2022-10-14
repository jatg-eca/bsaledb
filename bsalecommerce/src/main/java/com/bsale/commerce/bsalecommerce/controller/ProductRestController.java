package com.bsale.commerce.bsalecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsale.commerce.bsalecommerce.entity.Product;
import com.bsale.commerce.bsalecommerce.service.IProductService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	@Autowired
	IProductService productService;
	
	public List<Product> products(){
		return productService.findAllProducts();
	}

}
