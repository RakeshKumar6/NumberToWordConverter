/**
 * 
 */
package com.virtusa.application.service;

import org.apache.log4j.Logger;

/**
 * @author Vangari
 *
 */
public class NumberToWord {
	
	private static final Logger logger = Logger.getLogger(NumberToWord.class);

	public String convertNumberToWordFormat(int number) {
		// variable to hold string representation of number
		String wordFormat = "";
		
		String unitsArray[] = { "", "one", "two", "three", "four", "five", "six",
		 "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
		 "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		
		String tensArray[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		// check if number is divisible by 1 million
		if ((number / 1000000) > 0) {
			wordFormat += convertNumberToWordFormat(number / 1000000) + " million ";
			number %= 1000000;
		}
		// check if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
			wordFormat += convertNumberToWordFormat(number / 1000) + " thousand ";
			number %= 1000;
		}
		// check if number is divisible by 1 hundred
		if ((number / 100) > 0) {
			wordFormat += convertNumberToWordFormat(number / 100) + " hundred ";
			number %= 100;
		}

		if (number > 0) {
			// check if number is within teens
			if (number < 20) {
				// fetch the appropriate value from unit array
				wordFormat += unitsArray[number];
			} else {
				// fetch the appropriate value from tens array
				wordFormat += tensArray[number / 10];
				if ((number % 10) > 0) {
					wordFormat += "-" + unitsArray[number % 10];
				}
			}
		}

		logger.info("Successfully converted the Number to Word format");
		return wordFormat;
	}

}
