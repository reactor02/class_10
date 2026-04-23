<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	
	id : ${param.id}
	<form method="post" action="forward">
		<input name="id" type="hidden" value="${param.id}">
		pw : <input name="pw" value="${param.pw}"><br>
		phoneNum : <input name="phoneNum" value="${param.phoneNum}"><br>
		name : <input name="name" value="${param.name}"><br>
		joinDate: ${param.joinDate}<br>
		<button>수정 드가자</button>
	</form>
</body>
</html>