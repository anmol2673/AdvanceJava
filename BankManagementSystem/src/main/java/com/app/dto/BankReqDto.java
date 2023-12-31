package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class BankReqDto {
	@NotBlank(message = "email cant be  blank")
	@Email
	private String email;
	@NotBlank(message = "cant be blank")
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
