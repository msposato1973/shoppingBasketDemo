package com.shopping.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.shopping.demo.model.Item;

public class ShoppingBasketTest {
	
	@Test
	public void totalOfEmployBasket() {
		ShoppingBasket basket = buildBasketWitItem();
		
		Assert.assertEquals(0.0, basket.getTotal(), 0.0);
	}
	
	
	@Test
	public void totalOfESingleItem() {
		ShoppingBasket basket = buildBasketWitItem(new Item(100.0, 1));
		
		Assert.assertEquals(100.0, basket.getTotal(), 0.0);
	}
	
	@Test
	public void totalOfTowItems() {
		ShoppingBasket basket = buildBasketWitItem(new Item(100.0, 1), new Item(200.0, 1));
		
		Assert.assertEquals(300.0, basket.getTotal(), 0.0);
	}
	
	@Test
	public void totalOfTowItemsWithQunatityTwo() {
		ShoppingBasket basket = buildBasketWitItem(new Item(100.0, 2));
		
		Assert.assertEquals(200.0, basket.getTotal(), 0.0);
	}
	
	
	private ShoppingBasket buildBasketWitItem(Item... items) {
		return new ShoppingBasket(Arrays.asList(items));
	}

}
