<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="cpcontroller">
		<input type="hidden" name="id" value="${param.id }">
		<button>진짜 삭제할래?</button>
	</form>
</body>
</html>