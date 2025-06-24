<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
	<h1>주소록</h1>
	
	<h2>전화번호 리스트</h2>
	<p>전화번호 리스트입니다.</p>
	

	<c:forEach  items="${requestScope.pList}" var="personVO">
		<table border = '1'>
			<tbody>
				<tr>
					<td>이름(name)</td>
					<td>${personVO.name}</td>
				</tr>
				<tr>
					<td>핸드폰(hp)</td>
					<td>${personVO.hp}</td>
				</tr>
				<tr>
					<td>회사(company)</td>
					<td>${personVO.company}</td>
				</tr>
				<tr>
					<td><a href="${pageContext.request.contextPath}/wform">[수정폼]</td></a> 
					<td><a href="${pageContext.request.contextPath}/delete">[삭제]</td></a>  
				</tr>
			</tbody>
		</table>
	</c:forEach>>
		
		<br>

	<a href="${pageContext.request.contextPath}/mform">주소록 작성폼 이동</a>
	
	
	</body>
</html>			