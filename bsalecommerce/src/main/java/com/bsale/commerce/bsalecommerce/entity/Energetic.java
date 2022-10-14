package com.bsale.commerce.bsalecommerce.entity;

import java.io.Serializable;
import javax.persistence.*;


import lombok.Data;

@Entity
@Table(name = "has_chamoy")
@Data
public class Energetic implements Serializable {
		private static final long serialVersionUID =1L;

		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long IdEnergetic;
	    @Column(name = "nombreEnergetic")
	    private String nombreEnergetic;
}
