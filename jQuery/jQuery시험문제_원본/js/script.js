    // 메뉴 hover연습
    // var wid = $('nav li').width();
    //
    // var on = function(){
    //     $(this).css({
    //         'background': 'red',
    //         'marginLeft':-wid
    //     }).stop().animate({
    //         'marginLeft':0
    //     },500).children('a').css('color','#FFF')
    // }
    //
    // var out = function(){
    //     $(this).css({
    //         'background': 'initial',
    //         'marginLeft':0
    //     }).stop().animate({
    //         'marginLeft':-wid
    //     },500).children('a').css({
    //         'marginLeft':wid
    //     })
    // }


    // 메뉴 hover
    // var on = function(){  // 콜백함수라 function 으로 실행해준다.
    //     $(this).css({
    //         'background':'red'
    //     }).children('a').css('color','#FFF');
    // }
    // var out = function(){
    //     $(this).css({
    //         'background':'initial'
    //     }).children('a').css('color','initial')
    // }


    // 스크롤Top
    // var scrollEvent = function(){
    //     var idx = $(this).index();
    //     var scrtop= $('.content section').eq(idx).offset().top;
    //     $('html,body').animate({
    //         'scrollTop': scrtop
    //     })
    //     // return false(이것이 선언된곳 아래는 아무것도 실행되지 않는다.)
    //     // return false 대신 a 태그에 javascript:void(0) 로 링크 막는것을 추천
    // }


// 실행 구문
// $(function(){
//     $('nav li').hover(on,out)  // 메뉴 hover
//     .click(scrollEvent)        // 스크롤Top
// })



var navEvent = { // mouseEvent function
    mouse:function(){
        var over = function(){
            $(this).css('background','red').children('a').css('color','#FFF');
        }

        var out = function(){
            $(this).css('background','initial').children('a').css('color','initial');
        }

        var idx = 0
        var scroll = function(){
            idx = $(this).index();
            var sot = $('.content section').eq(idx).offset().top;
            $('html,body').stop().animate({
                scrollTop:sot
            })
            return false;
        }

        $('nav li').on({
            'mouseenter':over,
            'mouseleave':out,
            'click':scroll
        })
    }
}


var idx = 0;
var slide = {
    event:function(){
        var wid = $('.slidebanner').width();
        $('.next').click(function(){
            $('.slidebanner ul li').eq(idx).find('img').animate({
                'left':-wid
            }).parent().removeClass().next().addClass('on').find('img').css({
                'left':wid,
                'display':'block'
            }).stop().animate({
                'left':0
            })
            idx++
            if(idx == $('.slidebanner ul li').length){
                idx = 0
                $('.slidebanner ul li').eq(idx).addClass('on').find('img').css({
                    'left':wid
                }).stop().animate({
                    'left':0
                })
            }
        })

        $('.prev').click(function(){
            $('.slidebanner ul li').eq(idx).find('img').animate({
                'left':wid
            }).parent().removeClass().prev().addClass('on').find('img').css({
                'left':-wid,
                'display':'block'
            }).stop().animate({
                'left':0
            })
            idx--
            if(idx < 0){
                idx = $('.slidebanner ul li').length-1;
                $('.slidebanner ul li').eq(idx).addClass('on').find('img').css({
                    'left' :-wid,
                    'display':'block'
                }).stop().animate({
                    'left':0
                })
            }

        })

        // a 태그 클릭 관련
        $('.slidebanner li a').click(function(){
            var hisnum = $('.slidebanner li.on').index();  // .on의 위치
            idx = $(this).parent().index();  //내가 클릭한 li 위치

            if(idx > hisnum){

                $('.slidebanner li').eq(hisnum).find('img').css({
                    'left':0,
                    'display':'block'
                }).animate({
                    'left':-wid
                })

                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':wid,
                    'display':'block'
                }).animate({
                    'left':0
                }).parent().siblings().removeClass()


            }else if(idx < hisnum){

                $('.slidebanner li').eq(hisnum).find('img').css({
                    'left':0,
                    'display':'block'
                }).animate({
                    'left':wid
                })

                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':-wid,
                    'display':'block'
                }).animate({
                    'left':0
                }).parent().siblings().removeClass()
            }


        })

    }

}
var fadeidx = 1;
// fade in 배너
var fade = {
    event:function(){

        var fadeinout = function(){
            fadeidx = $(this).parent().index(); // a 의 부모 li
            $('.fadebanner li').eq(fadeidx).addClass('on').find('img').fadeIn().parent().siblings().removeClass().find('img').fadeOut();
        }

        // 자동 움직임
        var inter = setInterval(function(){ // 자동 실행!

            $('.fadebanner li a').eq(fadeidx).click()
            // console.log(fadeidx)
            fadeidx++
            if(fadeidx == $('.fadebanner li').length){
                fadeidx = 0;
                $('.fadebanner li').eq(fadeidx).click() // 첫번째 이미지로 돌려줌
            }
        },1000)


        $('.fadebanner li a').on({
            'click':fadeinout
        })
    }
}



// 무비 클릭시 영상 바뀜 (내가짠것)
// $(function(){
//     var url = 'https://www.youtube.com/embed/'
//     var moviecode = ['Uv554B7YHk4','4z4sN05-xIs','1ELGunbuvqc','uBezVQweeUE','q6f-LLM1H6U']
//     $('.movie-view > ul > li').click(function(){
//         var idx = $(this).index();
//         $('.movie-view .view iframe').attr('src',url+moviecode[idx])
//         return false;
//     })
// })


// 선생님 방법 무비클릭
var movie = {
    event:function(){
        $('.movie-view li a').click(function(){

            var movecode = $(this).attr('href');
            var url = "https://www.youtube.com/embed/"+movecode+"?rel=0&amp;controls=0&amp;showinfo=0"
            $('.movie-view iframe').attr('src',url)

            return false // a 태그 실행 안되게!
        })
    }
}


// 윙배너
var wing = {
    event:function(){
        var fly = function(){
            $('.wing').stop().animate({
                'top':$(this).scrollTop()
            },500)
        }

        $(window).on({
            'scroll':fly
        })
    }
}

// 팝업 이벤트
var popup = {
    event:function(){
        var pop1 = function(){
            var target ='.'+$(this).attr('id');
            $(target).show()
        }


        $('.btnevent1').on({
            'click':pop1
        })
    }
}




//문서 준비
$(function(){
    navEvent.mouse();  // 마우스클릭 색, 클릭 위치값
    slide.event();     // 슬라이드배너
    fade.event();      // fade 배너
    movie.event();     // movie 클릭 이미지
    wing.event();      // 윙배너 따라다니게
    popup.event();
})






















/////////////////////////////////////////////////////////////////
