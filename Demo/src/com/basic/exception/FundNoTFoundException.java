package com.basic.exception;

/**
 * Compile time - User define exception
 */
public class FundNoTFoundException extends Exception {

	private static final long serialVersionUID = -6865233577679170799L;

	public FundNoTFoundException(String msg) {
		super(msg);
	}

}
