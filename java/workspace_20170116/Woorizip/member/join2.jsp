<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head> 
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/style.css" type="text/css">
    <link rel="stylesheet" href="http://fonts.googleapis.com/earlyaccess/nanumgothic.css" type="text/css">
    
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
 	<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
    <script src="../js/style.js">

    </script>
    <title>회원가입2</title>
</head>
<script type="text/javascript">
$(document).ready(function(){
	//문서가 다 불러와지면 이 함수가 호출된다. 
	
	// 해당 아이디를 갖는 input 태그에 달력 붙이기
	$("#testDatepicker").datepicker({
		showOn: "both", 
        buttonImage: "button.png", 
        buttonImageOnly: true,
        dateFormat:"yy-mm-dd",
        changeMonth: true, 
        dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
        dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
        monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
        monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']

	});
	
	$("#btnCerti").click(function(){
		alert("인증번호가 재 전송 되었습니다.");
	}); 
	
	$("#btnSend").click(function(){
		//폼전송하기 - jquery사용시에는 form태그에 반드시 id를 줘야 한다 		
		$("#myform").attr("action", "proc.jsp");
		$("#myform").attr("method", "post");
		$("#myform").submit();//전송시키고 
	});
	
	//에러 체크 하고 싶으면 전송이벤트를 중간에 가로채서 작업을 
	//해야 한다 - 여기서 오류처리를 한다 
	$("#myform").submit(function(){
		//문제1 : userid가 null값이면 전송못하게 
		if( $("#userid").val().trim().length<6 || 
				$("#userid").val().trim().length>30)
		{
			alert("아이디는 6자리이상 30자리 이하로 작성하세요");
			$("#userid").focus();
			return false;
		}
	
		if($("#password").val().trim().length<6 )
	    {
	    	alert("비밀번호는 6자리 이상 입력해주세요");
	    	$("#password").focus();
	    	return false;
	    }
		
		if($("#password").val().trim()!= $("#password1").val())
	    {
	    	alert("비밀번호와 비밀번호 확인이 일치하지 않습니다");
	    	$("#password").focus();
	    	return false;
	    }
	    
	});
	
	$("#userid").keyup( function(){
		//1. 값 읽어오기 
		var id = $("#userid").val();
		if( id.length>=6){
			
			//아이디가 이미 사용중인지 여기서 ajax를 통해 확인해보려고 한다 
			  $.ajax({
		    	    type:"POST",
		    	    data:"userid="+id,
		    		url: "idcheck.jsp", //호출할 문서명
		    	   	success: function(result){
		    	   	 	data = $.parseJSON(result);
		    	   	 	if(data.useyn=="Y")
		    	   	 	{
		    	   			$("#idresult").html("사용가능");
		    	   			$("#idcheck").val("Y");
		    	   	 	}
		    	   	 	else
		    	   	 	{
		    	   	 		$("#idresult").html("이미 사용중입니다");
		    	   	 		$("#idcheck").val("N");
		    	   	 	}
		    		},//에러 없을때
		    		error: function(err){
		    			alert(err.responseText);
		    		}//에러있을때 
		    });
		}else{
			$("#idresult").html("");
		}
	});
	
});

</script>

<%
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
	
%>
<body>
<!-- 파일명 : join2.jsp -->
<form name="myform" id="myform">
	<input type="hidden" name="name"  value="<%=name%>" >
	<input type="hidden" name="phone" value="<%=phone%>" >
	<input type="hidden" name="certi_number" value="1234" >
	<input type="hidden" name="idcheck" id="idcheck" value="N" >
	

    <header>
    </header>
    <section class="join">
        <div class="logo">
            <a href="join1.html"><img src="../images/logo.png" alt="melon"></a>
        </div>
        <div class="wrap">
            <h1>회원가입</h1>
            <div class="form">
                <div class="phone">
                    <div class="name"><%=name%> 님</div>
                    <%if(hpYn.equals("1")){ %>
                    <p><%=phone %>로 인증번호를 전송했습니다.</p>
                    <%}else{ %>
                    <p><%=email %>로 인증번호를 전송했습니다.</p>
                    <%}%>
                    <table>
                        <colgroup>
                            <col width="100px">
                            <col width="300px">
                        </colgroup>
                        <tbody>
                            <tr>
                                <td>인증 번호</td>
                                <td class="text">
                                    <input type="text" name="number" id="number" placeholder="인증 번호 입력">
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <div class="resend">
                                        <a href="javascript:void(0)" id="btnCerti">인증 번호 재전송</a>
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="line"></div>
            <div class="join_form">
                <table>
                    <colgroup>
                        <col width="100px">
                        <col width="300px">
                    </colgroup>
                    <tbody>
                        <tr>
                            <td >아이디</td>
                            <td class="text">
                                <input type="text" name="userid" id="userid" size="10" placeholder="6~30자로 입력">
                                <span id="idresult" style="color:red"></span>
                            </td>
                        </tr>
                        <tr>
                            <td >비밀번호</td>
                            <td class="text">
                                <input type="text" name="password" id="password"
                                placeholder="비밀번호 입력">
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><p>8자 ~ 20자, 영문, 숫자, 특수문자 사용</p></td>
                        </tr>
                        <tr>
                            <td ></td>
                            <td class="text">
                                <input type="text" name="password1" id="password1" placeholder="비밀번호 확인">
                            </td>
                        </tr>
                        <tr>
                            <td>닉네임</td>
                            <td class="text">
                                <input type="text" name="nickname" id="nickname" placeholder="한글, 영문 2~15자 입력">
                            </td>
                        </tr>
                        <tr>
                            <td>성별</td>
                            <td class="text">
                                <input type="radio" name="gender" value="M" checked> 남자 &nbsp;&nbsp;
                                <input type="radio" name="gender" value="F"> 여자
                            </td>
                        </tr>
                        <tr>
                            <td>생년월일</td>
                            <td class="text">
                            	<input type="text" id="testDatepicker" name="birthday">
                                <!--<div class="birthday_form">
                                    <ul>
                                        <li>
                                            <input type="number" name="year" id="year" placeholder=""> 년
                                        </li>
                                        <li>
                                            <input type="number" name="month" id="month" placeholder=""> 월
                                        </li>
                                        <li>
                                            <input type="number" name="day" id="day" placeholder=""> 일
                                        </li>
                                    </ul>
                                </div> -->
                            </td>
                        </tr>
                        <tr>
                            <td id="email">이메일</td>
                            <td>
                                <div class="email_form">
                                    <ul>
                                        <li>
                                            <input type="text" name="email1" id="email1" 
                                                        placeholder="이메일 아이디 입력">
                                        </li>
                                        <li>
                                            <select  name="email2" id="email2">
                                                <option value="">@ 선택</option>
                                                <option value="naver.com">naver.com</option>
                                                <option value="daum.net">daum.net</option>
                                                <option value="nate.com">nate.com</option>
                                            </select>
                                        </li>
                                    </ul>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="nextbt">
                <a href="#none" id="btnSend">가입 완료</a>
            </div>
        </div>
    </section>
   
   </form>
</body>
</html>











    