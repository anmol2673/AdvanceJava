package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.dto.BankDto;
import com.app.dto.BankReqDto;
import com.app.entities.AccountType;
import com.app.entities.Bank;
import com.app.repo.BankRepo;
@Service
@Transactional
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankRepo bRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Bank> getAllCustomers() {
		
		return bRepo.findAll();
	}

	@Override
	public BankDto addDetails(BankDto dto) {
		Bank b=mapper.map(dto,Bank.class);
		return mapper.map(bRepo.save(b),BankDto.class);
		
	}

	@Override
	public BankDto updateDetails(BankDto dto) {
		Bank b = mapper.map(dto,Bank.class);
		return	mapper.map(bRepo.save(b),BankDto.class);
		
		
	}

	@Override
	public String deleteDetails(Long id) {
		String mesg="deletion unsuccessful";
		if(bRepo.existsById(id)) {
			bRepo.deleteById(id);
			mesg="delete successful";
		}
		return mesg;
	}

	@Override
	public Bank getById(Long id) {
		
		return bRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("invalid id"));
	}

	@Override
	public BankDto signIn(BankReqDto req) {
		
		 Bank b = bRepo.findByEmailAndPassword(req.getEmail(),req.getPassword()).orElseThrow(()->new 
				 ResourceNotFoundException("invalid email or password"));
		 BankDto b1 = mapper.map(b,BankDto.class);
		 return b1;
	}

	@Override
	public List<Bank> getByType(AccountType type) {
	  List<Bank> b1=bRepo.findByType(type);
		return b1;
	}

	@Override
	public List<Bank> getbyFirstName(String fname) {
		
		return bRepo.findByFname(fname);
	}

}
