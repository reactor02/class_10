<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<h1>파일 하나</h1>
<form method="post" 
	action="upload" 
	enctype="multipart/form-data" accept-charset="utf=8">
	
	제목: <input type="text" name=title><br>
	내용 : <textarea name="content" cols=30 rows=10>
	</textarea><br>
	파일첨부: <input type="file" name="file"><br>
	<input type="submit" value="등록">

</form>
<h1>파일 여러개</h1>
<form method="post" 
	action="uploads" 
	enctype="multipart/form-data" accept-charset="utf=8">
	
	제목: <input type="text" name=title><br>
	내용 : <textarea name="content" cols=30 rows=10>
	</textarea><br>
	파일첨부: <input type="file" name="file" multiple="multiple"><br>
	<input type="submit" value="등록">
	
	<select multiple>
		<option>1</option>
		<option>2</option>
		<option>3</option>
		<option>4</option>
		<option>5</option>
		<option>6</option>
	</select>

</form>
</body>
</html>