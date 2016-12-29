var menu = {
    event:function(){
        var menubox = function(){
            $(this).parent().find('ul').slideToggle(500);
        }
        $('.menu').on('click',menubox);
    }
}

$(function(){
    menu.event();
})
