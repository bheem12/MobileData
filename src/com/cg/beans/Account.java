package com.cg.beans;

public class Account {
	private String AccountType;
	private  String CustomerName;
	private double AccountBalance;
	//public Account(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
		
		
	
	public Account(String AccountType, String CustomerName, double AccountBalance) {
		// TODO Auto-generated constructor stub
		this.AccountType=AccountType;
		this.CustomerName=CustomerName;
		this.AccountBalance=AccountBalance;
	}
	
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public  String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	

}
