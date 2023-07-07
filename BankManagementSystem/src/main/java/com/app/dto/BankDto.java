package com.app.dto;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.app.entities.AccountType;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BankDto {
	
	@NotBlank(message="fname cannot be blank")
	private String fname;
	@NotBlank(message="lname cannot be blank")
	private String lName;
	@Email
	private String email;
	@NotBlank
	private String password;
	@NotNull
	private double balance;
	
	private AccountType type;

}
