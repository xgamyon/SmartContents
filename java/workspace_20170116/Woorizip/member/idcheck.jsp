<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>

<%
String serverIP="jdbc:oracle:thin:@127.0.0.1:1521:xe";
String userid="test2";
String passwd="1234";

Connection conn=null;  
Statement stmt=null; 
ResultSet rs=null; 
String value="";

try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection(serverIP, userid, passwd);
	String id = request.getParameter("userid");
	stmt = conn.createStatement();
	String sql = "select count(*) from tb_member where "
			     + " userid='" + id + "' ";
	System.out.println(sql);
	//해당 아이디를 사용하는 사람이 있는지 숫자를 세어온다 
	rs = stmt.executeQuery(sql);
	rs.next(); //하나 읽고나야 데이타를 읽을 수 있다 
	
	if(rs.getInt(1)==0)//자바가 데이타 갖고 1번방부터 확인
	{
		value="Y";
	}
	else
	{
		value="N";
	}
	rs.close();  //사용종료후 하나씩 꼭 닫아줘야 한다 
	stmt.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
	conn.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
}
catch(Exception ex)//문제가 생겼을때만 수행된다. 
{
	ex.printStackTrace();
}
%>
{"useyn":"<%=value%>"}

