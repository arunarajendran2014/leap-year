package com.bnpp.leap_year;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearKataTest {

	@Test
	public void return0DivisibleOf400() {
		LeapYearKataService leapYr = new LeapYearKataService();
		//int input = 0;
		int expected = 0;
		assertEquals(expected,leapYr.getResultOfLeapYear(2000));
	}
	
}
