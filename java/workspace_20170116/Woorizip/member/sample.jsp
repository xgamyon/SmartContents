<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<%
    String serverIP="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String userid="test2";
	String passwd="1234";
	
	Connection conn=null; //연결 담당용 클래스- 디비하고 연결했단 
	                      //연결 끊었다만 담당 
	Statement stmt=null;  //디비에 쿼리를 줘서 데이타 추가, 수정, 삭제
	                      // 등 ...
	ResultSet rs=null;    //디비에서 데이타 가져올때 이 객체에 담아온다 
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//ojdbc6.jar 파일안의 클래스를 불러오기 
		System.out.println("드라이버가 있습니다.");
		
		//1단계 : 디비와 연결하기 
		conn = DriverManager.getConnection(serverIP, userid, passwd);
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from tb_member");
		
		while(rs.next()) //데이타가 계속 있으면
		{
			out.print(rs.getString("member_id")+"<br/>");
			out.print(rs.getString("member_name")+"<br/>");
			out.print(rs.getString("userid")+"<br/>");
			out.print(rs.getString("password")+"<br/>");
			out.print(rs.getString("nickname")+"<br/>");
			out.print(rs.getString("phone")+"<br/>");
			out.print(rs.getString("email")+"<br/>");
			out.print(rs.getString("regdate")+"<br/>");
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




