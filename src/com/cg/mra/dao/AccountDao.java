package com.cg.mra.dao;

import com.cg.beans.Account;

public interface AccountDao {
Account getAccountDetails(String mobileNO);
int rechargeAccount(String mobileNo,double rechargeAmount);
}
