package com.voterapp.exception;

import com.voterapp.service.NotEligibleException;

public class NoVoterIDException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public NoVoterIDException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoVoterIDException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
