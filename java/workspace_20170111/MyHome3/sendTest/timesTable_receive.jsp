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
	String gugu = request.getParameter("gugudan");

	int numgugu = Integer.parseInt(gugu);
%>
<%
	for(int i=1; i<=9; i++){
		out.print(numgugu + " X "+ i + " = " + (numgugu * i) + "<br/>");
		System.out.print(i); //시스템아웃은 콘솔창
	}
%>
</body>
</html>