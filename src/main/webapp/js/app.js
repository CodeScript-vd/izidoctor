jQuery(document).ready(function () {

    jQuery(window).scroll(function() {
        if (jQuery(this).scrollTop() > 1){
            jQuery('.site-header').addClass("sticky");
        }
        else{
            jQuery('.site-header').removeClass("sticky");
        }
    });

})