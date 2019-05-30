/**
 * 
 */
package com.virtusa.application;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.virtusa.application.exception.ApplicationException;
import com.virtusa.application.service.NumberToWord;

/**
 * @author Vangari
 *
 */
public class NumberToWordConversion {

	/**
	 * @param args
	 */
	private static final Logger logger = Logger.getLogger(NumberToWordConversion.class);

	public static void main(String[] args) throws ApplicationException {

		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a positive number(max upto 9 digits)");

		try {
			// read the number
			number = scanner.nextInt();
			logger.info("Input Number is" + number);

			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				NumberToWord numberToWord = new NumberToWord();
				System.out.print("Number in words: " + numberToWord.convertNumberToWordFormat(number));
			}
		} catch (Exception e) {
			logger.error("Please enter a valid number");
			throw new ApplicationException(e);
		} finally {
			// close the reader
			scanner.close();
		}
	}

}
