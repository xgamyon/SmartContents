<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
String userid=request.getParameter("userid");
String password=request.getParameter("password");
String name=request.getParameter("name");
%>
사용자 아이디 : <%=userid%> 패스워드 : <%=password%> 이름 : <%=name%>
</body>
</html>