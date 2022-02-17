package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Canteen implements CanteenInterface{

	public void food() {
		System.out.println("food is available");
		
	}

}
