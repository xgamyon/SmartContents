/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M15
 * Generated at: 2017-01-18 05:41:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class proc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");

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
		//디비에 저장하기 
		stmt.execute(builder.toString());
		
		stmt.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
		conn.close();//사용종료후 하나씩 꼭 닫아줘야 한다 
	}
	catch(Exception ex)//문제가 생겼을때만 수행된다. 
	{
		ex.printStackTrace();
	}
	
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
