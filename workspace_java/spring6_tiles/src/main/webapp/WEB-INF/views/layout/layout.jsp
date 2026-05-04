<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
	<tiles:insertAttribute name="title"/>
</title>
<style>
	div {
		border : 1px solid red;
	}
	.wrapper {
		display: flex;
	}
	.wrapper .aside{
		flex-grow:2;
	}
	.wrapper .content{
		flex-grow:8;
	}
	
</style>
<script>
	window.onload = function(){
		alert(1)
		
	}
	window.addEventListener('load', function(){
		alert(11)
	})
</script>
</head>
<body>

<%-- <%@ import %> --%>
<%-- <jsp:include page=""/> --%>

<header>
	헤더
	<tiles:insertAttribute name="header"/>
	로고, 메뉴
	<nav>메뉴1, 메뉴2</nav>
<!-- header -->
</header>
<!--  main START -->
<section class="wrapper">
	<!-- aside -->
	<aside class="aside">
	사이드 메뉴
	<tiles:insertAttribute name="side"/>
	
	</aside>
	<!-- content -->
	<article class="content">
	기사 본체
	<tiles:insertAttribute name="content"/>
	
	</article>
</section>
<!--  main END -->

<footer>
	푸터
	<tiles:insertAttribute name="footer"/>
</footer>

</body>
</html>