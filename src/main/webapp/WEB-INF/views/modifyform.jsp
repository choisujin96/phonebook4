<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
	
	http://localhost:8080/pbook3/pbc?action=mform&no=1	
	
		<!-- 액션: 앞에 주소를 만들어줌 / 겟방식으로 데이터를 가져온다. -->
		<form action="" method="get">
			<label>이름(name)</label>	
			<input type="text" name="" value="">
			<br>
			
			<label>핸드폰(hp)</label>
			<input type="text" name="" value="">
			<br>
			
			<label>회사(company)</label>
			<input type="text" name="" value="">
			<br>
		
			<label>액션</label>		
			<input type="" name="" value="">
			<br>
		
			<input type="" name="" value="">
			<br>
		
		
		
			<button>수정(등록)</button>
		</form>
	</body>
</html>