package com.shopping.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

	@Test
	@Parameters({ 
		"N,E", 
		"E,S", 
		"S,W", 
		"W,N"
	})
	public void turnsRightClockWise(String startsFacing, String endFacing) {
		Rover rover = new Rover(startsFacing);
		rover.go("R");

		assertEquals(endFacing, rover.getFacing());
	}
	
	@Test
	@Parameters({ 
		"N,W", 
		"W,S", 
		"S,E", 
		"E,N"
	})
	public void turnsLeftAntiClockWise(String startsFacing, String endFacing) {
		Rover rover = new Rover(startsFacing);
		rover.go("L");

		assertEquals(endFacing, rover.getFacing());
	}
	 
}
