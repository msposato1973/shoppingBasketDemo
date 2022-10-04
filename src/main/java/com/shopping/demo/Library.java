package com.shopping.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
	
	private Collection<Move> catalogue = new ArrayList<>();

	

	public void donate(Move movie) {
		 
		catalogue.add(movie);
		movie.addCopy();
	}

	
	boolean contains(Move movie) {
		return  catalogue.contains(movie);
	}
}
