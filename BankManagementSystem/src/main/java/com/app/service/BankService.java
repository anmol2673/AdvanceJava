package com.app.service;

import java.util.List;

import com.app.dto.BankDto;
import com.app.dto.BankReqDto;
import com.app.entities.AccountType;
import com.app.entities.Bank;

public interface BankService {
	
	List<Bank> getAllCustomers();
	
	BankDto addDetails(BankDto dto);
	
	//update
	BankDto updateDetails(BankDto dto);
	
	//delete
	String deleteDetails(Long id);
	
	//get by id
	Bank getById(Long id);
	
	//sign in
	public BankDto signIn(BankReqDto req);
    
	List<Bank> getByType(AccountType type);
	
	List<Bank> getbyFirstName(String fname);
	
}
