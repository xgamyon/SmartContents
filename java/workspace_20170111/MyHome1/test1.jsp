<%@ page language="java" 
		contentType="text/html;charset=EUC-KR"
        pageEncoding="EUC-KR"%>
        
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("<font color=red>MyHome</font>");

	String name="ȫ�浿";
	int age=23;

%>
<br/>
�̸� : <%=name%> <br/>
���� : <%=age%> <br/>

<%
for(int i=1; i<=10; i++)
{
%>
	<div style="font-size:<%=20+i*2%>px">�۲�</div>
<%
}
%>
</body>
</html>


