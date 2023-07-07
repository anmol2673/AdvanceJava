package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@ToString(exclude = "password")
@Getter
@Setter
@Entity
@Table
public class Bank extends BaseEntity {
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lName;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="balence")
	private double balance;
	@Enumerated(EnumType.STRING)
	private AccountType type;
	
	
	
	public Bank(String fName, String lName, String email, String password, double balance, AccountType type) {
		super();
		this.fname = fname;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.balance = balance;
		this.type = type;
	}
	

}
