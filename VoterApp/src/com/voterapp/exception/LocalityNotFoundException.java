package com.voterapp.exception;


public class LocalityNotFoundException extends NoVoterIDException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LocalityNotFoundException() {
		super();
		
	}

	public LocalityNotFoundException(String msg) {
		super(msg);
		
	}

}
