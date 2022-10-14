package com.bsale.commerce.bsalecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsale.commerce.bsalecommerce.entity.Energetic;
import com.bsale.commerce.bsalecommerce.service.IEnergeticService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class EnergeticController {


	    @Autowired
	    IEnergeticService EnergeticService;

	    @GetMapping("/Energetic")
	    public List<Energetic> Chamoys(){
	        return EnergeticService.findAllEnergetic();
	    }

}
