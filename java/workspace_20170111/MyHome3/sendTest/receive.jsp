<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 서버로 전달되어 온 정보 처리하기
	// jsp에서 request 라는 객체를 만들어줌
	// request.getParameter를 이용해 정보를 읽는다.
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
%>
아이디 : <%=userid%></br>
패스워드 : <%=password%></br>
</body>
</html>