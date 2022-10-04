package com.shopping.demo;

import org.junit.Assert;
import org.junit.Test;

import com.shopping.demo.error.InsufficientStockException;

public class BuyCDTest {

	@Test
	public void cdIsInStock() throws InsufficientStockException {
		CompactDisk cd = new CompactDisk(10);
		cd.buy(1);
		Assert.assertEquals(9, cd.getStockCount());
	}
	
	@Test(expected = InsufficientStockException.class)
	public void insufficientStock() throws InsufficientStockException {
		 new CompactDisk(0).buy(1);
	}
}
