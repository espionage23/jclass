<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body>
		<h2>메인페이지</h2>
		<div>세션정보 표준: <%= session.getAttribute("session_id") %></div>
		<div>세션정보 EL: ${ session_id }</div>
		
		<% if(session.getAttribute("session_id") == null){ %>
		<ul>
			<li>회원가입</li>
			<li><a href="./login.jsp">로그인</a></li>
		<%}else{ %>
			<li><a href="./logout.jsp">로그아웃</a></li>
			<li>회원정보</li>
			<li>게시판</li>
		<%} %>
		</ul>
	</body>
</html>