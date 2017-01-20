<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>

<script>
$(document).ready(function(){
	$("#btnSend").click(function(){
		$.ajax({
    	    type:"POST", //데이타 전송방식 지정, GET, POST중에 선택 
    		url: "jsontest1.txt", //호출할 문서명
    	   	success: function(result){
    	   	   // $("#result").html(result); 
    	   	 data = $.parseJSON(result);
    	   	   
    	   	 /*$("#result").html(data.name + 
    	   		 " "+ data.age + " " + data.si);*/
    	   	var temp="";	 
    	   	for(i=0; i<data.length; i++)
    	   	{
    	   		temp += data[i].name + " " 
    	   		        + data[i].age + " "
    	   		        + data[i].si + "<br/>";
    	   	}
    	    $("#result").html(temp);
    	   	
    	   	 
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
	<a href="#none" id="btnSend">여기</a>
	
	<br/>
	<div id="result"></div>
</form>

</body>
</html>





