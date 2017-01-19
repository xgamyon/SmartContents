<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>

<script>
$(document).ready(function(){
	$("#category1").change(function(){
		//alert( $("#category1").val() );
		var data = "value="+$("#category1").val();
		$.ajax({
    	    type:"POST", //데이타 전송방식 지정, GET, POST중에 선택 
    	    data:data, //파라미터들 
    		url: "category2.jsp", //호출할 문서명
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
시/도 : <select name="category1" id="category1">
			<option value="">선택하세요</option>
			<option value="01">서울시</option>
			<option value="02">부산시</option>
			<option value="03">광주시</option>
			<option value="04">대구시</option>
			<option value="05">인천시</option>
			<option value="06">대전시</option>
			<option value="07">울산시</option>
		</select>
		&nbsp;&nbsp;
구/군 : <span id="result">
			<select name="category2">
				<option value="">선택하세요</option>
		    </select>
	    </span>
</form>

</body>
</html>
