package com.infomaniak.exceptions;

public class FullCampusException extends RuntimeException {

	public FullCampusException() {
		super();
	}

	public FullCampusException(String s) {
		super(s);
		System.out.println(s);
	}

}
