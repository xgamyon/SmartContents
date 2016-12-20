
//콜백 함수
sum(function(){ return 1})

function sum(x){
    console.log(x)
}





// 익명함수
var 오버 = function(){  // 콜백함수라 function 으로 실행해준다.
  $(this).css('background','red');
}

var 아웃 = function(){
  $(this).css('background','initial');   // 상속을 끊어버림
  // $(this).css('background','transparent');  // 투명도를 줘버림
}


var scorllEvent = function(){
      var idx = $(this).index();
      var sot = $('.content section').eq(idx).offset().top;
      $('html,body').stop().animate({
          scrollTop:sot
      },500)

      return false;
  }

//문서 준비
$(function(){
  $('nav li').mouseenter(오버).mouseleave(아웃)
  // $('nav li').hover(오버,아웃)
})
