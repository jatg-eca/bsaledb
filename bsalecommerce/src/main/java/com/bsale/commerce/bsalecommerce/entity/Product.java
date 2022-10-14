package com.bsale.commerce.bsalecommerce.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product implements Serializable{
	private static final long serialVersionUID =1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idProduct;
    @Column(name = "product_name")
    private String productName;

}
