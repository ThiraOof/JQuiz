//==================================================*
//	Common
//==================================================*
/**
 * Common:Variable
 */
var $ = jQuery

/**
 * Common:ScrollMagic Controller
 */
var controller = new ScrollMagic.Controller();

//==================================================*
//	Document:Ready
//==================================================*
$(document).ready(function(){
	
	// LinkDefault
	//==================================================*
	function linkDefault() {
		return false;
	}
	
	$(document).on('click', '[class*="js-"]', linkDefault);
	
	// ScrollMagic Common Animation
	//==================================================*
	
	/**
	 * ScrollMagic: Opacity
	 */
	if($('.a-Opacity').length > 0){
		$('.a-Opacity').each(function(){
			var Opacity = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-Opacity')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: logoOpacity
	 */
	if($('.a-logoOpacity').length > 0){
		$('.a-logoOpacity').each(function(){
			var CenterOpacity = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.8
			})
			.reverse(false)
			.setClassToggle(this, 'is-logoOpacity')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: textTop
	 */
	if($('.a-textTop').length > 0){
		$('.a-textTop').each(function(){
			var CenterOpacity = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-textTop')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: ChallengePost
	 */
	if($('.a-ChallengePost').length > 0){
		$('.a-ChallengePost').each(function(){
			var CenterOpacity = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-ChallengePost')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: Photo
	 */
	if($('.a-Photo').length > 0){
		$('.a-Photo').each(function(){
			var PhotoOpacity = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.8
			})
			.reverse(false)
			.setClassToggle(this, 'is-Photo')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: OpacityTop
	 */
	if($('.a-OpacityTop').length > 0){
		$('.a-OpacityTop').each(function(){
			var OpacityTop = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-OpacityTop')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: GameScrollUP
	 */
	if($('.a-ScTop').length > 0){
		$('.a-ScTop').each(function(){
			var ScTopTl = new TimelineMax();
			ScTopTl.to(this, 50, {y: '-10%', ease:Power0.easeNone});
			
			var GameScrollUP = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: '100%',
				triggerHook:0.9
			})
			.setTween(ScTopTl)
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: GameScrollDown
	 */
	if($('.a-ScDown').length > 0){
		$('.a-ScDown').each(function(){
			var ScDownTl = new TimelineMax();
			ScDownTl.to(this, 50, {y: '5%', ease:Power0.easeNone});
			
			var GameScrollDown = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: '100%',
				triggerHook:0.9
			})
			.setTween(ScDownTl)
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: GameText
	 */
	if($('.a-GameText').length > 0){
		$('.a-GameText').each(function(){
			
			var GameText = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-GameText')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: GameParallaxUp
	 */
	if($('.a-GameParallaxUp').length > 0){
		$('.a-GameParallaxUp').each(function(){
			
			var GameParallaxUpTl = new TimelineMax();
			var GameParallaxUpBg = $(this).find('.a-GameBgUp');
			
			GameParallaxUpTl.to(GameParallaxUpBg, 50, {y: '30%', ease:Power0.easeNone});
			
			var ParallaxBg = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: "100%",
				triggerHook: 0.9
			})
			.setTween(GameParallaxUpTl)
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: GameParallaxDown
	 */
	if($('.a-GameParallaxDown').length > 0){
		$('.a-GameParallaxDown').each(function(){
			
			var GameParallaxDownTl = new TimelineMax();
			var GameParallaxDownBg = $(this).find('.a-GameBgDown');
			
			GameParallaxDownTl.to(GameParallaxDownBg, 50, {y: '-30%', ease:Power0.easeNone});
			
			var ParallaxBg = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: "100%",
				triggerHook: 0.9
			})
			.setTween(GameParallaxDownTl)
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: ChallengeYear
	 */
	if($('.ChallengeList-item').length > 0){
		$('.ChallengeList-item').each(function(){
			var ChallengeYear = new ScrollMagic.Scene({
				triggerElement: this.children[0],
				triggerHook:0.9
			})
			.reverse(false)
			.setClassToggle(this, 'is-View')
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: Parallax scene
	 */
	if($('.a-ParallaxBg').length > 0){
		$('.a-ParallaxBg').each(function(){
			
			var ParallaxTl = new TimelineMax();
			var Bg = $(this).find('.a-Bg');
			
			ParallaxTl.to(Bg, 50, {y: '-30%', ease:Power0.easeNone});
			
			var ParallaxBg = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: "100%",
				triggerHook: 0.9
			})
			.setTween(ParallaxTl)
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic:BlockFix
	 */		
	var text = $('.TitleFixedSection-Inner').outerHeight()/2;
	var height1 = $('.TitleFixedSection').outerHeight()/2 - text;
	var height2 = $('.MainTitleImgSection').outerHeight();
	var height3 = height1+ height2;
	var windowHeight = height3;
	
	// function to be used to retrieve variable
	function getWindowHeight() {
		return windowHeight;
	}
	// update window height on resize
	$(window).on("resize", function () {
		var text = $('.TitleFixedSection-Inner').outerHeight()/2;
		var height1 = $('.TitleFixedSection').outerHeight()/2 - text;
		var height2 = $('.MainTitleImgSection').outerHeight();
		var height3 = height1+ height2;
		windowHeight =height3;
	});					
	
	if($('.a-BlockFix').length > 0){
		$('.a-BlockFix').each(function(){
			var PinSlidePage = new ScrollMagic.Scene({
				triggerElement: ".a-BlockFix",
				duration: getWindowHeight,
				triggerHook: 0,
				offset: 0,
			 })
			.setPin(".a-Pin")
			.addTo(controller);
		});
	}
	
	/**
	 * ScrollMagic: a-ChallengeList
	 */		
	if($('.ChallengeListItem-year').length > 0){
		$('.ChallengeListItem-year').each(function(){
			var ChallengeText = $(this).outerHeight();
			var ChallengeTextHeight = $(this).outerHeight()/2;
			var ChallengeSection = $(this).closest('.ChallengeListItem').outerHeight();
			var ChallengeHeight = ChallengeSection - ChallengeText;
			var ChallengeTotalHeight = ChallengeHeight;
			
			// function to be used to retrieve variable
			function getChallengeHeight() {
				return ChallengeTotalHeight;	
				
			}	
			var ChallengeController = new ScrollMagic.Controller({
			  refreshInterval: 100
			});
			
			var ChallengeListPage = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: getChallengeHeight,
				triggerHook: 0.5,
				offset: ChallengeTextHeight,
			 })
			.setPin(this.children[0])
			.setClassToggle(this, 'is-View')
			.addTo(ChallengeController);
		});
	}
	
	// Header Scroll Hidden
	//==================================================*
	var didScroll;
	var lastScrollTop = 0;
	var delta = 5;
	var navbarHeight = $('.site-header').outerHeight();
	
	$(window).scroll(function(event){
		didScroll = true;
	});
	
	setInterval(function() {
		if (didScroll) {
			hasScrolled();
			didScroll = false;
		}
	}, 250);
	
	function hasScrolled() {
		var thisSt = $(this).scrollTop();
		
		if(Math.abs(lastScrollTop - thisSt) <= delta)
			return;
		
		if (thisSt > lastScrollTop && thisSt > navbarHeight){
			$('.site-header').removeClass('is-Down').addClass('is-Up');
		} else {
			if(thisSt + $(window).height() < $(document).height()) {
				$('.site-header').removeClass('is-Up').addClass('is-Down');
			}
		}
		lastScrollTop = thisSt;
	}
	
	// Family Site
	//==================================================*
	function CustomSelect() {
		var Select = $(this).parent('.FamilySite');
		if(Select.hasClass('is-Open')){
			Select.removeClass('is-Open').children('.menu-familymenu-list').stop().slideUp(140);
		}else{
			Select.addClass('is-Open').children('.menu-familymenu-list').stop().slideDown(140);
		}
	}
	
	$(document).on('click', '.js-FamilySite', CustomSelect);
	
	
	$(document).mouseup(function (e){
			if(!$('.FamilySite').is(e.target) && $('.FamilySite').has(e.target).length === 0){
					$('.FamilySite').removeClass('is-Open').children('.menu-familymenu-list').stop().slideUp(140);
			}
	});

	// Header Hover
	//==================================================*
	$('.SiteHeaderMenu1Depth .main-navigation,  .SiteHeaderMenuSubDepth').hover(function(){
        $('.site-header').addClass('is-View');
    }, function() {
        $('.site-header').removeClass('is-View');
    });

	// Navi AnimationBar
	//==================================================*
	/**
	 * ScrollMagic: mouseover
	 */
	function NaviBarOver() {
	  var barWidth = $(this).parent('.menu-item').outerWidth();
	  var barLeft = $(this).parent('.menu-item').offset().left;
	  $('.SiteHeaderBar').addClass('is-View').css({'width' : barWidth, 'left' : barLeft});
	}
	$(document).on('mouseover', '.SiteHeaderMenu1Depth .menu-item > a', NaviBarOver);

	/**
	 * ScrollMagic: mouseleave
	 */
	function NaviBarLeave() {
	  $('.SiteHeaderBar').removeClass('is-View');
	}
	$(document).on('mouseleave', '.SiteHeaderMenu1Depth .menu-item > a', NaviBarLeave);

	/**
	 * ScrollMagic: mouseover
	 */
	function SubNaviBarOver() {
		var DepthMenu = $(this).closest('.sub-menu').closest('.menu-item');
		var MainMenu = $(this).closest('.site-header').find('.SiteHeaderMenu1Depth .menu-item');
		var idx = DepthMenu.index();
		var barWidth = MainMenu.eq(idx).outerWidth();
		var barLeft = MainMenu.eq(idx).offset().left;
		$('.SiteHeaderBar').addClass('is-View').css({'width' : barWidth, 'left' : barLeft});
	}

	$(document).on('mouseover', '.SiteHeaderMenuSubDepth .sub-menu .menu-item > a', SubNaviBarOver);
	
	/**
	 * Custom Select
	 */
	function CustomSelecter() {
		$(this).parent('.CustomSelecter').toggleClass('is-Active').find('.CustomSelecter-list').stop().slideToggle(140);
		$('.CustomSelecter.is-Active').not( $(this).parent()).removeClass('is-Active').find('.CustomSelecter-list').stop().slideUp(140);
		$('.j-CustomSelect-link.is-Active').not( $(this).parent()).removeClass('is-Active').find('.CustomSelecter-list').stop().slideUp(140);
	}
	
	$(document).on('click', '.j-CustomSelect-text', CustomSelecter);
	
	function CustomSelectOption() {
		var _this = $(this);
		var this_text = _this.text();
		_this.closest('.CustomSelecter').removeClass('is-Active');
		_this.parent('.CustomSelecter-item').addClass('is-Current').siblings('.CustomSelecter-item').removeClass('is-Current'); 
		_this.closest('.CustomSelecter-list').stop().slideUp(100).prev('.j-CustomSelect-text').text(this_text);
		_this.closest('.CustomSelecter-list').stop().slideUp(100);
		return false;
	}
	
	$(document).on('click', '.j-CustomSelect-link', CustomSelectOption);
	
	$(document).mouseup(function (e){
			if(!$('.CustomSelecter').is(e.target) && $('.CustomSelecter').has(e.target).length === 0){
					$('.CustomSelecter').removeClass('is-Active').children('.CustomSelecter-list').stop().slideUp(140);
			}
	});

	/**
	 * Tab Mobile Toggle
	 */
	function TabMiblieToggle() {
		var ThisPrent = $(this).parent('.ThirdDepthTab');
		if(ThisPrent.hasClass('is-View')){
			ThisPrent.removeClass('is-View');
			ThisPrent.find('.ThirdDepthTab-list').stop().slideUp(140);
			return false;
		}else{
			ThisPrent.addClass('is-View');
			ThisPrent.find('.ThirdDepthTab-list').stop().slideDown(140);
			return false;
		}
	}
	
	$(document).on('click', '.ThirdDepthTabText', TabMiblieToggle);

	$(document).mouseup(function (e){
			if(!$('.ThirdDepthTab').is(e.target) && $('.ThirdDepthTab').has(e.target).length === 0){
					$('.ThirdDepthTab').removeClass('is-View').children('.ThirdDepthTab-list').stop().slideUp(140);
			}
	});
	
	/**
	 * Mobile Nav open
	 */
	function MobileNavOpen() {
		if($(window).width() <= 1024){
			if($('.site-header').hasClass('is-Open')){
				$('.site-header').removeClass('is-Open');
				$('.site-header').addClass('is-Off');
				$('html').removeClass('is-Hidden');
				return false;
			}else{
				$('.site-header').addClass('is-Open');
				$('.site-header').removeClass('is-Off');
				$('html').addClass('is-Hidden');
				return false;
			}
		}
	}
	
	$(document).on('click', '.j-HeaderMapButton', MobileNavOpen);
	
	/**
	 * Dec Reset
	 */
	 function DecReset() {
		if($(window).width() >= 1025){
			$('.site-header').removeClass('is-Open');
			$('html').removeClass('is-Hidden');
		}
	}
	
	$(window).on('resize', DecReset);
	
	/**
	 * Mobile Nav Toggle
	 */
	 $(function($){
		var clickAllowed = true;
		var this_index = $(this).parent('li').index();

		$('.SiteHeaderMenuSubDepth .sub-main-menu > .menu-item > a').click(function(){
			if (clickAllowed) {
				$(this).parent('li').toggleClass('is-View').siblings('li').removeClass('is-View');

				if($(this).parent().has('ul').length == 0){
						return true;
				}
				$(this).siblings('ul').stop().slideToggle(300).parent('li').siblings('li').children('ul').stop().slideUp(300);

				return false;
			}
		});
		function onResize() {
			if($(window).width() <= 1024){
				clickAllowed = true;
			}
			else{
				clickAllowed = false;
			}
		}
		onResize();
		var timer;
		$(window).bind('resize', onResize);
	});
	
	/**
	 * ScrollSlideTab
	 */
	 if($('.ScrollTab').length > 0){
		var ScrollSlideTab = undefined;
		function ScrollSlideTabSwiper() {
			var screenWidth = $(window).width();
			if(screenWidth < 1025 && ScrollSlideTab == undefined) {            
				ScrollSlideTab = new Swiper('.ScrollTab-container', {            
					slidesPerView: "auto",
					freeMode: true,
					scrollbar: {
					  el: ".ScrollTab-scrollbar",
					  hide: true,
					},
				});
			} else if (screenWidth > 1024 && ScrollSlideTab != undefined) {
				ScrollSlideTab.destroy();
				ScrollSlideTab = undefined;
				jQuery('.ScrollTab-wrapper').removeAttr('style');
				jQuery('.ScrollTab-slide').removeAttr('style');            
			}        
		}

		//Swiper plugin initialization
		ScrollSlideTabSwiper();

		//Swiper plugin initialization on window resize
		$(window).on('resize', function(){
			ScrollSlideTabSwiper();        
		});
	 }
	 
	 // Tabe Drag Cookie
	//==================================================*
	var setCookie = function(cname, cvalue, exdays) {
	  var d = new Date();
	  d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
	  var expires = "expires=" + d.toUTCString();
	  document.cookie = cname + "=" + cvalue + "; " + expires;
	}

	var getCookie = function(cname) {
	  var name = cname + "=";
	  var ca = document.cookie.split(';');
	  for (var i = 0; i < ca.length; i++) {
		var c = ca[i];
		while (c.charAt(0) == ' ') c = c.substring(1);
		if (c.indexOf(name) == 0) return c.substring(name.length, c.length);
	  }
	  return "";
	}
	
	  if (getCookie("closed") == "closed") {
		$(".ScrollEvent").addClass('is-Hidden');
		$(".ScrollEvent").removeClass('is-View');
	  }else{
		$(".ScrollEvent").removeClass('is-Hidden');
		$(".ScrollEvent").addClass('is-View');
	  }

	  $(".ScrollEvent-bg").click(function() {
		$(".ScrollEvent").addClass('is-Hidden');
		$(".ScrollEvent").removeClass('is-View');
		setCookie("closed", "closed", 365)
	  });
	  
	
	 
	 /**
	 * ScrollTable Check
	 */
	 function ScrollEventCheck() {
		 if($('.ScrollEvent').length > 0){
			$('.ScrollEvent').each(function(){
				var scrollWidth = $(this).find('.BasicTable').prop("scrollWidth");
				if($(window).width() <= 1024){
					$.fn.hasScrollBar = function() {
						return (this.prop("scrollWidth") == 0 && this.prop("clientWidth") == 0) || (this.prop("scrollWidth") > this.prop("clientWidth"));
					  };
					
					if($(this).hasScrollBar()){
						$(this).addClass('is-Scroll');
					 }else{
						$(this).removeClass('is-Scroll');
					}
				}else{
					$(this).removeClass('is-Scroll');
				}
			});
		}
	 }
	ScrollEventCheck();
	$(window).on('resize', ScrollEventCheck);
	
	/**
	 * CategoryTabBlackBar
	 */
	function CategoryTabBlackBarClick() {
		$(this).closest('.CategoryTabBlack-item').addClass('is-Current').siblings('li').removeClass('is-Current');
		return false;
	}
	
	$(document).on('click', '.CategoryTabBlackItem-link', CategoryTabBlackBarClick);
	
	if($('.CategoryTabBlack').length > 0){
		function CategoryTabBlackBar() {
			  var barWidth = $('.CategoryTabBlack-item.is-Current').find('.CategoryTabBlackItem-link').outerWidth();
			  var barLeft = $('.CategoryTabBlack-item.is-Current').find('.CategoryTabBlackItem-link').offset().left;
			  var parentLeft = $('.CategoryTabBlack').offset().left;
			  var fixedLeft = barLeft- parentLeft;
			  $('.CategoryTabBlackBar').addClass('is-View').css({'width' : barWidth, 'left' : fixedLeft});
		}
	
		CategoryTabBlackBar();
		$(document).on('click', '.CategoryTabBlackItem-link', CategoryTabBlackBar);
		$(window).on('resize', CategoryTabBlackBar);
	}
	
	/**
	 * FAQ
	 */
	 function Accordion() {
		$(this).closest('.ToggleList-list').find('.ToggleListContent').slideToggle(140).closest('.QnAList-item').toggleClass('is-Current').siblings('.QnAList-item').removeClass('is-Current').find('.ToggleListContent').slideUp(140);
	}
	
	$(document).on('click', '.j-ToggleListTitle-link', Accordion);
	
	/**
	 * Disable
	 */
	 function Disable() {
		return false;
	}
	
	$(document).on('click', '.is-Disable', Disable);
	
	/**
	 * History Slide
	 */
	 if($('.HistorySlideSection').length > 0){
		var yearSwiper = new Swiper('.HistorySlideYear-container', {
			allowTouchMove: false,
			effect: "fade",
			observer: true,
			observeParents: true,
			watchOverflow: true,
			scrollbar: {
			  el: ".HistorySlide-scrollbar",
			  hide: true,
			},
		});
	 
		var historySwiper = new Swiper('.HistorySlide-container', {
			allowTouchMove: false,
			effect: "fade",
			observer: true,
			observeParents: true,
			watchOverflow: true,
		  navigation: {
			nextEl: '.HistorySlide-next',
			prevEl: '.HistorySlide-prev',
		  },
		});
		yearSwiper.controller.control = historySwiper;
		historySwiper.controller.control = yearSwiper;
	 }
	
	

	$('.HistorySlide').mousemove(function(e){
		var pageX = e.pageX;
		var windowWidth = $( window ).width();
		var windowX = windowWidth/2;
		$('.HistorySlide').removeClass('is-Start');
		if(pageX > windowX){
			$('.HistorySlide').removeClass('is-Left');
			$('.HistorySlide').addClass('is-Right');
		}else{
			$('.HistorySlide').removeClass('is-Right');
			$('.HistorySlide').addClass('is-Left');
		}
	});
	
	/**
	 * Game Single Banner
	 */
	 if($('.SingleGameHeader').length > 0){
		 var GameclickAllowed = true;
		 if (GameclickAllowed) {
			 var $poster = $('.SingleGameHeader .site-container'),
			  $layer = $('div[class*="layer-"]'),
			  w = $(window).width(), //window width
			  h = $(window).height(); //window height

			$(window).on('mousemove', function(e) {
			  var offsetX = 0.5 - e.pageX / w, //cursor position X
				offsetY = 0.5 - e.pageY / h, //cursor position Y
				dy = e.pageY - h / 2, //@h/2 = center of poster
				dx = e.pageX - w / 2, //@w/2 = center of poster
				theta = Math.atan2(dy, dx), //angle between cursor and center of poster in RAD
				angle = theta * 180 / Math.PI - 90, //convert rad in degrees
				offsetPoster = $poster.data('offset'),
				transformPoster = 'translateY(' + -offsetX * offsetPoster + 'px) rotateX(' + (-offsetY * offsetPoster) + 'deg) rotateY(' + (offsetX * (offsetPoster * 2)) + 'deg)'; //poster transform

			  //get angle between 0-360
			  if (angle < 0) {
				angle = angle + 360;
			  }


			  //poster transform
			  $poster.css('transform', transformPoster);

			  //parallax foreach layer
			  $layer.each(function() {
				var $this = $(this),
				  offsetLayer = $this.data('offset') || 0,
				  transformLayer = 'translateX(' + offsetX * offsetLayer + 'px) translateY(' + offsetY * offsetLayer + 'px)';

				$this.css('transform', transformLayer);
			  });
			});
		 }

		 function SingleGameHeader() {
			if($(window).width() <= 1024){
				GameclickAllowed = true;
			}
			else{
				GameclickAllowed = false;
				$('div[class*="layer-"]').removeAttr("style");
				$('.SingleGameHeader .site-container').removeAttr("style");
			}
		}
		SingleGameHeader();
		var timer;
		$(window).bind('resize', SingleGameHeader);
	 }
	 
	 /**
	 * Game video play
	 */
	 $('.SingleGameTempFullPhoto-link').on('click', function() {
		 $(this).fadeOut(100);
		 $(this).next('iframe').fadeIn(100);
		$(this).next('iframe')[0].src += "?autoplay=1";
	});
	
	 /**
	 * Life video play
	 */
	 $('.WorkVideoListLeftFrame-link, .WorkVideoListRightFrame-link').on('click', function() {
		 $(this).fadeOut(100);
		 $(this).next('iframe').fadeIn(100);
		$(this).next('iframe')[0].src += "?autoplay=1";
	});
	
	/**
	 * Game full Photo
	 */
	 if($('.SingleGameTempFullPhoto').length > 0){
		$('.SingleGameTempFullPhoto-row').each(function(){
			var SingleGameTempFullPhotoTl = new TimelineMax();
			SingleGameTempFullPhotoTl.to(this, 50, {scale: '1', ease:Power0.easeNone});
			
			var FullPhotoHeight = $(this).outerHeight()/2;
			
			var FullPhotoController = new ScrollMagic.Controller({
			  refreshInterval: 100
			});
			
			var PinSlidePage = new ScrollMagic.Scene({
				triggerElement: ".SingleGameTempFullPhoto",
				duration: 500,
				triggerHook: 0.5,
				offset: FullPhotoHeight,
			 })
			.setPin(this)
			.setTween(SingleGameTempFullPhotoTl)
			.addTo(FullPhotoController);
		});
	}
	
	/**
	 * Game Count
	 */
	 if($('.SingleGameTempCountItemNumber-count').length > 0){
		function animateNumber() {
			$(".SingleGameTempCountItemNumber-count").each(function () {
				var $this = $(this),
					countTo = $this.attr("data-count");
				$({ countNum: $this.text() }).animate(
					{
						countNum: countTo
					},
					{
						duration: 3000,
						easing: "linear",
						step: function () {
							// Count up with commas
							$this.text(Math.floor(this.countNum).toLocaleString("en"));
						},
						complete: function () {
							// Add comma after done counting
							$this.text(this.countNum.toLocaleString("en"));
						}
					}
				);
			});
		 }
		 new ScrollMagic.Scene({
			triggerElement: ".SingleGameTempCountItemNumber-count"
		})
		.on("enter", function () {
			animateNumber();
		})
		.reverse(false)
		.addTo(controller);
	 }
	 
	 /**
	 * ScrollMagic: a-GameTextFixed
	 */		
	if($('.SingleGameTempListTitle-title').length > 0){
		$('.SingleGameTempListTitle-title').each(function(){
			var GameTextFixedText = $(this).outerHeight();
			var GameTextFixedHeight = $(this).outerHeight()/2;
			var GameTextFixedSection = $(this).closest('.SingleGameTempList').outerHeight();
			var GameTextFixedInnerHeight = GameTextFixedSection - GameTextFixedText;
			var GameTextFixedTotalHeight = GameTextFixedInnerHeight;
			
			// function to be used to retrieve variable
			function getGameTextFixedHeight() {
				return GameTextFixedTotalHeight;	
				
			}	
			var GameTextFixedController = new ScrollMagic.Controller({
			  refreshInterval: 100
			});
			
			var GameTextFixedPage = new ScrollMagic.Scene({
				triggerElement: this.children[0], 
				duration: getGameTextFixedHeight,
				triggerHook: 0.5,
				offset: GameTextFixedText,
			 })
			.setPin(this.children[0])
			.addTo(GameTextFixedController);
		});
	}
	
	
	
	/**
	 * RelevantJobsSlide
	 */	
	if($('.RelevantJobsSlide').length > 0){
	   var RelevantJobs = new Swiper(".RelevantJobsSlide-container", {
			observer: true,
			observeParents: true,
			watchOverflow: true,
			slidesPerView: "auto",
			navigation: {
				nextEl: ".RelevantJobsSlide-next",
				prevEl: ".RelevantJobsSlide-prev",
			},
		});
	}
	
	/**
	 * RecruitDropDown
	 */	
	function RecruitDropDown() {
		if($(this).closest('.RecruitSearchItem').hasClass('is-Active')){
			$(this).closest('.RecruitSearchItem').removeClass('is-Active').find('.RecruitSearchItem-content').slideUp(120);
		}else{
			$(this).closest('.RecruitSearchItem').addClass('is-Active').find('.RecruitSearchItem-content').slideDown(120);
		}
	}
	
	$(document).on('click', '.j-ToggleListTitle-link', RecruitDropDown);
	
	
	/**
	 * RecruitClear
	 */	
	function RecruitClear() {
		$('.RecruitSearchItem .BasicCheckboxInput-input').prop('checked', false);
	}
	
	$(document).on('click', '.RecruitSearchTitle-button', RecruitClear);
	
	/**
	 * MobileDropDown
	 */	
	function MoRecruitDropDown() {
		if($(window).width() <= 767){
			if($('.RecruitSearch-search').hasClass('is-Active')){
				$('.RecruitSearch-search').removeClass('is-Active');
			}else{
				$('.RecruitSearch-search').addClass('is-Active');
			}
		}
	}
	
	$(document).on('click', '.RecruitSearchTitle.mobile .RecruitSearchTitle-text', MoRecruitDropDown);
	
	function MoRecruitDropDownClose() {
		$('.RecruitSearch-search').removeClass('is-Active');
	}
	
	$(document).on('click', '.RecruitSearchSearch-close, .RecruitSearchMoBtn', MoRecruitDropDownClose);
	
	/**
	 * Story
	 */
	 function StoryLink() {
		 if($(window).width() <= 1024){
			 $(this).addClass('Is-View').closest('.StoryTempPost-item').siblings('.StoryTempPost-item').find('.StoryTempPostItem').removeClass('Is-View');
		 }
	}
	
	$(document).on('click', '.StoryTempPostItem', StoryLink);
	
	/**
	 * Life Tab
	 */
	 function LifeTab() {
		var idx = $(this).parent('.WelfareSideTab-item').index();
		$(this).closest('.WelfareSideTab-item').addClass('is-Current').siblings('.WelfareSideTab-item').removeClass('is-Current');
		$('.WelfareList-item').eq(idx).addClass('is-Current').siblings('.WelfareList-item').removeClass('is-Current');
	}
	
	$(document).on('click', '.WelfareSideTab-link', LifeTab);
	
	/**
	 * Toc
	 */
	 if($('.Toc').length > 0){
		$(document).on("scroll", onScroll);
		
		//smoothscroll
		$('.Toc-link').on('click', function (e) {
			e.preventDefault();
			$(document).off("scroll");

			$('.Toc-link').each(function () {
				$(this).removeClass('is-Active');
			})
			$(this).addClass('is-Active');
			var headerHeight = $('.site-header').height();
			var adminBar = $('#wpadminbar').height();
			var target = this.hash,
				menu = target;
			$target = $(target);
			 if($('#wpadminbar').length > 0){
				$('html, body').stop().animate({
					scrollTop: $target.offset().top - headerHeight - adminBar
				}, 500, 'swing', function () {
					$(document).on("scroll", onScroll);
				});
			 }else{
				 $('html, body').stop().animate({
					scrollTop: $target.offset().top - headerHeight
				}, 500, 'swing', function () {
					$(document).on("scroll", onScroll);
				});
			 }
		});
		
		function onScroll(event){
			var scrollPos = $(document).scrollTop();
			$('.Toc-link').each(function () {
				var currLink = $(this);
				var refElement = $(currLink.attr("href"));
				if (refElement.position().top <= scrollPos && refElement.position().top + refElement.height() > scrollPos) {
					$('.Toc-link').removeClass("is-Active");
					currLink.addClass("is-Active");
				}
				else{
					currLink.removeClass("is-Active");
				}
			});
		}
	 }
	 
	 //TopBtn
	//==================================================*
	function TopBtn() {
		$('html,body').animate({
			scrollTop:0
		}, 500);
	}
	
	$(document).on('click', '.TopButton', TopBtn);
	
	if($('body.home').length > 0){
		var HomeTopBtnOpen = new ScrollMagic.Scene({
			triggerElement: '.MainNews',
			triggerHook:0.1
		})
		.setClassToggle('.TopButton', 'is-Open')
		.addTo(controller);
	}else{
		if($('.post-template-single-game').length > 0){
			var GameOpen = new ScrollMagic.Scene({
				triggerElement: '.SingleGameCont',
				triggerHook:0.1
			})
			.setClassToggle('.TopButton', 'is-Open')
			.addTo(controller);
		}else{
			var TopBtnOpen = new ScrollMagic.Scene({
				triggerElement: '.site-main',
				triggerHook:0.1
			})
			.setClassToggle('.TopButton', 'is-Open')
			.addTo(controller);
		}
	}
	
	
	var TopBtnStop = new ScrollMagic.Scene({
		triggerElement: '.site-footer',
		triggerHook:0.99
	})
	.setClassToggle('.TopButton', 'is-Stop')
	.addTo(controller);
	
	/**
	 * Life Scroll Tab
	 */
	 if($('body.page .SmoothTab').length > 0){
		$(document).on("scroll", LifeonScroll);
		
		//smoothscroll
		$('.ThirdDepthTab-link').on('click', function (e) {
			e.preventDefault();
			$(document).off("scroll");
			$(this).closest('.ThirdDepthTab').removeClass('is-View').find('.ThirdDepthTab-list').slideUp(120);

			$('.ThirdDepthTab-link').each(function () {
				$(this).parent('li').removeClass('is-Current');
			})
			$(this).parent('li').addClass('is-Current');
			var headerHeight = $('.site-header').height();
			var adminBar = $('#wpadminbar').height();
			var target = this.hash,
				menu = target;
			$target = $(target);
			 if($('#wpadminbar').length > 0){
				$('html, body').stop().animate({
					scrollTop: $target.offset().top - headerHeight - adminBar
				}, 500, 'swing', function () {
					$(document).on("scroll", LifeonScroll);
				});
			 }else{
				 $('html, body').stop().animate({
					scrollTop: $target.offset().top - headerHeight
				}, 500, 'swing', function () {
					$(document).on("scroll", LifeonScroll);
				});
			 }
		});
		
		function LifeonScroll(event){
			var scrollPos = $(document).scrollTop();
			$('.ThirdDepthTab-link').each(function () {
				var currLink = $(this);
				var refElement = $(currLink.attr("href"));
				if (refElement.position().top <= scrollPos && refElement.position().top + refElement.height() > scrollPos) {
					$('.ThirdDepthTab-link').parent('li').removeClass("is-Current");
					currLink.parent('li').addClass("is-Current");
				}
				else{
					currLink.parent('li').removeClass("is-Current");
				}
			});
		}
	 }
	 
	 /**
	 * Toc Open
	 */
	if($('.Toc').length > 0){
		var TocOpen = new ScrollMagic.Scene({
			triggerElement: '#KraftonPeople',
			triggerHook:0.1
		})
		.setClassToggle('.Toc', 'is-View')
		.addTo(controller);
	}
	
	/**
	 * SavedJobs
	 */
	 function SavedJobs() {
		 if($(this).next('.BookmarkList').hasClass('is-View')){
			 $(this).next('.BookmarkList').removeClass('is-View');
		 }else{
			 $(this).next('.BookmarkList').addClass('is-View');
		 }
		
	}
	
	$(document).on('click', '.Bookmark-link', SavedJobs);
	
	function SavedJobsClose() {
		$(this).parent('.BookmarkList').removeClass('is-View');
	}
	
	$(document).on('click', '.ClosedButton', SavedJobsClose);
});

//==================================================*
//	Window:Ready
//==================================================*
$(window).ready(function(){
	/**
	 * Main KeyVisual
	 */
	$('body').addClass('is-Play');
});

//==================================================*
//	Window:Safari Check
//==================================================*
$(function() {
  if (navigator.userAgent.indexOf('Safari') != -1 && navigator.userAgent.indexOf('Chrome') == -1) {
    $('body').addClass('Safari');
  }
});

