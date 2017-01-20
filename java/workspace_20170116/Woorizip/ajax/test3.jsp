<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>

<script>
$(document).ready(function(){
	
	$("#btnSend").click(function(){
		
		var data = $("#myform").serialize();  // 데이터를 직렬화 (name 형식을 받아서 온다.)
		alert(data);
		
	    $.ajax({
	    	    type:"POST", //데이타 전송방식 지정, GET, POST중에 선택 
	    	    data: data, //파라미터들 
	    		url: "result.jsp", //호출할 문서명
	    	   	success: function(result){
	    	       $("#result").html(result);
	    		},//에러 없을때
	    		error: function(err){
	    			alert(err.responseText);
	    		}//에러있을때 
	    });
	 }); 
	
});

</script>

<body>
	<form id="myform">
		아이디 : <input type="text" id="userid" name="userid"><br/>
		비밀번호 : <input type="text" id="password" name="password"><br/>
		이름 : <input type="text" id="name" name="name"><br/>
	</form>
	
	<a href="#none" id="btnSend">여기</a>를 누르세요<br/>
	<div id="result"></div>
	
</body>
</html>