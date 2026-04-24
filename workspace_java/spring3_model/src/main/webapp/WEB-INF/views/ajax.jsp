<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>ajax.jsp</h1>
	<button type="button" id="btn">ajax 실행</button><br>
	<button type="button" id="btn2">ajax 실행</button><br>
	<button type="button" id="btn3">ajax 실행</button><br>
	<button type="button" id="btn4">ajax4 실행</button><br>
	<button type="button" id="btn5">ajax5 실행</button><br>
	<button type="button" id="btn6">ajax6 실행</button><br>
	<div id="scott"></div>
	<div id="list1"></div>
	
	
	
	<table id="table">
		<thead>
		 <th>난</th>
		 <th>알아요</th>
		 <th>그걸</th>
		</thead>
		<tbody id="tbody">
			
		</tbody>
	</table>
	<script>
document.querySelector("#btn")
.addEventListener("click", function(){
	console.log("click!")	
	
		       

		        // 보낼 준비
		        // 방식mehtod, 주소
		        		       let url = 'ajax1?id=1234'
		    		   fetch(url, {method: 'get'}  )
		    		   .then(function(response){
		    			   return response.text()	   
		    		   }).then(function(data){
		    			   console.log(data)
		    		   }).catch(function(error){
		    	            console.error(error)
		    	        })
		        
	 
})

document.querySelector("#btn2")
.addEventListener("click", function(){
    console.log("click!")
    
    let url = 'ajax1'
    fetch(url, {
        method: 'post',
			
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: 'id=1234'   
    })
    .then(function(response){
        return response.text()
    }).then(function(data){
        console.log(data)
    }).catch(function(error){
        console.error(error)
    })
    
})

document.querySelector("#btn3")
.addEventListener("click", function(){
    console.log("click!")
    let param = {
    	id : 1234
    }
    const url = 'ajax2'
    fetch(url, {
//         method: 'get',
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(param) 
    })
    .then(function(response){
        return response.text()
    }).then(function(data){
        console.log(data)
    }).catch(function(error){
        console.error(error)
    })
    
})

document.querySelector("#btn4")
.addEventListener("click", function(){
    console.log("click!")
    
    const url = 'ajax2'
    let param = {
        	id : 1234
        }
    const xhr = new XMLHttpRequest()
    xhr.open("post", url)
    xhr.setRequestHeader('Content-Type', 'application/json')
    xhr.send(JSON.stringify(param) )
    xhr.onload = function(){
    	console.log(xhr.responseText)
    }
})


document.querySelector("#btn5")
.addEventListener("click", async function(){
    console.log("click!")
    let param = {
    	id : 1234
    }
    const url = 'ajax2'
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

document.querySelector("#btn6")
.addEventListener("click", async function(){
    console.log("click!")
    let param = {
    	
    }
//     const url = 'ajax3'
//     const url = 'ajax4'
    const url = 'ajax6'
    const response = await fetch(url, {
        method: 'post',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(param) 
    })
    
    
    const data = await response.text()
    console.log(JSON.parse(data))
    
    const a = JSON.parse(data)
    console.log(a.keyword)
    console.log(a.list)
    document.querySelector("#btn6")
    document.querySelector("#scott").innerHTML = a.keyword
    
    
    
    
    const table =document.querySelector("#tbody")
    table.innerHTML = ""
    
    for(let i =0; i< a.list.length; i++){
    	const id =a.list[i]["id"]
    	const pw =a.list[i]["pw"]
    	const email =a.list[i]["email"]
    	document.querySelector("tbody").innerHTML += `<tr><td>\${id}</td>
    	<td>\${pw}</td>
    	<td>\${email}</td></tr>`
    }
    
    document.querySelector("#tbody").append(table)
   
    
    
    
   	
})



</script>


</body>
</html>