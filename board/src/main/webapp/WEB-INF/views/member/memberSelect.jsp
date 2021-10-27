<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../home/header.jsp"></jsp:include>
<body>
<div align="center">
	<div>
		<table border="1" style="margin-top: 10px">
			<tr>
				<th>아이디</th>
				<td>${member.id }</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td>${member.password }</td>
			</tr>
			<tr>
				<th>이 름</th>
				<td>${member.name }</td>
			</tr>
			<tr>
				<th>주 소</th>
				<td>${member.address }</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${member.tel }</td>
			</tr>
			<tr>
				<th>권한</th>
				<td>${member.author }</td>
			</tr>
		</table>
	</div>
</div>
</body>
</html>