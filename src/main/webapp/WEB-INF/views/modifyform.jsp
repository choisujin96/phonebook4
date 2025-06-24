<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
	
	
		<h1>주소록</h1>
		<h2>전화번호 수정폼</h2>
		<p>전화번호를 수정하는 폼 입니다.</p>

	
		<!-- 액션: 앞에 주소를 만들어줌 / 겟방식으로 데이터를 가져온다. -->
		<form action="${pageContext.request.contextPath}/modify" method="get">
			<label>이름(name)</label>	
			<input type="text" name="name" value="${personVO.name}">
			<br>
			
			<label>핸드폰(hp)</label>
			<input type="text" name="hp" value="${personVO.hp}">
			<br>
			
			<label>회사(company)</label>
			<input type="text" name="company" value="${personVO.company}">
			<br>
		
		
			<input type="text" name="personId" value="${personVO.personId}">
			<br>
		
		
		
			<button type="submit">수정(등록)</button>
		</form>
	</body>
</html>