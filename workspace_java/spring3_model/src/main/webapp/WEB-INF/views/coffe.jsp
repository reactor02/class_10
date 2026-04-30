<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.addEventListener("load", (evt)=>{
		bind()
		
	})
	
	function bind(){
		document.querySelector("input[type=submit]").addEventListener('click', function(){
			console.log('서밋')
			evt.preventDefault();
			
			const menu = document.getElemntById('menu').value
			const count = document.getElemntById('count').value
			const form = document.querySelector('form')
			
			let param = {
				menu: menu;
				count: count
			}
			
			fetch("cafe2", {
				method : 'post',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify(param)
			}).then(resp => resp.text()).then(function(data){
				console.log(data)
				console.log("data.price" +data.price)
				console.log("data[\"menu\"]"+data["menu"])
				
			})
			
			
			form.submit()
		})
		
	document.querySelector("#btn").addEventListener('click', function(evt){
		const menus = document.querySelector("#menus")
		
		const div = document.createElement('div')
		div.setAttribute('class', 'menu')
		div.classList.add('menu')
		div.innerHTML: = `
			종류: <select name="menu" id="menu">
			<option value="americano">아메리카노</option>
			<option value="cider">얼박사</option>
			<option value="latte">라떼</option>
			<option value="peppermint">페퍼민트</option>
		</select>
	<!-- 		<input type=hidden name=price> js로 값채워서 전송 -->
		개수: <input type="number" name="count" id="count">
		
		`
		menus.append(div)
		
		
		
		
	}
</script>
</head>
<body>
<button type="button" id="btn">메뉴 추가하기</button>
<form method="post" action="cafe">
<div id="menus">
	<div class="menu">
	종류: <select name="menu" id="menu">
		<option value="americano">아메리카노</option>
		<option value="cider">얼박사</option>
		<option value="latte">라떼</option>
		<option value="peppermint">페퍼민트</option>
	</select>
<!-- 		<input type=hidden name=price> js로 값채워서 전송 -->
	개수: <input type="number" name="count" id="count">
		</div>
	</div>
	<input type="submit" value="주문하기">
</form>

-----------------<br>
	주문내역<br>
-----------------<br>
품목 / 가격 /  개수<br>
${menu } ${price} ${count}<br>
-----------------<br>

총액 : 

</body>
</html>