
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
  .click(scorllEvent)
})








// fade in 배너
$(function(){
    var idx;
    $('.fadebanner li a').click(function(){

         idx = $(this).parent().index();
         $('.fadebanner li.on').removeClass().find('img').fadeOut();
         $('.fadebanner li').eq(idx).addClass('on').find('img').fadeIn();

        return false

    })


    //무비
    $('.movie-view li a').click(function(){

        var movecode = $(this).attr('href');
        var url = "https://www.youtube.com/embed/"+movecode+"?rel=0&amp;controls=0&amp;showinfo=0"
        $('.movie-view iframe').attr('src',url)

        return false
    })


})
