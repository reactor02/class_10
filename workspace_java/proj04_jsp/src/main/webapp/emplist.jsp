<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    import ="empDTO.EmpDTO"
    import ="java.util.*"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%=request.getAttribute("list") 
		
	%><br>
	
	\${empno} 친구야 : ${list[0]}<br>
	
	<table border="1">
		<tr>
			<td>empno</td>
			<td>ename</td>
			<td>job</td>
			<td>mgr</td>
			<td>hireDate</td>
			<td>sal</td>
			<td>comm</td>
			<td>deptNo</td>
		</tr>
		
		<% List list= (List) request.getAttribute("list"); %>
		
		<%for(int i=0; i<list.size(); i++ ){ 
			EmpDTO empdto= (EmpDTO) list.get(i);		
					
		%>
			<tr>
				<td><%=empdto.getEmpno() %></td>
				<td><%=empdto.getEname()  %></td>
				<td><%=empdto.getJob()  %></td>
				<%if(empdto.getMgr() == 0){ %>
					<td><%="Null"  %></td>
				<%}else{ %>
				<td><%=empdto.getMgr()%> </td>
				<%} %>
				<td><%=empdto.getHireDate()  %></td>
				<td><%=empdto.getSal()  %></td>
				<%if(empdto.getComm() == 0){ %>
					<td><%="Null"  %></td>
				<%}else{ %>
				<td><%=empdto.getComm()  %></td>
				<%} %>
	
				<td><%=empdto.getDeptNO()  %></td>
				
			</tr>
		<%} %>
		
	</table>
	
</body>
</html>