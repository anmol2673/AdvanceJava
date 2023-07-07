package com.app.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.AccountType;
import com.app.entities.Bank;

public interface BankRepo extends JpaRepository<Bank,Long> {
	
   Optional<Bank> findByEmailAndPassword(String em,String pass);
   
   List<Bank> findByType(AccountType type);
   
   List<Bank> findByFname(String fname);
	
}
