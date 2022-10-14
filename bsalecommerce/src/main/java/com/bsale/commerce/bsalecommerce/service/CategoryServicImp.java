package com.bsale.commerce.bsalecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsale.commerce.bsalecommerce.entity.Category;
import com.bsale.commerce.bsalecommerce.repository.ICategoryRepository;

@Service
public class CategoryServicImp implements ICategoryService{
	
	@Autowired
	ICategoryRepository categoryRepository;

	@Override
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		return (List<Category>) categoryRepository.findAll();
	}
	

}
