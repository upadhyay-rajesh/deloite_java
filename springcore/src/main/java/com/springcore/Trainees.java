package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trainees {
	
	TrainerInterface ti;
	
	LiberaryInterface lb;
	
	CanteenInterface cc;
	
	
	
	
	public void setCc(CanteenInterface cc) {
		this.cc = cc;
	}

	public void setLb(LiberaryInterface lb) {
		this.lb = lb;
	}

	//adatper or the place where we will inject Trainer object
	public void setTi(TrainerInterface ti) {
		this.ti = ti;
	}

	public void display() {
		ti.teach();
		lb.readBook();
		cc.food();
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("abc.xml"); //creating BeanFactory class and giving abc.xml to BeanFactory
		
		Trainees tt=(Trainees)ctx.getBean("m2"); //here object of Trainees class BeanFactory will create using id m2 which are declared inside abc.xml, we have not to create like line no 25
		
		//Trainees tt=new Trainees();
		
		//TrainerInterface t1=new Trainer();
	//	tt.setTi(t1);  //dependency injenction because trainer class object we are passing to setter method so it wiil be global
		
		
		
		tt.display();

	}

}
