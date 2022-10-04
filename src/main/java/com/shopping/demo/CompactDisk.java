package com.shopping.demo;

import com.shopping.demo.error.InsufficientStockException;

public class CompactDisk {
	private  int stock;

	public CompactDisk(int initialStock) {
		this.stock = initialStock;
	}

	public int getStockCount() {
		 
		return stock;
	}

	public void buy(int quantity) throws InsufficientStockException {
		 if(stock < quantity)
			 throw new InsufficientStockException();
		 
		stock -=  quantity;
	}

}
