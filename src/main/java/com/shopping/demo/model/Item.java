package com.shopping.demo.model;

public class Item {

	private final int quantity;
	private final double unitPrice;
	
	public Item(double unitPrice, int quantity) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getSubTotal() {
		return unitPrice * (double)quantity;
	}
}
