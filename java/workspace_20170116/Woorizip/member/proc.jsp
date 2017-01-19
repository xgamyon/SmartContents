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
	request.setCharacterEncoding("utf-8");
	//한글 안깨지게 하려면 꼭 붙여야 한다 
	
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String nickname=request.getParameter("nickname");
	String email1=request.getParameter("email1");
	String email2=request.getParameter("email2");
	String phone=request.getParameter("phone");
	String gender=request.getParameter("gender");
	String member_id=request.getParameter("userid");
    String year = request.getParameter("year");
    String month = request.getParameter("month");
    String day = request.getParameter("day");
    
    String email = email1 + "@" + email2;
    String birthday = year+"-"+month+"-"+day;
    
	StringBuilder builder = new StringBuilder();
	builder.append("insert into tb_member( ");
	builder.append(" member_id, ");
	builder.append(" member_name,");
	builder.append(" userid, ");
	builder.append(" password, ");
	builder.append(" phone, ");
	builder.append(" email, ");
	builder.append(" nickname, ");
	builder.append(" birthday, ");
	builder.append(" gender, ");
	builder.append(" regdate) values( ");
	builder.append("(select nvl(max(member_id), 0)+1 from tb_member),");
	builder.append("'" + name + "', ");
	builder.append("'" + member_id + "', ");
	builder.append("'" + password + "', ");
	builder.append("'" + phone + "', ");
	builder.append("'" + email + "', ");
	builder.append("'" + nickname + "', ");
	builder.append("'" + birthday + "', ");
	builder.append("'" + gender + "', ");
	builder.append(" sysdate ) ");
	
	out.println(builder.toString());
	out.println("<br/><br/>");
	
    String serverIP="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String userid="test2";
	String passwd="1234";
	
	Connection conn=null; //연결 담당용 클래스- 디비하고 연결했단                       //연결 끊었다만 담당 
	Statement stmt=null;  //디비에 쿼리를 줘서 데이타 추가, 수정, 삭제
	ResultSet rs=null;    //디비에서 데이타 가져올때 이 객체에 담아온다 
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//ojdbc6.jar 파일안의 클래스를 불러오기 
		System.out.println("드라이버가 있습니다.");
		
		//1단계 : 디비와 연결하기 
		conn = DriverManager.getConnection(serverIP, userid, passwd);
		
		stmt = conn.createStatement();
		//디비에 저장하기 
		stmt.execute(builder.toString());
		
		stmt.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
		conn.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
	}
	catch(Exception ex)//문제가 생겼을때만 수행된다. 
	{
		ex.printStackTrace();
	}
	
	
%>




