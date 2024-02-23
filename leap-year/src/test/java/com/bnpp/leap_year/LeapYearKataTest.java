package com.bnpp.leap_year;

import org.junit.Test;

public class LeapYearKataTest {

	@Test
	public void return0DivisibleOf400() {
		LeapYearKataService leapYr = new LeapYearKataService();
		int input = 1;
		leapYr.getResultOfLeapYear(input);
	}
	
}
