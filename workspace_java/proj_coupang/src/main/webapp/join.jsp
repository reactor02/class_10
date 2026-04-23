<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<form method="post" action="cpcontroller">
			<div id="box1" class="box">

				<div>
					<span class="small"><img src="#" alt="#"></span><input
						type="text" id="id" name="id" placeholder="아이디(이메일)">
				</div>
				<br>
				<div>
					<span class="small"><img src="#" alt="#"></span><input
						type="password" class="pw" name="pw" placeholder="비밀번호">
				</div>
				<br>
				<div>
					<span class="small"><img src="#" alt="#"></span><input
						type="password" class="pw" placeholder="비밀번호 확인">
				</div>
				<br>
				<div>
					<span class="small"><img src="#" alt="#"></span><input
						type="text" name="name" placeholder="이름">
				</div>
				<br>
				<div>
					<span class="small"><img src="#" alt="#"></span><input
						type="number" name="phoneNum" placeholder="전화번호">
				</div>
				<br>
			</div>
			<div id="box2" class="box">

				<input type="checkbox"  id="checkAll"> 모두
				확인하였으며 동의합니다<br>
			</div>
			<div id="box" class="box">
				<div>
					<input type="checkbox" name="essential" value="0">[필수] 만 14세 이상입니다
				</div>
				<div>
					<input type="checkbox" name="essential" value="0">[필수] 쿠팡 이용약관 동의
					<button type="button">></button>
				</div>
				<div>
					<input type="checkbox" name="essential" value="0">[필수] 전자금융거래 이용약관
					동의
					<button type="button">></button>
				</div>
				<div>
					<input type="checkbox" name="essential" value="0">[필수] 개인정보 제3자 제공
					동의
					<button type="button">></button>
				</div>
				<div>
					<input type="checkbox" class="optionCheck1" name="option" value="0">[선택]
					마케팅 목적의 개인정보 수집 및 이용 동의
					<button type="button">></button>
				</div>
				<div>
					<input type="checkbox" class="optionCheck2" >선택]
					광고성 정보 수신 동의
					<button type="button">></button>
				</div>
				<div>
					<input type="checkbox" name="option" value="0">[선택] 광고성 정보 수신 동의
				</div>
				<div>
					<input type="checkbox" name="option" value="0">[선택] SMS, SNS 수신 동의
				</div>
				<div>
					<input type="checkbox" name="option" value="0">[선택] 앱 푸시 수신 동의
				</div>
			</div>
			<div>
				<a>개인정보 수집 및 이용 안내</a>를 확인해주세요.
			</div>
			<button>동의하고 가입하기</button>
		</form>
	</div>
</body>
</html>