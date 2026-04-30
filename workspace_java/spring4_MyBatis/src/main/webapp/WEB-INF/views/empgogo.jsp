<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/human4/list">리스트</a>
<a href="http://localhost:8080/human4/one">하나</a>
<a href="http://localhost:8080/human4/onemap">맵하나</a>
<a href="#" id="abtn">아작스 드가자</a>
<div id="result"></div>

<script>
const abtn = document.querySelector("#abtn")

abtn.addEventListener("click", async function(e) {
    e.preventDefault();
    
    const response = await fetch('one2')
    const emp = await response.json()
    
    let html = '<table border="1">' +
        '<thead><tr>' +
        '<th>empno</th><th>ename</th><th>job</th><th>mgr</th>' +
        '<th>hiredate</th><th>sal</th><th>comm</th><th>deptno</th>' +
        '</tr></thead>' +
        '<tbody><tr>' +
        '<td>' + emp.empno + '</td>' +
        '<td>' + emp.ename + '</td>' +
        '<td>' + emp.job + '</td>' +
        '<td>' + emp.mgr + '</td>' +
        '<td>' + emp.hiredate + '</td>' +
        '<td>' + emp.sal + '</td>' +
        '<td>' + (emp.comm != null ? emp.comm : '') + '</td>' +
        '<td>' + emp.deptno + '</td>' +
        '</tr></tbody>' +
        '</table>'
    
    document.getElementById('result').innerHTML = html
})

</script>
</body>
</html>