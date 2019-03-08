package com.cg.mra.ui;
import java.util.*;

import com.cg.beans.Account;
import com.cg.mra.exception.InvalidLengthException;
import com.cg.mra.exception.InvalidNumberException;
import com.cg.mra.exception.RechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService as=new AccountServiceImpl();
		
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			
		System.out.println("1.Account Balance Enquiry \n 2.Rechage Amount \n 3.Exit");
		System.out.println("enter the choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("enter the mobile number");
				String mobileNo=sc.next();
				if(mobileNo.length()==10) {
					Account account=as.getAccountDetails(mobileNo);
					if(account!=null) {
						System.out.println("your current balance is"+account.getAccountBalance());
					}
					else
					{
						try {
							throw new InvalidNumberException();
						}
						catch(InvalidNumberException e) {
							
						}
					}
					
						
					}
				else {
					try {
						throw new InvalidLengthException();
					}
				catch(InvalidLengthException e) {
					
				}
					
				}
				//as.getAccountDetails(mobileno);
				
			break;
			
			case 2: 
				System.out.println("enter the mobile number");
				String mobileNo1=sc.next();
				
				if(mobileNo1.length()==10) {
					Account account1=as.getAccountDetails(mobileNo1);
					if(account1!=null) {
				System.out.println("enter the recharge amount");
				double rechargeAmount=sc.nextDouble();
				
				int balance=as.rechargeAccount(mobileNo1, rechargeAmount);
				
					System.out.println("your account recharged successfull");
					System.out.println("hello"+account1.getCustomerName()+ "," +"Available balance is"+balance);
				}
				else {
					try {
						throw new RechargeException();
					}
					catch(RechargeException  e) {
				}
				}
				}
				else {
					try {
						throw new InvalidLengthException();
					}
				catch(InvalidLengthException e) {
					
				}
				}
					
				
				break;
			case 3: System.out.println("exited");
			System.exit(0);
			
			break;
			default :
				System.out.println("wrong choice");
		
		}	
		
				
		}
	}
}
		


	


