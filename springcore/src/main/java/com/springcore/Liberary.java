package com.springcore;

import org.springframework.stereotype.Component;

@Component
public class Liberary implements LiberaryInterface{

	public void readBook() {
		System.out.println("book is available");
		
	}

}
