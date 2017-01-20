//파일명: common.js
//전화번호 입력형식이 맞는지 체크한다
//사용법 : if(isPhoneValid(frm.phone.value)==false){ ... }
function isPhoneValid(object)
{
	var reg = /(01[0|1|6|9|7])[-](\d{3}|\d{4})[-](\d{4}$)/g;
	
	var result = reg.test(object); 
	return result;//정상적일때 
}