/*
Class that runs the conversions
Author: Teddy Juntunen
*/

import java.util.Scanner;

public class ConversionsDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ConversionsHelper conversionHelper = new ConversionsHelper();
		
		// prompting user for number of bits to convert to bytes
		System.out.print("Number of bits to convert to bytes: ");
		int bits = scan.nextInt();
		System.out.println(conversionHelper.bitsToBytes(bits) + " bytes");

		// prompting user for celsius temperature to convert to fahrenheit
		System.out.print("Celsius temperature to convert to fahrenheit: ");
		int temperature = scan.nextInt();
		System.out.println(conversionHelper.celsiusToFahrenheit(temperature) + " degrees Fahrenheit");

		// prmompting the user for a month and a day
		System.out.print("Enter a month: ");
		String month = scan.next();
		System.out.print("Enter a day: ");
		int day = scan.nextInt();
		System.out.println(conversionHelper.dayOfYear(day, month) + " is the day number");

	}

}