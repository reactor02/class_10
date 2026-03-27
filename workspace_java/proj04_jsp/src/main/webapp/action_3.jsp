<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--<jsp:include page="jsp_1.jsp?name=111"></jsp:include>  --%>
	<jsp:include page="jsp_1.jsp">
		<jsp:param name = "name" value= "abcd" />
	</jsp:include>
	<!-- include 안에 주석 쓰니가 JasperException 예외발생 -->
		<%--  <jsp:param name = "name" value= "abcd"></jsp:param> --%>
	
<%-- 	<jsp:forward page="footer.jsp"></jsp:forward>	 --%>
	
	<%
		empDTO.EmpDTO dto2 = new empDTO.EmpDTO();
		pageContext.setAttribute("dto2", dto2);
	%>
	<jsp:useBean id="dto" class="empDTO.EmpDTO" scope="page"/>
	
	property에 지정한 글씨를 기반으로 setter 호출<br>
	<jsp:setProperty name="dto" property="empno" value="1234"/>
	<jsp:setProperty name="dto" property="empno" value='<%= Integer.parseInt(request.getParameter("empno")) %>' />
	<jsp:setProperty name="dto" property="empno" value="${param.empno }"/>
	<jsp:setProperty name="dto" property="ename" value="${param.ename }"/>
	
	전달받은 parameter 이름을 기반으로 알아서 모든 setter를 호출한다<br>
	<jsp:setProperty name="dto" property="*"/>
	<hr>
	${dto }
	<hr>
	<jsp:getProperty name="dto" property="ename" /><br>
	이것이 나다:${dto.ename}<br>
	${dto.getEname()}<br>
	${pageScope.dto.getEname()}<br>
	requestScope : ${requestScope.dto.getEname()}<br>
	
</body>
</html>