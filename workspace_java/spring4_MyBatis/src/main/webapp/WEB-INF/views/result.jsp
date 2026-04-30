<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과 페이지</title>
</head>
<body>
${empno}
검색결과 : ${empDTO }<br>
<hr>
<c:if test="${not empty list}">
	<c:forEach var="dto" items="${list }">
사번: ${dto.empno }<br>
이름: ${dto.ename }<br>
</c:forEach>
<c:if test="${empty list}">
empno:${empDTO.empno }
ename:${empDTO.ename }
</c:if>
</c:if>
<c:if test="${not empty list1}">
	<c:forEach var="dto" items="${list1 }">
사번: ${dto.empno }<br>
이름: ${dto.ename }<br>
</c:forEach>
<c:if test="${empty list1}">
empno:${empDTO.empno }
ename:${empDTO.ename }
</c:if>
</c:if>

<c:if test="${not empty list2}">
	<c:forEach var="dto" items="${list2 }">
사번: ${dto.empno }<br>
이름: ${dto.ename }<br>
</c:forEach>
<c:if test="${empty list2}">
empno:${empDTO.empno }
ename:${empDTO.ename }
</c:if>
</c:if>
</body>
</html>