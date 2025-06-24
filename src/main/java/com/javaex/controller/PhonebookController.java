package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.GuestbookDAO;
import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.GuestbookVO;
import com.javaex.vo.PersonVO;

@Controller
//@RequestMapping(value="/person")
public class PhonebookController {


	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String select(Model model) {
		System.out.println("phonebookController/list"); //ㅇㅋ
		
		PhonebookDAO phonebookDAO = new PhonebookDAO();
		List<PersonVO> personList = phonebookDAO.personSelect();
		System.out.println(personList);
		
		model.addAttribute("pList", personList);
		
		
		return "redirect:list";
	}


	@RequestMapping(value="/wform", method= {RequestMethod.GET, RequestMethod.POST})
	public String writeform() {
		System.out.println("WFoRM");
		

		return "writeform";
	}

	
	
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@ModelAttribute PhonebookVO phonebookVO) {
		System.out.println("write");

		PhonebookDAO phonebookDAO = new PhonebookDAO();
		int count = phonebookDAO.phonebookInsert(phonebookVO);
		
		
		
		return "redirect:/list";
	}

	
	
	
	/*
	@RequestMapping(value="/mform", method= {RequestMethod.GET, RequestMethod.POST})
	public String modify() {
		System.out.println("MMMMMFFFORRRMMM");
	
		return "";
		
	}
	*/
	
}
