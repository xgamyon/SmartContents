//Hover Menu


var menu = {
    nav:function(){
        var over = function(){
            $(this).css('background','red').children().css('color','#FFF')
        }
        var out = function(){
            $(this).css('background','initial').children().css('color','initial')
        }

        var scroll = function(){
            var idx = $(this).index();
            var top = $('.content section').eq(idx).offset().top;
            $('html,body').stop().animate({
                'scrollTop':top
            })
        }

        $('nav li').on({
            'mouseenter': over,
            'mouseleave': out,
            'click':scroll
        })
    }
}

var idx = 0;
var slide = {
    event:function(){

        var wid = $('.slidebanner').width();

        var next = function(){
            $('.slidebanner li').eq(idx).find('img')
            .animate({
                'left':-wid
            }).parent().removeClass().next().addClass('on').find('img').css({
                'left':wid,
                'display':'block'
            }).stop().animate({
                'left':0
            })
            idx++
            if(idx == $('.slidebanner li').length){
                idx = 0;
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':wid,
                    'display':'block'
                }).stop().animate({
                    'left':0
                })
            }
        }

        var prev = function(){
            $('.slidebanner li').eq(idx).find('img')
            .animate({
                'left':wid
            }).parent().removeClass().prev().addClass('on').find('img').css({
                'left':-wid,
                'display':'block'
            }).stop().animate({
                'left':0
            })
            idx--
            if(idx < 0 ){
                idx = $('.slidebanner li').length-1;
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':-wid,
                    'display':'block'
                }).stop().animate({
                    'left':0
                })
            }
        }


        $('.next').on({
            'click': next
        })
        $('.prev').on({
            'click': prev
        })
    }
}










$(function(){
    menu.nav();
    slide.event();
})
