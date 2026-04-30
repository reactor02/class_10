<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="aa" method="post">
<select name="coffeeSelect1">
	<option value="a1">아아</option>
	<option value="a2">아노</option>
	<option value="a3">아카</option>
</select>
<input type="number" name="number1"><br>
<select name="coffeeSelect2">
	<option value="b1">얼박사</option>
	<option value="b2">불박사</option>
	<option value="b3">풀박사</option>
</select>
<input type="number" name="number2">
<button>간다</button>



</form>
[주문하기]<br>

${map.coffeeSelect1} x  ${map.number1}개<br>
${map.coffeeSelect1} x  ${map.number2}개<br>


총합 가격:${map.price1 * map.number1 + map.price2 * map.number2}




<hr>
<select name="coffeeSelect3">
	<option value="1">아아</option>
	<option value="2">아노</option>
	<option value="3">아카</option>
</select>
<input type="number" name="number3"><br>
<select name="coffeeSelect4">
	<option value="1">얼박사</option>
	<option value="2">불박사</option>
	<option value="3">풀박사</option>
</select>
<input type="number" name="number4">
<input type="button" value="ajax" id="card">에러</button>

${map.coffeeSelect3} x  ${map.number3}개<br>
${map.coffeeSelect4} x  ${map.number4}개<br>

<script>
const c1 = document.querySelector("coffeeSelect3").value
const c2 = document.querySelector("coffeeSelect4").value
const num1 = document.querySelector("number3").value
const num2 = document.querySelector("number4").value

document.querySelector("#card")
.addEventListener("click", async function(e){
    console.log("click!")
    let param = {
    	coffeeSelect3 : c1
    	
    }
    const url = 'aa23'
    const response = await fetch(url, {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(param) 
    })
    
    
    const data = await response.text()
    console.log(data) 
})

</script>



</body>
</html>