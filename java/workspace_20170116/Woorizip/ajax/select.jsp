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
    	    type:"POST", //����Ÿ ���۹�� ����, GET, POST�߿� ���� 
    	    data:data, //�Ķ���͵� 
    		url: "category2.jsp", //ȣ���� ������
    	   	success: function(result){
    	       $("#result").html(result);
    		},//���� ������
    		error: function(err){
    			alert(err.responseText);
    		}//���������� 
    });
		
	});
});

</script>
<body>
<form id="myform">
��/�� : <select name="category1" id="category1">
			<option value="">�����ϼ���</option>
			<option value="01">�����</option>
			<option value="02">�λ��</option>
			<option value="03">���ֽ�</option>
			<option value="04">�뱸��</option>
			<option value="05">��õ��</option>
			<option value="06">������</option>
			<option value="07">����</option>
		</select>
		&nbsp;&nbsp;
��/�� : <span id="result">
			<select name="category2">
				<option value="">�����ϼ���</option>
		    </select>
	    </span>
</form>

</body>
</html>
