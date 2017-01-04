
// 메뉴 관련
var menu = {
    event:function(){
        var menubox = function(){
            $(this).parent().find('ul').slideToggle(500);
        }
        $('.menu').on('click',menubox);
    }
}

// 이딴 시행착오를 거치고 밑에것으로..
// profile
// var profile = {
//     event:function(){
//         $('.picture ul li:nth-child(1) a').click(function(){
//             $("section .profile").css({
//                 "background" : "url(./image/2.jpg)",
//                 'background-repeat' : 'no-repeat',
//                 'background-position': 'center',
//                 'background-size': 'cover',
//                 'opacity':0
//             }).stop().animate({
//                 'opacity':1
//             })
//          })
//     }
// }


// profile 메뉴 클릭 이벤트
function goChange(id){
    var temp= "url(./image/" + id + ".jpg)"

    $("section .profile .wrap .bgimg").css({
        "background" : temp,
        'background-repeat' : 'no-repeat',
        'background-position': 'center',
        'background-size': 'cover',
        'opacity':0
    }).fadeTo('slow',1)
}








$(function(){
    menu.event();
    // profile.event();
})
