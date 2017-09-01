/*
Class with methods to calculate bits to bytes,
celsius to fahrenheit conversion and calculating
the day number of a given date.
Author: Teddy Juntunen
*/

public class ConversionsHelper {

	// Data member. Program will return this
	private int dayCount;

	// Converts bits to bytes
	public double bitsToBytes(int bits) {
		return bits / 8.0;
	}

	// Celsius to fahrenheit temp converter
	public double celsiusToFahrenheit(int tempInCel) {
		return (((tempInCel * 9.0) / 5) + 32);
	}

	// Finds the day number of a given month and day
	public int dayOfYear(int day, String month) {

		int monthCounter;

		/* Calculating day of year with given month and day.
		dayCount is the main variable that keeps track of the day of the year */
		switch(month) {
			case "January": 
			dayCount = day;
			break;

			case "February": 
			monthCounter = 1;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "March": 
			monthCounter = 2;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "April": 
			monthCounter = 3;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "May": 
			monthCounter = 4;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "June": 
			monthCounter = 5;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "July": 
			monthCounter = 6;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "August": 
			monthCounter = 7;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "September": 
			monthCounter = 8;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "October": 
			monthCounter = 9;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "November": 
			monthCounter = 10;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			case "December": 
			monthCounter = 11;
			dayCount += numberOfDays(monthCounter) + day;
			break;

			default: 
			return -1;			
		}

		return dayCount;

	}

	/* counts the number of total days up to the
	month we are calculating in dayOfYear() */
	private int numberOfDays(int monthCounter) {

		// array of all the day numbers of each month in order
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31};
		int result = 0;

		// add all the days up to the month we are using in calculation
		for (int i = 0; i < monthCounter; i++) {
			result += monthDays[i];
		}

		return result;

	}

}