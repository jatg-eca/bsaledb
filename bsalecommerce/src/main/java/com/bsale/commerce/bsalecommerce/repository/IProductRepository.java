package com.bsale.commerce.bsalecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.bsale.commerce.bsalecommerce.entity.Product;

public interface IProductRepository extends CrudRepository<Product, Long> {

}
