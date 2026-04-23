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
<%= request.getAttribute("list") %>
	
	<table border="1">
		<thead>
			<th>id</th>
			<th>pw</th>
			<th>phoneNum</th>
			<th>name</th>
			<th>joinDate</th>
		</thead>
		
		
		<c:forEach var="m" items="${list}">
		<c:url var="url" value="forward">
			<c:param name ="id" value="${m.getId()}"/>
		</c:url>
			<tr>
				<td>
					<a href="${url}">
						${m.getId()}
					</a>
				</td>
				<td>${m.getPassword()}</td>
				<td>${m.getPhoneNum()}</td>
				<td>${m.getName()}</td>
				<td>${m.getJoinDate()}</td>		
			</tr>
		</c:forEach>
	</table>
</body>
</html>