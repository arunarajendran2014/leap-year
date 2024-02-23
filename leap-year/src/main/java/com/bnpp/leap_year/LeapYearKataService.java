package com.bnpp.leap_year;

public class LeapYearKataService {

	public int getResultOfLeapYear(int input) {
		int result = input;
		if (input % 400 == 0)
		{
		result = 0;
		}
		return result;
	}

}
