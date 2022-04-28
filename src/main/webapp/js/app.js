jQuery(document).ready(function () {

    jQuery(window).scroll(function() {
        if (jQuery(this).scrollTop() > 1){
            jQuery('.site-header').addClass("sticky");
        }
        else{
            jQuery('.site-header').removeClass("sticky");
        }
    });

    jQuery("#openNav").on("click", function () {
        jQuery('body').addClass("open-nav");
    });

    jQuery("#closeNav").on("click", function () {
        jQuery('body').removeClass("open-nav");
    });

    jQuery(".dark-mask").on("click", function () {
        jQuery('body').removeClass("open-nav");
    });

    jQuery('body').keydown(function(e){
        if(e.keyCode == 27) {
            jQuery(this).removeClass('open-nav');
        }
    });

});