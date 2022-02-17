package com.springcore;

public class Trainer implements TrainerInterface{
	
	CanteenInterface cc1;
	
	

	public void setCc1(CanteenInterface cc1) {
		this.cc1 = cc1;
	}



	public void teach() {
		System.out.println("Trainer is teaching");
		
		cc1.food();
		
	}

}
