<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello</h2>
<% String myApp = request.getContextPath(); %>
<p>Bắt đầu ở đây <a href=<%=myApp%>/timhosobenhnhan>Bắt đầu</a> </p>
</body>
</html>