package com.springbootfirstproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dealer {
	@Id 
	String dealer_id;
	String dealer_name;
	String dealer_location;
	
	@ManyToOne
	Shop shop;
	
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public String getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(String dealer_id) {
		this.dealer_id = dealer_id;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_location() {
		return dealer_location;
	}
	public void setDealer_location(String dealer_location) {
		this.dealer_location = dealer_location;
	}
	
	
}
