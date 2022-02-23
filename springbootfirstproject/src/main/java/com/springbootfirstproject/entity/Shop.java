package com.springbootfirstproject.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Shop {
	@Id 
	String shop_id;
	String shop_owner_name;
	String shop_location;
	
	@OneToMany(mappedBy = "shop")
	List<Dealer> dealerList;

	public String getShop_id() {
		return shop_id;
	}

	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}

	public String getShop_owner_name() {
		return shop_owner_name;
	}

	public void setShop_owner_name(String shop_owner_name) {
		this.shop_owner_name = shop_owner_name;
	}

	public String getShop_location() {
		return shop_location;
	}

	public void setShop_location(String shop_location) {
		this.shop_location = shop_location;
	}

	public List<Dealer> getDealerList() {
		return dealerList;
	}

	public void setDealerList(List<Dealer> dealerList) {
		this.dealerList = dealerList;
	}
	
	
}
