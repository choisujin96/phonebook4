package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookDAO {
	
		//필드
		@Autowired
		private SqlSession sqlSession;

	
		
		// 전체리스트 가져오기
		public List<PersonVO> personSelect() {
			System.out.println("sqlselect");

			List<PersonVO> phonebookList = sqlSession.selectList("phonebook.selectList2");
			System.out.println(phonebookList);
			
			return phonebookList;
		}
		
		
		
		//하나만 가져오기
		public PersonVO personSelectOne(int personId) {
			
			System.out.println("selectOne");
			PersonVO personVO = sqlSession.selectOne("phonebook.selectOne", personId);
			
			Map<String, Object> map = sqlSession.selectOne("phonebook.selectOne2", personId);
			
			System.out.println(map);
	
			System.out.println(map.get("name"));
			
			return personVO;
			
		}
		
		
		//1명 저장  //파라미터로 받는 거 저장
		public int personInsert(PersonVO personVO) {
			System.out.println("personInsert");
			System.out.println(personVO);
			int count = sqlSession.insert("phonebook.insert", personVO);
		
			return count;
		}
		

		//1명 저장 map ver   //서비스에서 받은 값 저장
		public int personInsert2(Map<String, String> personMap) {
			System.out.println("personInsert2");
			System.out.println(personMap);

			int count = sqlSession.insert("phonebook.insert2", personMap);
			System.out.println(count);
			return count;
		}
		
		
		
		
		

		
		
		
		
		
		
		/*
		// 1명 정보 가져오기
		public PersonVO personSelectOne(int no) {
			
			//VO준비 (1명정보만 담아야 하니 리스트 필요없음)
			PersonVO personVO = null;
			
			this.connect();
			
			try {
				//3. SQL문준비 / 바인딩 / 실행
				// SQL문준비
				String query= "";
				query +=" select  person_id, ";
				query +="		  name, ";
				query +="         hp, ";
				query +="         company ";
				query +=" from person ";
				query +=" where person_id = ? ";
				
				// 바인딩
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, no);
				
				// 실행
				rs = pstmt.executeQuery();
				
				//4. 결과처리
				rs.next();
				
				//ResultSet에서 각각의 값을 꺼내서 자바 변수에 담는다
				int personId = rs.getInt("person_id");
				String name = rs.getString("name");
				String hp = rs.getString("hp");
				String company = rs.getString("company");
				
				//VO로 묶어준다
				personVO = new PersonVO(personId, name, hp, company);
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			
			this.close();
			
			return personVO;
			
		}
		
		
		
		//사람(주소) 등록
		public int personInsert(PersonVO personVO) {
			System.out.println("personInsert()");
			int count = -1;
			
			this.connect();
			
			try {
				//3. SQL문준비 / 바인딩 / 실행
				// - SQL문준비
				String query ="";
				query += " insert into person ";
				query += " values(null, ?, ?, ?) ";
				
				// - 바인딩
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, personVO.getName());
				pstmt.setString(2, personVO.getHp());
				pstmt.setString(3, personVO.getCompany());
				
				// - 실행
				count = pstmt.executeUpdate();
				
				//4. 결과처리
				System.out.println(count + "건이 저장되었습니다.");
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			
			this.close();
			
			return count;
		}
		
		//사람(주소) 삭제
		public int personDelete(int no) {
			System.out.println("personDelete");
			
			int count = -1;
			
			this.connect();
			
			try {
				//3. SQL문준비 / 바인딩 / 실행
				// - SQL문준비
				String query="";
				query += " delete from person ";
				query += " where person_id = ? ";
				
				// - 바인딩
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, no);
				
				// - 실행
				count = pstmt.executeUpdate();
				
				//4. 결과처리
				System.out.println(count + "건 삭제되었습니다.");
				
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			
			this.close();
			
			return count;
		}
		
		
		//사람(주소) 수정
		public int personUpdate(PersonVO personVO) {
			System.out.println("personUpdate");
			
			int count = -1;
			
			this.connect();
			
			try {
				//3. SQL문준비 / 바인딩 / 실행
				// - SQL문준비
				String query="";
				query += " update person ";
				query += " set name = ?, ";
				query += " 	   hp = ?, ";
				query += " 	   company = ? ";
				query += " where person_id = ? ";
				
				// - 바인딩
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, personVO.getName());
				pstmt.setString(2, personVO.getHp());
				pstmt.setString(3, personVO.getCompany());
				pstmt.setInt(4, personVO.getPersonId());
				
				// - 실행
				count = pstmt.executeUpdate();
				
				//4. 결과처리
				System.out.println(count + "건 수정되었습니다.");
				
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			
			this.close();
			
			return count;
		}
	
	*/
}
