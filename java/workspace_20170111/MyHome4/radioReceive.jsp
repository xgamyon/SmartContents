<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 파일명 : receiveArray.jsp -->
<%
String gender = request.getParameter("gender");
String age = request.getParameter("age");

if(gender.equals("F"))
	out.print("여자입니다<br/>");
else
	out.print("남자입니다<br/>");
//문자열 비교는 .equals 이다.
out.print(age+"0대입니다.<br/>");
%>
<%=gender%>
<%=age%>
</body>
</html>