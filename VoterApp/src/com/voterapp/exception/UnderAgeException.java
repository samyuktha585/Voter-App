package com.voterapp.exception;

import com.voterapp.service.*;

public class UnderAgeException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnderAgeException() {
		super();
	
	}

	public UnderAgeException(String msg) {
		super(msg);
	
	}

}
