package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer implements TrainerInterface{
	
	@Autowired
	CanteenInterface cc1;
	
	

	public void teach() {
		System.out.println("Trainer is teaching");
		
		cc1.food();
		
	}

}
