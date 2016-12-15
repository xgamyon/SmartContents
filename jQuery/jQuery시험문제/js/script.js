$(function(){
    // Hover Menu
        $('header ul>li').hover(function(){
            $(this).toggleClass('on');
        })


    // $('header ul>li').hover(function(){
    //     var len = $('header ul>li').length;
    //     var idx = $(this).index();
    //
    //     for(i=0; i<len; i++){
    //         if(i == idx){
    //             $('header ul>li').eq(i).removeClass('out').addClass('on');
    //         }else{
    //             $('header ul>li').eq(i).removeClass('on').addClass('out');
    //         }
    //     }
    // })







})
