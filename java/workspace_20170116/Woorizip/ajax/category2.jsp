<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String value=request.getParameter("value");
	String sql = "select code, descript from tb_code where parent='" 
                 + value + "' ";
	//out.print(sql);
	
    String serverIP="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String userid="test2";
	String passwd="1234";
	
	Connection conn=null;  
	Statement stmt=null;  
	ResultSet rs=null;   
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(serverIP, userid, passwd);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		out.print("<select name='category2'>");
		out.print("<option value=''>선택하세요</option>");
		while(rs.next()) //데이타가 계속 있으면
		{
		 out.print("<option value'" + rs.getString("code")+"'>");
		 out.print(rs.getString("descript")+"</option><br/>");		
		}	
		out.print("</select>");
		rs.close();  //사용종료후 하나씩 꼭 닫아줘야 한다 
		stmt.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
		conn.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
	}
	catch(Exception ex)//문제가 생겼을때만 수행된다. 
	{
		ex.printStackTrace();
	}
%>



