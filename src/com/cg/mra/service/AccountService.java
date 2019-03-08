package com.cg.mra.service;

import com.cg.beans.Account;

public interface AccountService {
Account getAccountDetails(String mobileNo);
int rechargeAccount(String mobileNo,double rechargeAmount);
}
