$(function(){
    // Hover Menu
        $('header ul>li+li').mouseenter(function(){
            $(this).removeClass('out').addClass('on').siblings().removeClass('on');
        })
        $('header ul>li+li').mouseleave(function(){
            $(this).removeClass('on').addClass('out')
        })


    // ScrollMove Menu
        $('header ul>li').click(function(){
            var idx = $(this).index();
            // console.log(idx)
            var top = $('.content section').eq(idx).offset().top;
            // console.log(top)
            $('body,html').animate({
                'scrollTop':top
            })

        })



    // Slide Banner
        var wid = $('.slidebanner').width();
        var idx = 0;

        $('.next').click(function(){
            $('.slidebanner ul li').eq(idx).find('img').animate({
                'left':-wid
            }).parent().next().find('img').css({
                'display':'block',
                'left':wid
            }).stop().animate({
                'left':0
            })
            idx ++
            if(idx == $('.slidebanner ul li').length){
                idx = 0
                $('.slidebanner ul li').eq(idx).find('img').css({
                    'left':wid
                }).stop().animate({
                    'left':0
                })
            }
            //a 태그 이동
            $('.slidebanner ul li').eq(idx).addClass('on').siblings().removeClass()
        })

        $('.prev').click(function(){
            $('.slidebanner ul li').eq(idx).find('img').animate({
                'left':wid
            }).parent().prev().find('img').css({
                'display':'block',
                'left':-wid
            }).stop().animate({
                'left':0
            })
            idx --
            if(idx < 0){
                idx = $('.slidebanner ul li').length-1;
                $('.slidebanner ul li').eq(idx).find('img').css({
                    'display':'block',
                    'left':-wid
                }).stop().animate({
                    'left':0
                })
            }
            //a 태그 이동
            $('.slidebanner ul li').eq(idx).addClass('on').siblings().removeClass()
        })

        // a 태그 클릭시 이미지 이동
        $('.slidebanner ul li a').click(function(){
            var on = $('.slidebanner ul li.on').index();
            li = $(this).parent().index();

            if(on < li){
                $('.slidebanner ul li').eq(on).find('img').animate({
                    'left':-wid
                }).parent().eq(li)
                idx ++
                $('.slidebanner ul li').eq(idx).addClass('on').siblings().removeClass()

            }else if(on > li){
                $('.slidebanner ul li').eq(on).find('img').animate({
                    'left':-wid
                }).parent().eq(li)
                idx --
                $('.slidebanner ul li').eq(idx).addClass('on').siblings().removeClass()
            }

        })





})
