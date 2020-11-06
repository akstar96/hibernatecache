package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@Autowired
	Services ser;
	

	@RequestMapping("/{name}")
	public Model getname(@PathVariable String name) {
		
		
		return ser.getname(name);
		
	}
	
	
	
	
}
