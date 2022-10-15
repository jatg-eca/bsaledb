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
    @Column(name = "id")
    private Long idProduct;
    @Column(name = "name")
    private String productName;
    @Column(name = "url_image")
    private String urlImage;
    @Column (name = "price")
    private Double price;
    @Column (name="discount")
    private Long discount;
    @JoinColumn(name="category")
    @ManyToOne
    private Category category;

}
