<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.HashMap"
	import = "java.util.Map"
	import = "java.util.ArrayList"
	import = "java.util.List"
	import = "forward.TodoDTO"
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello

	<% 
	int num= (int) request.getAttribute("num");
	Map map = (Map)request.getAttribute("map");
	List list = (ArrayList)request.getAttribute("list");
	String[] arr = (String[])request.getAttribute("arr");
	TodoDTO dto = (TodoDTO)request.getAttribute("dto");
	System.out.println(num);
	System.out.println(map.get("개수"));
	System.out.println(list);
	
	
	out.write(num + "<br>");
	out.println(map.get("개수") + "<br>");
	out.println(map.get("점심") + "<br>");
	
	for(int i = 0; i<list.size(); i++){
		out.println("list 출력 :"+list.get(i) +"<br>");
	}
	out.println(list + "<br>");
	out.println(arr + "<br>");
	for(int i = 0; i<arr.length; i++){
		out.println("arr 출력 :"+arr[i] +"<br>");
	}
	out.println(dto + "<br>");
	%>
	
	<% for(int i = 0; i<arr.length; i++){%>
		<%= ("arr 출력 :"+arr[i] +"<br>") %>
	<%}%>
	
	<br>
	<%= num %><br>
	<%= map %><br>
	<%= list %><br>
	<%= arr %><br>
	<%= dto %>
	
	
	
	
	
	
	
	
	
</body>
</html>