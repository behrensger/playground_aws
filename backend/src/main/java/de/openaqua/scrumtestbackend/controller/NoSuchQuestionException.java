package de.openaqua.scrumtestbackend.controller;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus ( org.springframework.http.HttpStatus.NOT_FOUND) 
public class NoSuchQuestionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6829807469013974556L;

	public NoSuchQuestionException() {
		super();
	}

	public NoSuchQuestionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoSuchQuestionException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSuchQuestionException(String message) {
		super(message);
	}

	public NoSuchQuestionException(Throwable cause) {
		super(cause);
	}

	
}
