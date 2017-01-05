// 메뉴 관련
var menu = {
    event:function(){
        var menubox = function(){
            $(this).parent().find('ul').slideToggle(500);
        }
        $('.menu').on('click',menubox);
    }
}


// profile 메뉴 클릭 이벤트
// function goChange(id){
//     var temp= "url(./image/" + id + ".jpg)"
//
//     $("section .profile .wrap .bgimg ul li").css({
//         'background' : temp,
//         'background-repeat' : 'no-repeat',
//         'background-position': 'center',
//         'background-size': 'cover',
//         'opacity':0
//     }).fadeTo('slow',1)
// }

// var profile = {
//     event:function(){
//         var sum = function(){
//             var idx = 0;
//             idx = $(this).parent().index();
//             $('.bgimg ul li').eq(idx).css({
//                 'display' : 'block'
//             }).siblings().css('display','');
//         }
//         $('.picture ul li a').on('click', sum)
//     }
// }
var profile = {
    event:function(){
        var idx = 0;

        var sum = function(){
            idx = $(this).parent().index();
            $('.bgimg ul li').eq(idx).fadeIn(1000).siblings().removeClass('on').css('display','');
        }

        var next = function(){
            $('.bgimg ul li').eq(idx).next().fadeIn(1000).siblings().removeClass('on').css('display','');
            idx++
            if(idx == $('.bgimg ul li').length){
                idx = 0;
                $('.bgimg ul li').eq(idx).fadeIn(1000).siblings().removeClass('on').css('display','');
            }
        }

        var prev = function(){
            $('.bgimg ul li').eq(idx).prev().fadeIn(1000).siblings().removeClass('on').css('display','');
            idx--
            if(idx < 0){
                idx = $('.bgimg ul li').length-1;
                $('.bgimg ul li').eq(idx).fadeIn(1000).siblings().removeClass('on').css('display','');
            }
        }

        $('.picture ul li a').on('click', sum)
        $('.next').on('click', next)
        $('.prev').on('click', prev)
    }
}





$(function(){
    menu.event();
    profile.event();
})
