/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M15
 * Generated at: 2017-01-23 02:49:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head> \r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/earlyaccess/nanumgothic.css\" type=\"text/css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css\" type=\"text/css\" />  \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write(" \t<script src=\"http://code.jquery.com/ui/1.8.18/jquery-ui.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/style.js\">\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>회원가입2</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t//문서가 다 불러와지면 이 함수가 호출된다. \r\n");
      out.write("\t\r\n");
      out.write("\t// 해당 아이디를 갖는 input 태그에 달력 붙이기\r\n");
      out.write("\t$(\"#testDatepicker\").datepicker({\r\n");
      out.write("\t\tshowOn: \"both\", \r\n");
      out.write("        buttonImage: \"button.png\", \r\n");
      out.write("        buttonImageOnly: true,\r\n");
      out.write("        dateFormat:\"yy-mm-dd\",\r\n");
      out.write("        changeMonth: true, \r\n");
      out.write("        dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],\r\n");
      out.write("        dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], \r\n");
      out.write("        monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],\r\n");
      out.write("        monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#btnCerti\").click(function(){\r\n");
      out.write("\t\talert(\"인증번호가 재 전송 되었습니다.\");\r\n");
      out.write("\t}); \r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#btnSend\").click(function(){\r\n");
      out.write("\t\t//폼전송하기 - jquery사용시에는 form태그에 반드시 id를 줘야 한다 \t\t\r\n");
      out.write("\t\t$(\"#myform\").attr(\"action\", \"proc.jsp\");\r\n");
      out.write("\t\t$(\"#myform\").attr(\"method\", \"post\");\r\n");
      out.write("\t\t$(\"#myform\").submit();//전송시키고 \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//에러 체크 하고 싶으면 전송이벤트를 중간에 가로채서 작업을 \r\n");
      out.write("\t//해야 한다 - 여기서 오류처리를 한다 \r\n");
      out.write("\t$(\"#myform\").submit(function(){\r\n");
      out.write("\t\t//문제1 : userid가 null값이면 전송못하게 \r\n");
      out.write("\t\tif( $(\"#userid\").val().trim().length<6 || \r\n");
      out.write("\t\t\t\t$(\"#userid\").val().trim().length>30)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"아이디는 6자리이상 30자리 이하로 작성하세요\");\r\n");
      out.write("\t\t\t$(\"#userid\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tif($(\"#password\").val().trim().length<6 )\r\n");
      out.write("\t    {\r\n");
      out.write("\t    \talert(\"비밀번호는 6자리 이상 입력해주세요\");\r\n");
      out.write("\t    \t$(\"#password\").focus();\r\n");
      out.write("\t    \treturn false;\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#password\").val().trim()!= $(\"#password1\").val())\r\n");
      out.write("\t    {\r\n");
      out.write("\t    \talert(\"비밀번호와 비밀번호 확인이 일치하지 않습니다\");\r\n");
      out.write("\t    \t$(\"#password\").focus();\r\n");
      out.write("\t    \treturn false;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#userid\").keyup( function(){\r\n");
      out.write("\t\t//1. 값 읽어오기 \r\n");
      out.write("\t\tvar id = $(\"#userid\").val();\r\n");
      out.write("\t\tif( id.length>=6){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//아이디가 이미 사용중인지 여기서 ajax를 통해 확인해보려고 한다 \r\n");
      out.write("\t\t\t  $.ajax({\r\n");
      out.write("\t\t    \t    type:\"POST\",\r\n");
      out.write("\t\t    \t    data:\"userid=\"+id,\r\n");
      out.write("\t\t    \t\turl: \"idcheck.jsp\", //호출할 문서명\r\n");
      out.write("\t\t    \t   \tsuccess: function(result){\r\n");
      out.write("\t\t    \t   \t \tdata = $.parseJSON(result);\r\n");
      out.write("\t\t    \t   \t \tif(data.useyn==\"Y\")\r\n");
      out.write("\t\t    \t   \t \t{\r\n");
      out.write("\t\t    \t   \t\t\t$(\"#idresult\").html(\"사용가능\");\r\n");
      out.write("\t\t    \t   \t\t\t$(\"#idcheck\").val(\"Y\");\r\n");
      out.write("\t\t    \t   \t \t}\r\n");
      out.write("\t\t    \t   \t \telse\r\n");
      out.write("\t\t    \t   \t \t{\r\n");
      out.write("\t\t    \t   \t \t\t$(\"#idresult\").html(\"이미 사용중입니다\");\r\n");
      out.write("\t\t    \t   \t \t\t$(\"#idcheck\").val(\"N\");\r\n");
      out.write("\t\t    \t   \t \t}\r\n");
      out.write("\t\t    \t\t},//에러 없을때\r\n");
      out.write("\t\t    \t\terror: function(err){\r\n");
      out.write("\t\t    \t\t\talert(err.responseText);\r\n");
      out.write("\t\t    \t\t}//에러있을때 \r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#idresult\").html(\"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");
    //한글 안깨지게 
	String hpYn = request.getParameter("hpYn");
    if(hpYn==null || hpYn.equals(""))
    	hpYn="1";
	String name="장길산";
	String phone="010-1111-1111";
	String email="jang@hanmail.net";
	
	if(hpYn.equals("1"))
	{
		name = request.getParameter("name1");
		phone = request.getParameter("phone");
		email ="";
	}
	else
	{
		name = request.getParameter("name2");
		phone = "";
		email = request.getParameter("email1")+
				"@" + request.getParameter("email2");
	}
	//디버깅용
	System.out.println("이름 : " + name);
	System.out.println("전화 : " + phone);
	System.out.println("이메일 : " + email);
	

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 파일명 : join2.jsp -->\r\n");
      out.write("<form name=\"myform\" id=\"myform\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"name\"  value=\"");
      out.print(name);
      out.write("\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"certi_number\" value=\"1234\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"idcheck\" id=\"idcheck\" value=\"N\" >\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("    </header>\r\n");
      out.write("    <section class=\"join\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <a href=\"join1.html\"><img src=\"../images/logo.png\" alt=\"melon\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <h1>회원가입</h1>\r\n");
      out.write("            <div class=\"form\">\r\n");
      out.write("                <div class=\"phone\">\r\n");
      out.write("                    <div class=\"name\">");
      out.print(name);
      out.write(" 님</div>\r\n");
      out.write("                    ");
if(hpYn.equals("1")){ 
      out.write("\r\n");
      out.write("                    <p>");
      out.print(phone );
      out.write("로 인증번호를 전송했습니다.</p>\r\n");
      out.write("                    ");
}else{ 
      out.write("\r\n");
      out.write("                    <p>");
      out.print(email );
      out.write("로 인증번호를 전송했습니다.</p>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <colgroup>\r\n");
      out.write("                            <col width=\"100px\">\r\n");
      out.write("                            <col width=\"300px\">\r\n");
      out.write("                        </colgroup>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>인증 번호</td>\r\n");
      out.write("                                <td class=\"text\">\r\n");
      out.write("                                    <input type=\"text\" name=\"number\" id=\"number\" placeholder=\"인증 번호 입력\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td></td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <div class=\"resend\">\r\n");
      out.write("                                        <a href=\"javascript:void(0)\" id=\"btnCerti\">인증 번호 재전송</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"line\"></div>\r\n");
      out.write("            <div class=\"join_form\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <colgroup>\r\n");
      out.write("                        <col width=\"100px\">\r\n");
      out.write("                        <col width=\"300px\">\r\n");
      out.write("                    </colgroup>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td >아이디</td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                                <input type=\"text\" name=\"userid\" id=\"userid\" size=\"10\" placeholder=\"6~30자로 입력\">\r\n");
      out.write("                                <span id=\"idresult\" style=\"color:red\"></span>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td >비밀번호</td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                                <input type=\"text\" name=\"password\" id=\"password\"\r\n");
      out.write("                                placeholder=\"비밀번호 입력\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td></td>\r\n");
      out.write("                            <td><p>8자 ~ 20자, 영문, 숫자, 특수문자 사용</p></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td ></td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                                <input type=\"text\" name=\"password1\" id=\"password1\" placeholder=\"비밀번호 확인\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>닉네임</td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                                <input type=\"text\" name=\"nickname\" id=\"nickname\" placeholder=\"한글, 영문 2~15자 입력\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>성별</td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"M\" checked> 남자 &nbsp;&nbsp;\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" value=\"F\"> 여자\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>생년월일</td>\r\n");
      out.write("                            <td class=\"text\">\r\n");
      out.write("                            \t<input type=\"text\" id=\"testDatepicker\" name=\"birthday\">\r\n");
      out.write("                                <!--<div class=\"birthday_form\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"number\" name=\"year\" id=\"year\" placeholder=\"\"> 년\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"number\" name=\"month\" id=\"month\" placeholder=\"\"> 월\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"number\" name=\"day\" id=\"day\" placeholder=\"\"> 일\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div> -->\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td id=\"email\">이메일</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <div class=\"email_form\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <input type=\"text\" name=\"email1\" id=\"email1\" \r\n");
      out.write("                                                        placeholder=\"이메일 아이디 입력\">\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <select  name=\"email2\" id=\"email2\">\r\n");
      out.write("                                                <option value=\"\">@ 선택</option>\r\n");
      out.write("                                                <option value=\"naver.com\">naver.com</option>\r\n");
      out.write("                                                <option value=\"daum.net\">daum.net</option>\r\n");
      out.write("                                                <option value=\"nate.com\">nate.com</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"nextbt\">\r\n");
      out.write("                <a href=\"#none\" id=\"btnSend\">가입 완료</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("   \r\n");
      out.write("   </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
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
