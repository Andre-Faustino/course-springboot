package com.example.course.service.exceptions;

import net.bytebuddy.implementation.bind.annotation.Super;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
