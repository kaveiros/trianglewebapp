package com.keylane.engine;

/**
 * A custom Exception class used in 
 * the program to notify users when something goes wrong.
 * @author Nikolaos Chantzopoulos
 * version 0.1
 * @since 11-18-2017
 */
public class KeylaneException extends Exception {
	
	private static final long serialVersionUID = 11182017L;

	
	@Override
	public String getMessage() {
		
		return "Keylane program failed to determine triangle type. "
				+ "Make sure you have non empty non zero sides";
	}
	
	
	

}
