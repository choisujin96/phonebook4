package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.PhonebookDAO;
import com.javaex.service.PhonebookService;
import com.javaex.vo.PersonVO;

@Controller
//@RequestMapping(value="/person")
public class PhonebookController {

	@Autowired
	private PhonebookService phonebookService;
	
	
	//리스트
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String select(Model model) {
		System.out.println("phonebookController/list"); 
		
		
		model.addAttribute("pList", personList);
		
		
		return "list";
	}

	//등록폼
	@RequestMapping(value="/wform", method= {RequestMethod.GET, RequestMethod.POST})
	public String writeform() {
		System.out.println("WFoRM");//ㅇㅋ
		

		return "writeform";
	}

	
	//등록
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@ModelAttribute PersonVO personVO) {
		System.out.println("write");//ㅇㅋ

		PhonebookDAO phonebookDAO = new PhonebookDAO();
		int count = phonebookDAO.personInsert(personVO);
	
		return "redirect:/list";
	}
	
	
	//삭제
	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@RequestParam(value="no") int no) {
		System.out.println("Phonebook4/delete"); //ㅇㅋ
		
		PhonebookDAO phonebookDAO = new PhonebookDAO();
		int count = phonebookDAO.personDelete(no);         
		
		return "redirect:/list";
	}
	

	//수정폼
	@RequestMapping(value="/mform", method= {RequestMethod.GET, RequestMethod.POST})
	public String modifyform(@RequestParam("no") int no, Model model) {
		System.out.println("MMMMMFFFORRRMMM");//ㅇㅋ

		PhonebookDAO phonebookDAO = new PhonebookDAO();
		PersonVO personVO = phonebookDAO.personSelectOne(no);
		
		model.addAttribute("personVO", personVO);
		
		return "modifyform";
	}


	//수정
	@RequestMapping(value="/modify", method= {RequestMethod.GET, RequestMethod.POST})
	public String modify(@ModelAttribute PersonVO personVO) {
		System.out.println("mooooooodiFY");//ㅇㅋ
		
		System.out.println(personVO); //이거 꼭 찍어서 확인
		
		PhonebookDAO phonebookDAO = new PhonebookDAO();
		int count = phonebookDAO.personUpdate(personVO);
	
		return "redirect:/list";
	}
	
}
