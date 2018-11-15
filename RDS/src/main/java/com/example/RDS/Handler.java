package com.example.RDS;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class Handler {

	public Handler() {
		// TODO Auto-generated constructor stub
		System.out.println("HANDLER");
	}

	@ExceptionHandler(value = { Exception.class })
	@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "DUPLICATE DATABASE")
	protected void handleConflict() {
		System.out.println("MYHANDLER");

	}

}
