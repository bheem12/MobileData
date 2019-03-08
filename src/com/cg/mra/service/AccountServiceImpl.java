package com.cg.mra.service;

import com.cg.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	AccountDao accountDao=new AccountDaoImpl();
	Account account=null;
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		
      
		
		
		Account account=accountDao.getAccountDetails(mobileNo);
				return account;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		// TODO Auto-generated method stub
		int balance=accountDao.rechargeAccount(mobileNo, rechargeAmount);
		return balance;
	}

}
