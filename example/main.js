//==================================================*
//	Common
//==================================================*
/**
 * Common:Variable
 */
var $ = jQuery


//==================================================*
//	Document:Ready
//==================================================*
$(document).ready(function(){
	// KeyVisual Scroll Bg
	//==================================================*
	if($('.KeyVisual').length > 0){
		function KeyVisualFix() {
			var topHead = 0;
			var thisTop = $(this).scrollTop();
			var bgTop = $(this).scrollTop() - topHead;
			var top_header = $('.KeyVisualBoxBGSecond-item video');
			top_header.css({'transform':'translateY(0px)'}); // better use CSS
			
			if(thisTop > topHead){
					top_header.css({'transform':'translateY('+(bgTop*.50)+'px)'});
			}
		};
		$(window).on('resize', KeyVisualFix);
		$(window).on('scroll', KeyVisualFix);
		KeyVisualFix();
	}
	
	/**
	 * CategoryTabBlackBar
	 */
	if($('.KeyVisual').length > 0){
		function KeyVisualHeight() {
			var windowHeight = $(window).height();
			var adminHeight = $('#wpadminbar').height();
			$('.KeyVisual-container').css('height', windowHeight);
			
			if($('#wpadminbar').length > 0){
				$('.KeyVisual-container').css('height', windowHeight - adminHeight);
			}
		}
		KeyVisualHeight();
		$(window).on('resize', KeyVisualHeight);
	}
	
	/**
	 * Main Scroll Button
	 */
	 function KeyVisualScroll() {
		 var offset = $('.MainNews').offset();
		 var adminHeight = $('#wpadminbar').height();
		
		if($('#wpadminbar').length > 0){
			$('html, body').animate({scrollTop : offset.top - adminHeight }, 400);
		}else{
			$('html, body').animate({scrollTop : offset.top}, 400);
		}
	 }
	 
	 $(document).on('click', '.KeyVisualScroll-link', KeyVisualScroll);
	 
	 /**
	 * NewsSlide---------------------------------------------------------------
	 */
	 if($('.MainNews').length > 0){
		var ScrollSlideSection = undefined;
		function sectionSwiper() {
			var screenWidth = $(window).width();
			if(screenWidth < 768 && ScrollSlideSection == undefined) {            
				ScrollSlideSection = new Swiper('.MainNewsSlide-container', {            
					slidesPerView: "auto",
					freeMode: true,
					scrollbar: {
					  el: ".MainNewsSlide-scrollbar",
					  hide: true,
					},
				});
			} else if (screenWidth > 767 && ScrollSlideSection != undefined) {
				ScrollSlideSection.destroy();
				ScrollSlideSection = undefined;     
			}        
		}

		//Swiper plugin initialization
		sectionSwiper();

		//Swiper plugin initialization on window resize
		$(window).on('resize', function(){
			sectionSwiper();        
		});
	 }

	/**
	 * CareersSlide
	 */
	 if($('.MainCareesrs').length > 0){
		var ScrollSlideCareesrs = undefined;
		function areesrsSwiper() {
			var CareesrsWidth = $(window).width();
			if(CareesrsWidth < 768 && ScrollSlideCareesrs == undefined) {            
				ScrollSlideCareesrs = new Swiper('.MainCareesrsSlide-container', {            
					slidesPerView: "auto",
					freeMode: true,
					scrollbar: {
					  el: ".MainCareesrsSlide-scrollbar",
					  hide: true,
					},
				});
			} else if (CareesrsWidth > 767 && ScrollSlideCareesrs != undefined) {
				ScrollSlideCareesrs.destroy();
				ScrollSlideCareesrs = undefined;        
			}        
		}

		//Swiper plugin initialization
		areesrsSwiper();

		//Swiper plugin initialization on window resize
		$(window).on('resize', function(){
			areesrsSwiper();        
		});
	 }
	 
	 /**--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * GameSlide
	 */
	 var GameSlider = new Swiper(".MainGameSlide-container", {
		observer: true,
		observeParents: true,
		watchOverflow: true,
		slidesPerView: "auto",
        navigation: {
          nextEl: ".MainGameSlide-next",
          prevEl: ".MainGameSlide-prev",
        },
      });
	  
	  /**--------------------------------------------------------------------------------------------
	 * ScrollMagic: Black Bg
	 */
	 var BlackHeight = $('.MainGame ').height();
	 var MainStudiosHeader = $(window).height()/2.5;
	 var WindowBlackHeight = BlackHeight + MainStudiosHeader;
	 
	 $(window).on("resize", function () {
		 var BlackHeight = $('.MainGame ').height();
		 var MainStudiosHeader = $(window).height()/2.5;
		 var WindowBlackHeight = BlackHeight + MainStudiosHeader;
	});		
	
	 function getBlackHeight() {
		return WindowBlackHeight;
	}
	
	if($('.MainGame').length > 0){
		$('.MainGame').each(function(){
			var BlackBg = new ScrollMagic.Scene({
				triggerElement: '.MainGame',
				duration: getBlackHeight
			})
			.setClassToggle('body', 'Bg-black')
			.addTo(controller);
		});
	}
	
	 /**-------------------------------------------------------------------------------------------------------------------------------------------------
	 * Studios Hover
	 */
	 function StudiosOver() {
		$(this).closest('.MainStudiosCard-item').addClass('is-Active').siblings('li').removeClass('is-Active');
	 }
	 $(document).on('mouseover', '.MainStudiosCardItem-link', StudiosOver);
	 
	 /**
	 * ScrollendWhite
	 */
	if($('.MainStudios').length > 0){
		function ScrollendWhite() {
			var SiteFooter = $('.site-footer').height();
			$(window).scroll(function(){
				if ($(window).scrollTop() >= $(document).height() - $(window).height() - SiteFooter){
					$('body').removeClass('Bg-black');
				}
			}); 
		}
		ScrollendWhite();
		$(window).on('resize', ScrollendWhite);
	}
});
