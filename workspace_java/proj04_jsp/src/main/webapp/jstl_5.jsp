<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="a" value="10"/>
	\${a } : ${a }<br>
	<%
		String name ="이왕재";
	%>
	\${name } : ${name }
	<input value="<%= name %>">
	<c:set var="name2" value = "<%= name %>"/>
	\${name2 } : ${name2 }
	<c:set var="name3" value = "<%= name %>" scope="page"/>
	scope 생략하면 page<br>
	
	<c:set var="wish" value= "데이트" scope="page"/>
	<c:set var="wish" value= "여행" scope="request"/>
	<c:set var="wish" value= "게임" scope="session"/>
	<c:set var="wish" value= "잠자기" scope="application"/>
	\{wish} : ${wish }<br>
	
	pageScope : ${pageScope.wish }<br>
	requestScope : ${requestScope.wish }<br>
	sessionScope : ${sessionScope.wish }<br>
	applicationScope : ${applicationScope.wish }<br>
	
	scope : page > request > session > application
	<%--<jsp:forward page="jstl_5_1_scope.jsp"/> --%>
	
	<hr>
	
	<c:if test="true"> <!--  "true "띄어쓰기도 문자라 띄어쓰면 안됨-->
		항상 참<br>
	</c:if>
	<c:set var="b" value = "100"/>
	<c:if test="${b > 10 }">
		b는 10보다 큽니다
	</c:if>
	<c:if test="${b eq 100 }">
		b는 10입니다
	</c:if>
	<c:if test="${ not(b eq 100) }">
		b는 10입니다
	</c:if>
	
	<%
		int a = 10;
		int b = 20;
		if(a> 1 && b<100){}
	
	%>
	<c:choose>
		<c:when test="${b eq 99 }">
			b는 99입니다<br>
		</c:when>
		<c:when test="${b eq 101 }">
			b는 101입니다<br>
		</c:when>
		<c:otherwise>
			b는 99와 101이 아닙니다<br>
		</c:otherwise>
	</c:choose>
	
	<%
		List list = new ArrayList();
		for(int i = 15; i < 20; i++){
			Map map = new HashMap();
			map.put("정신연령", i);
			map.put("실제나이", 10+i);
			
			list.add(map);
		}
	%>
	
	<c:set var="list2" value="<%=list %>" scope="page"/>
	첫번째 목록의 실제나이 출력 : ${list2[0].실제나이}<br>
	<br>
	items<br>
<%-- 	<c:forEach var="m" items="<%=list %>"></c:forEach> --%>
	<c:forEach var="m" items ="${list2 }">
		정신연령 : ${m.정신연령 }
		정신연령 : ${m.실제나이 }
	</c:forEach>
	<hr>
	begin, end <br />
	<c:forEach var="i" begin="0" end="3" >
		${i}, ${list2[i].정신연령}<br>
	</c:forEach>
	<hr>
	step<br>
	<c:forEach var="i" begin="0" end="30" step="2" ><!-- 인덱스 범위 넘어도 에러 안남 -->
		${i}, ${list2[i].정신연령}<br>
	</c:forEach>
	
	<hr>
	varStaus<br>
	<c:forEach var="i" begin="0" end="4" step="2"  varStatus="loop">
		${i}
		<c:if test="${not loop.last }">
			,
		</c:if>
		<br>
		loop.index : ${loop.index }<br>
		loop.count : ${loop.count }<br>
		loop.first : ${loop.first }<br>
		loop.last : ${loop.last }<br>
	</c:forEach>
	
	<hr>
	items, begin 등 같이 사용<br>
	<c:forEach var="m" items="${list2}" begin="1" end="3" varStatus="loop">
		${loop.index},	${m.실제나이 }<br>
	</c:forEach>
	<hr>
	2~9단 출력 단, 3단 7단은 출력하지 않습니다.<br>
	<hr>
	
	<c:forEach var="i" begin="2" end="9">
			<c:if test="${i ne 3 and i ne 7}">
				<c:forEach var="j" begin = "1" end="9">
						${i} X ${j} = ${i*j}<br>
				</c:forEach>
			</c:if>
	</c:forEach> 
	<hr>
	1. context path를 자동으로 추가한다<br>
	2. 영어나 숫자 외의 문자를 encoding 해줌<br>
	3. cookie 금지일 때 ";jsessionid=어쩌고"를 자동으로 붙여줌
	<c:url var="url1" value="/el_4.jsp">
	</c:url>
	<a href="${url1 }" target="_blank">el_4.jsp</a>
	
	<c:url var="url2" value="https://search.naver.com/search.naver">
		<c:param name ="query" value="한글"/>
	</c:url>
	<a href="${url2 }" target="_blank">네이버</a>
	<hr>
	c:out<br>
	param.html : ${param.html } : innerHTML <br>
	c:out : <c:out value="${param.html }"/> innerText <br>
	<!-- 
		< : &lt;
		> : &gt;
		공백: %nbsp;
		% : &amp
	
	
	 -->
	
	
	
	
</body>
</html>