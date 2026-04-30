<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${empDTO.empno }
	${empDTO.ename}
	${empDTO.mgr }
	
	<a href="update">수정</a>
	<form method='POST' action="deleteEmp2">
		<input type=hidden name="empno" value="${empDTO.empno}">
		<input type=submit value="삭제">
	</form>
	
</body>
</html>