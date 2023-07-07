package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	public HomeController() {
		System.out.println("in constr of"+getClass());
	}

	
	@GetMapping
	public List<Integer> getAllNumbers(){
		return Arrays.asList(10,20,30);
	}
}
