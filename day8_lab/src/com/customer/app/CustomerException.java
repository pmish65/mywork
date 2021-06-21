package com.customer.app;


@SuppressWarnings("serial")
public class CustomerException extends Exception{
	public CustomerException(String errMsg) {
		super(errMsg);
	} 
}
