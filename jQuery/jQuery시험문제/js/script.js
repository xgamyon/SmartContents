    //Hover Menu

var menu = {
    event:function(){
        //Hover Menu
        var over = function(){
            $(this).css('background','pink').find('a').css('color','#fff')
        }
        var out = function(){
            $(this).css('background','initial').find('a').css('color','initial')
        }

        // ScrollMove Menu
        var scroll = function(){
            var idx = $(this).index();
            var stop = $('.content section').eq(idx).offset().top;
            $('html,body').animate({
                'scrollTop':stop
            })
        }

        $('nav li').on({
            'mouseenter':over,
            'mouseleave':out,
            'click':scroll
        })
    }
}

var banner = {
    //slide 배너
    slide:function(){
        var idx = 0;
        var wid =$('.slidebanner').width();
        var next = function(){
            $('.slidebanner li').eq(idx).find('img').stop().animate({
                'left':-wid
            }).parent().removeClass('on').next().addClass('on').find('img').css({
                'left':wid,
                'display':'block'
            }).stop().animate({
                'left': 0
            })
            idx++
            if(idx == $('.slidebanner li').length){
                idx = 0
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':wid,
                    'display':'block'
                }).animate({
                    'left': 0
                })
            }
        }
        var prev = function(){
            $('.slidebanner li').eq(idx).find('img').stop().animate({
                'left':wid
            }).parent().removeClass('on').prev().addClass('on').find('img').css({
                'left':-wid,
                'display':'block'
            }).stop().animate({
                'left': 0
            })
            idx--
            if(idx < 0){
                idx = $('.slidebanner li').length-1
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left':-wid,
                    'display':'block'
                }).animate({
                    'left': 0
                })
            }
        }

        //마우스 클릭시 a 위치 이동
        var onclick = function(){
            var onnum = $('.slidebanner li.on').index();
            idx = $(this).parent().index();

            if(idx > onnum){
                $('.slidebanner li').eq(onnum).find('img').css({
                    'left': 0,
                    'display':'block'
                }).stop().animate({
                    'left': -wid
                })
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left': wid,
                    'display':'block'
                }).stop().animate({
                    'left': 0
                }).parent().siblings().removeClass('on')

            }else if(idx < onnum){
                $('.slidebanner li').eq(onnum).find('img').css({
                    'left': 0,
                    'display':'block'
                }).stop().animate({
                    'left': wid
                })
                $('.slidebanner li').eq(idx).addClass('on').find('img').css({
                    'left': -wid,
                    'display':'block'
                }).stop().animate({
                    'left': 0
                }).parent().siblings().removeClass('on')
            }
        }

        // 자동실행, 마우스 들어왔을때 정지, 나갔을때 다시 실행
        var inter = setInterval(function(){
            $('.next').click()
        },4500)
        var over = function(){
            clearInterval(inter)
        }
        var out = function(){
            inter = setInterval(function(){
                $('.next').click()
            },4500)
        }


        $('.next').on('click',next)
        $('.prev').on('click',prev)
        $('.slidebanner li a').on('click',onclick)
        $('.slidebanner').on({
            'mouseenter':over,
            'mouseleave':out
        })
    },
    //fade 배너
    fade:function(){
        var idx = 0
        var fadein = function(){
            idx = $(this).parent().index();
            $('.fadebanner li').eq(idx).addClass('on').find('img').fadeIn().parent().siblings().removeClass().find('img').fadeOut()
        }

        //자동실행
        var idx = 1
        var inter = setInterval(function(){
            $('.fadebanner li a').eq(idx).click()
            idx++
            if(idx == $('.fadebanner li').length){
                idx = 0
                $('.fadebanner li').eq(idx).click()
            }
        },4800)

        var over = function(){
            clearInterval(inter)
        }
        var out = function(){
            inter = setInterval(function(){
                $('.fadebanner li a').eq(idx).click()
                idx++
                if(idx == $('.fadebanner li').length){
                    idx = 0
                    $('.fadebanner li').eq(idx).click()
                }
            },4800)
        }


        $('.fadebanner li a').on('click', fadein)
        $('.fadebanner').on({
            'mouseenter':over,
            'mouseleave':out
        })
    }
}

//동영상 가져오기
var youtobe = {
    movie:function(){
        var you = function(){
            var code = $(this).attr('href');
            var url = "https://www.youtube.com/embed/"+code+"?rel=0&amp;controls=0&amp;showinfo=0"
            $('.view iframe').attr('src',url)

            // 클릭시 fadeTo 옵션
            var idx = 0
            idx = $(this).parent().index();
            console.log(idx)
            $('.movie-view li').eq(idx).fadeTo('fast',0.5).siblings().fadeTo('fast',1)

            return false;
        }

        $('.movie-view li a').on('click',you)
    }
}


//윙배너
var wing = {
    banner:function(){
        var fly = function(){
            $('.wing').stop().animate({
                'top': $(this).scrollTop()
            },1000)
        }

        $(window).on('scroll',fly)
    }
}

//팝업
var popup = {
    event:function(){
        var open = function(){
            bl()
            $('.blaind').fadeTo('fast',0.8)

            var target = '.'+$(this).attr('id');
            var scroll = $(window).scrollTop();
            var w = $(target).width();
            var h = $(target).height();
            var winh = $(window).height();


            $(target).show().css({
                'left':'50%',
                'top':scroll-h-10,
                'marginLeft':'-'+(w/2)+'px',
                'opacity':0
            }).stop().animate({
                'top': scroll+(winh/2)-(h/2),
                'opacity':1
            },500)

            function bl(){
                $('body').prepend('<div class="blaind"></div>')
            }
        }


        var close = function(){

            scroll = $(window).scrollTop();
            h = $(this).parent().height();

            $('.pop').stop().animate({
                'top':scroll-h,
                'opacity':0
            },500)

            $('.blaind').fadeTo('fast',0,function(){
                $(this).remove();
            })

        }


        $('.btnevent').on({
            'click':open
        })
        $('.close').on({
            'click':close
        })
        $('body').on({
            'click':close
        },'.blaind')
    }
}







// 실행함수

$(function(){
    menu.event();
    banner.slide();
    banner.fade();
    youtobe.movie();
    wing.banner();
    popup.event();
})
