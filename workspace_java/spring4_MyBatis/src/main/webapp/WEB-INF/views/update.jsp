<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method=post action='updateEmp2'><br>
	id: ${dto.empno}<br>
	<input type="hidden" name="empno" value="${dto.empno}">
	ename : <input type="text" name="ename" value="1"><br>
	job : <input type="text" name="job" value="1"><br>
	mgr : <input type="text" name="mgr" value="1"><br>
	hiredate : <input type="date" name="hiredate" ><br>
	sal : <input type="text" name="sal" value="1"><br>
	comm : <input type="text" name="comm" value="1"><br>
	deptno : <input type="text" name="deptno" value="1"><br>
	
	<input type=submit value="시작">
</body>
</html>