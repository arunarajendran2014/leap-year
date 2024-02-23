package com.bnpp.leap_year;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearKataTest {

	/**
	 * 
	 */
	@Test
	public void return0DivisibleOf400() {
		LeapYearKataService leapYr = new LeapYearKataService();		
		int expected = 0;
		assertEquals(expected,leapYr.getResultOfLeapYear(2000));
	}
	
	@Test
	public void divisibleBy100NotBy400() {
		LeapYearKataService leapYr = new LeapYearKataService();	
		int expected = 2100;
		assertEquals(expected,leapYr.getResultOfLeapYear(2100));
	}
	
	@Test
	public void divisibleBy4NotBy100() {
		LeapYearKataService leapYr = new LeapYearKataService();	
		int expected = 0;
		assertEquals(expected,leapYr.getResultOfLeapYear(2008));
	}
	
}
