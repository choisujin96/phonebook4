package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;

@Service
public class PhonebookService {
	
	
	//필드
	@Autowired
	private PhonebookDAO phonebookDAO; 

	
	//생성자
	
	//메소드gs
	
	//메소드일반
	//-전체 리스트 가져오기
	public List<PersonVO> exeGetPhonebookList() {
		System.out.println("PhonebookService.exeGetPhonebookList");
		List<PersonVO> phonebookVO = phonebookDAO.personSelect();

		return phonebookVO;
	}
	
	
	//-한명 데이터 가져오기
	public PersonVO  exeModifyForm(int personId) {
		System.out.println("PhonebookService.exeModifyForm");
		
		PersonVO personVO = phonebookDAO.personSelectOne(personId);
	  
		return personVO;
	}

	
	//-한명 저장하기
	public int exeAdd(PersonVO personVO) {
		
		System.out.println("exeadddd");
		//int count = phonebookDAO.personInsert(personVO);
		
		/*가정
		  데이터가 여기서 생김 여기서 묶어여함
		  1.vo를 만들고 묶으면 된다.
		  2.map으로 묶는다(이번에만 쓴다) <-- 지금은 여기에 해당 
		*/
		
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("name", "최수진");
		personMap.put("hp", "010-88");
		personMap.put("company", "02-0");
		
		int count = phonebookDAO.personInsert2(personMap);
		
		
		return count;
		
	}
}
