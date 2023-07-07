package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.BankDto;
import com.app.dto.BankReqDto;
import com.app.entities.AccountType;
import com.app.entities.Bank;
import com.app.service.BankService;

@RestController
@RequestMapping("/")
public class BankController {
	
	@Autowired
	private BankService bService;
	
	public BankController() {
		System.out.println("in constr of"+getClass());
	}
	
	@GetMapping("list")
	public List<Bank> getAllDetails(){
		return bService.getAllCustomers();
	}
	
	@PostMapping("add")
	public BankDto addDetails(@RequestBody @Valid BankDto dto) {
		return bService.addDetails(dto);
	}
	
	@PutMapping("update")
	
	public BankDto updateDetails(@RequestBody @Valid BankDto dto) {
		return bService.updateDetails(dto);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteDetails(@PathVariable Long id) {
		return bService.deleteDetails(id);
	}
	
	@GetMapping("get/{id}")
	public Bank getById(@PathVariable Long id) {
		return bService.getById(id);
	}
	
	@PostMapping("signin")
	public BankDto signIn(@RequestBody @Valid BankReqDto dto) {
		return bService.signIn(dto);
	}
	
	@GetMapping("/bank/{type}")
	List<Bank> getByTypeDetails(@PathVariable String type){
		return bService.getByType(AccountType.valueOf(type));
		
	}
	
	@GetMapping("/banks/{fname}")
	List<Bank> getByFirstName(@PathVariable String fname){
		return bService.getbyFirstName(fname);
	}
	
	
}
