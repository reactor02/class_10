<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
음식선택:
	<select name="food">
		<option value=1>햄버거
		<option value=2>고기
		<option value=3>삼겹살
	</select>
	<input type="button" id="btn1" value="먹기">
운동선택:
	<select name="workout">
		<option value=1>걷기
		<option value=2>수영
		<option value=3>에어로빅
	</select>
	<input type="btn2" value="운동하기">
	
</body>
<script>
document.querySelector("#btn1").addEventListener("click", async function(){
	const food = document.querySelector("[name=food]").value
	
	
	
	
})
document.querySelector("#btn2").addEventListener("click", async function(){
	const workout = document.querySelector("[name=workout]").value
	
	
	
})

</script>

</html>