package com.cg.mra.exception;

public class RechargeException extends Exception{
	public RechargeException() {
		System.err.println("ERROR :Given account id doesn't exist");
	}

}
