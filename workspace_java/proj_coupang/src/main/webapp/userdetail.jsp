<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id : ${cpDTO.getId()} <br>
	pw : ${cpDTO.getPassword()}<br>
	phoneNum : ${cpDTO.getPhoneNum()}<br>
	name : ${cpDTO.getName()}<br>
	joinDate : ${cpDTO.getJoinDate()}<br>
	
	
	<c:url var="url" value="userupdate.jsp">
		<c:param name ="id" value="${cpDTO.getId()}"/>
		<c:param name ="pw" value="${cpDTO.getPassword()}"/>
		<c:param name ="phoneNum" value="${cpDTO.getPhoneNum()}"/>
		<c:param name ="name" value="${cpDTO.getName()}"/>
		<c:param name ="joinDate" value="${cpDTO.getJoinDate()}"/>
	</c:url>
	<c:url var="url2" value="userdelete.jsp">
		<c:param name ="id" value="${cpDTO.getId()}"/>
	</c:url>
	<a href="${url}">수정하러 ㄱㄱ</a>
	<a href="${url2}">삭제하러 ㄱㄱ</a>
</body>
</html>