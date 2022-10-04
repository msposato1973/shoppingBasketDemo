package com.shopping.demo;

import java.util.Arrays;

public class Rover {

	private String facing;
	
	public Rover(String facing) {
		 this.facing = facing;
	}
	
	public String getFacing() {
		 
		return facing;
	}

	public void go(String instructions) {
		
		
		if(instructions == "R") {
			right();
		} else {
			left();
		}
	 }

	private void left() {
		turn(new String[] {"N","W","S","E"});
	}
	
	private void right() {
		turn(new String[] {"N","E","S","W"});
	}
	
	private void turn(String[] compass ) {
		int index = Arrays.asList(compass).indexOf(facing);
		facing = compass[(index+1) % 4];
	}
	
	
	private class Gear{
		public static final int FORWARD = -1;
		public static final int REVERS = 1;
	}
	

}
