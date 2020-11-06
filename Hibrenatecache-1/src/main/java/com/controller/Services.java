package com.controller;

import org.springframework.stereotype.Service;

@Service
public class Services {

	public Model getname(String name) {
		
		 System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
		//Thread.sleep(1000*5);
	 
	        return new Model(1,name);
	    }
		
		
		
	}
	
	

