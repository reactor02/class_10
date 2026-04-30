<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 목록</title>
</head>
<body>
	<form method="get" action="search">
		<select name="type">
			<option value="ename" ${EmpDTO.type eq 'ename' ? 'selected' : ''}>ename</option>
			<option value="sal" ${EmpDTO.type eq 'sal'   ? 'selected' : ''}>sal(이상)</option>
			<option value="job" ${EmpDTO.type eq 'job'   ? 'selected' : ''}>job</option>
		</select> <input type="text" name="keyword" value="${EmpDTO.keyword}">
		<input type="submit" value="검색">
	</form>
	<br>
	<form method="GET" action="choice">
	
		<table border="1">
			<thead>
				<tr>
					<th>선택</th>
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
			<tbody id="tbody">
				<c:forEach var="m" items="${list}">
					<tr>
						<td>
							<input type="checkbox" name="empnos" value="${m.empno}">
						</td>
						<td><a href="detail?empno=${m.empno}" class="empno">${m.empno}</a></td>
						<td>${m.ename}</td>
						<td>${m.job}</td>
						<td>${m.mgr}</td>
						<td>${m.hiredate}</td>
						<td>${m.sal}</td>
						<td>${m.comm}</td>
						<td>${m.deptno}</td>
					</tr>
				</c:forEach>

				<c:if test="${not empty dto}">
					<tr>
						<td><a href="detail?empno=${dto.empno}" class="empno">${dto.empno}</a></td>
						<td>${dto.ename}</td>
						<td>${dto.job}</td>
						<td>${dto.mgr}</td>
						<td>${dto.hiredate}</td>
						<td>${dto.sal}</td>
						<td>${dto.comm}</td>
						<td>${dto.deptno}</td>
					</tr>
				</c:if>

				<c:if test="${not empty map}">
					<tr>
						<td><a href="detail?empno=${map.EMPNO}" class="empno">${map.EMPNO}</a></td>
						<td>${map.ENAME}</td>
						<td>${map.JOB}</td>
						<td>${map.MGR}</td>
						<td>${map.HIREDATE}</td>
						<td>${map.SAL}</td>
						<td>${map.COMM}</td>
						<td>${map.DEPTNO}</td>
					</tr>
				</c:if>
			</tbody>
		</table>
		<input type="submit" value="선택조회">
	</form>
</body>
</html>