package com.dnb.DevConnector.exceptions;

public class InvalidIdNotFoundException extends Exception {
	public InvalidIdNotFoundException(String msg) {
		super(msg);

	}

	@Override
	public String toString() {
		return super.toString() + super.getMessage();
	}

}
