package com.bsale.commerce.bsalecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsale.commerce.bsalecommerce.entity.Category;
import com.bsale.commerce.bsalecommerce.service.ICategoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CategoryRestController {
	
	@Autowired
	ICategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Category> categories(){
		return categoryService.findAllCategories();
	}
	
}
