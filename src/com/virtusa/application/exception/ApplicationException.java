/**
 * 
 */
package com.virtusa.application.exception;

/**
 * @author Vangari
 *
 */
public class ApplicationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApplicationException() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplicationException(Exception e) {
		System.out.println("Invalid Input Number");
	}	
}
