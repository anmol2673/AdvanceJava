package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("in constr of"+getClass());
	}
	@RequestMapping("/")
	public ModelAndView showHomePage() {
		System.out.println("In home Page");
		return new ModelAndView("/index","TS",LocalDateTime.now());
		
	}
	
}
