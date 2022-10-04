package com.shopping.demo;

import java.util.List;

import com.shopping.demo.model.Item;
 

public class ShoppingBasket {
	private final List<Item> items;
	
	 

	public ShoppingBasket(List<Item> items) {
		this.items=items;
	}

	public double getTotal() {
		return items.stream().mapToDouble(item-> item.getSubTotal()).sum();
		 
		  
	}

}
