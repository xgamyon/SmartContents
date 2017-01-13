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
String subject= request.getParameter("subject");
if(subject == null || subject.equals(""))
	out.println("선택안함");
else
{
	String []subjects = new String[]{"java", "html",
			"css", "javascript", "jquery"};
	int sel = Integer.parseInt(subject);
	out.println(subjects[sel-1]);
}
	
%>
</body>
</html>