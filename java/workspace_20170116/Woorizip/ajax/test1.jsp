<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<body>

<div id="demo">
<h1>The XMLHttpRequest Object</h1>
<button type="button" onclick="loadDoc()">Change Content</button>
</div>

<script>
function loadDoc() {
  
  var xhttp = new XMLHttpRequest();
  
  //XMLHttpRequest - 서버하고 통신을 담당하는 JavaScript 클래스 
  //onreadystatechange 속성 - 서버에 통신을 요청한 후 서버에서 응답이  
  // 있을경우에 호출될 함수의 주소를 전달해야 한다 
  //콜백함수 
  
  xhttp.onreadystatechange = function() 
  {
    if (this.readyState == 4 && this.status == 200) 
    {
      document.getElementById("demo").innerHTML =
      this.responseText;
    }
  };
  
  
  xhttp.open("GET", "ajax_info.txt", true);
  xhttp.send();
}
</script>

</body>
</html>
