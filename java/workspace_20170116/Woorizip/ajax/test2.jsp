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
	    $.ajax({
	    	    type:"POST", //데이타 전송방식 지정, GET, POST중에 선택 
	    	    data:"userid=test&password=1234&name=홍길동", //파라미터들 
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
<a href="#none" id="btnSend">여기</a>를 누르세요<br/>
<div id="result"></div>

</body>
</html>