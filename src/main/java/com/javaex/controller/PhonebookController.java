package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/person")
public class PhonebookController {


	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String select() {
		System.out.println("phonebookController/list");
	
		return "";
	}

	@RequestMapping(value="/wform", method= {RequestMethod.GET, RequestMethod.POST})
	public String write() {
		System.out.println("WFoRM");
	
		return "";
	}

	
	@RequestMapping(value="/mform", method= {RequestMethod.GET, RequestMethod.POST})
	public String modify() {
		System.out.println("MMMMMFFFORRRMMM");
	
		return "";
		
	}

	
}
