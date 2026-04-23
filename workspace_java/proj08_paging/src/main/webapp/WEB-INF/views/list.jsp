<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 목록</h1>
	<%-- 	${list} --%>
	<table border=1>
		<thead>
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>job</th>
				<th>mgr</th>
				<th>hiredate</th>
				<th>sal</th>
				<th>comm</th>
				<th>deptno</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.empno}</td>
					<td>${dto.ename}</td>
					<td>${dto.job}</td>
					<td>${dto.mgr}</td>
					<td>${dto.hireDate}</td>
					<td>${dto.sal}</td>
					<td>${dto.comm}</td>
					<td>${dto.deptNO}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


	이전
	<a href="list?page=1&size=10">1</a>
	<a href="list?page=2&size=10">2</a>
	<%
	Map map = (Map) request.getAttribute("map");
	int total = (int) map.get("totalCount");
	int size = (int) map.get("size");

	int totalPage = (int) Math.ceil((double) total / size);

	int section = 5;
	int pageNum = (int) map.get("page");

	int end_section = (int) Math.ceil((double) total / size);
	int start_section = end_section - section + 1;

	if (end_section > totalPage) {
		end_section = totalPage;
	}
	%>
	이전
	<c:forEach var="i" begin="<%=start_section%>" end="<%=end_section%>">
		<a href="list?page=${i } &size=10"> 
			<c:if test="${map.page eq i }">	
				${i}
			</c:if> 
			<c:if test="${map.page ne i }">	
				${i} 
			</c:if>
		</a>
	</c:forEach>
	<a href="list?page=<%= end_section + 1 %>" >
	<c:if test="<%= end_section == totalPage%>">
		다음
	</c:if>
	다음
	</a>
	다음












</body>
</html>