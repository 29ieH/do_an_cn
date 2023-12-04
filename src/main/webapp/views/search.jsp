<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@include file = "/taglif/libJSTL.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var = "list" value = "${listofname}" />
<c:forEach var="hs" items="${list}">
	<h3>Tên bệnh nhân : <c:out value = "${hs.tenBenhNhan}"/></h3>
</c:forEach>
</body>
</html>