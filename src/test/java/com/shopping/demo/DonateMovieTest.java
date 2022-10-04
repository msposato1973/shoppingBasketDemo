package com.shopping.demo;

import org.junit.Assert;
import org.junit.Test;

public class DonateMovieTest {
	
	private final Library library ;
	private final Move movie ;
	
	public DonateMovieTest() {
		library = new Library();
		movie = new Move();
	}
	
	@Test
	public void moveAddedToCatalogue() {
		library.donate(movie);
		Assert.assertTrue(library.contains(movie));
	}

	
	@Test
	public void rentalCopyAdded() {
		library.donate(movie);
		Assert.assertEquals(1, movie.getCopies());
		
	}
}
