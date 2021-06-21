package com.customer.app;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Customer {
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	private CustomerType customerType;
	public static SimpleDateFormat dateFormater;
	static {
		dateFormater = new SimpleDateFormat("dd-MM-yyyy");
	}
	public Customer(String name, String email, String password, double registrationAmount, Date dob,CustomerType customerType) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.customerType=customerType;
	}
	
	public String getEmail() {
		return email;
		
	}

	@Override
	public String toString() {
		return "Customer name=" + name + ", email=" + email + ", password=" + password + ", registrationAmount="
				+ registrationAmount + ", dob=" + dob + "Customer type = " + customerType ;
	}
		
}
