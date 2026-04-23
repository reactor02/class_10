<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="loginCheck">
	ename: <input type="text" name="ename">
	empno: <input type="text" name="empno">
	<br>
	<c:if test="${param.msg == 1 }">
	<div style='color:red'>
		아이디 또는 비밀번호를 확인해 주세요
	</div>
	</c:if>
	<input type="submit" value="login">
</form>
</body>
</html>