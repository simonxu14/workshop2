<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Home</title>
		<link rel="icon" href="images/favicon.ico">
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" href="css/camera.css">
		<link rel="stylesheet" href="css/component.css">
		<link rel="stylesheet" href="css/style.css">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-migrate-1.1.1.js"></script>
		<script src="js/jquery.equalheights.js"></script>
		<script src="js/jquery.ui.totop.js"></script>
		<script src="js/jquery.easing.1.3.js"></script>
		<script src="js/camera.js"></script>
		<script src="js/snap.svg-min.js"></script>
		<!--[if (gt IE 9)|!(IE)]><!-->
		<script src="js/jquery.mobile.customized.min.js"></script>
		<!--<![endif]-->
		<script>
		$(document).ready(function(){
			jQuery('#camera_wrap').camera({
			loader: false,
			pagination: true ,
			minHeight: '394',
			thumbnails: false,
			height: '40.1875%',
			caption: false,
			navigation: false,
			fx: 'mosaic'
			});
			$().UItoTop({ easingType: 'easeOutQuart' });
		})
		</script>
		<!--[if lt IE 8]>
		<div style=' clear: both; text-align:center; position: relative;'>
			<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
				<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
			</a>
		</div>
		<![endif]-->
		<!--[if lt IE 9]>
		<script src="js/html5shiv.js"></script>
		<link rel="stylesheet" media="screen" href="css/ie.css">
		<![endif]-->
		<!--[if lt IE 10]>
		<link rel="stylesheet" media="screen" href="css/ie1.css">
		<![endif]-->
	</head>
	<body class="page1">
<!--==============================header=================================-->
		<header>
			<div class="container_12">
				<div class="grid_12">
					<h2><a href="index.jsp"><img src="images/logo.gif"></a></h2>
					<div class="menu_block">
						<nav id="bt-menu" class="bt-menu">
							<a href="#" class="bt-menu-trigger"><span>Menu</span></a>
							<ul>
								<li class="current bt-icon"><a href="index.jsp">首页</a></li>
								<li class="bt-icon"><a href="manufacturer.jsp">工厂</a></li>
								<li class="bt-icon"><a href="Worker/showWorker.do">员工</a></li>
								<li class="bt-icon"><a href="workshop.jsp">车间</a></li>
								<li class="bt-icon"><a href="machine.jsp">机床</a></li>
								<li class="bt-icon"><a href="contact.jsp">联系我们</a></li>
							</ul>
						</nav>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</header>
		<div class="slider_wrapper">
			<div id="camera_wrap" class="">
				<div data-src="images/slide.jpg"></div>
				<div data-src="images/slide1.jpg"></div>
				<div data-src="images/slide2.jpg"></div>
			</div>
		</div>
		<div class="container_12">
			<div class="grid_12">
				<div class="slogan">
					成都万明机械设备制造有限公司<br>
					<a href="manufacturer.jsp" class="btn">更多</a>
				</div>
			</div>
		</div>
		<div class="container_12">
			<section class="grid" id="grid">
				<a href="manufacturer.jsp" data-path-hover="m 180,70.57627 -180,0 L 0,0 180,0 z">
					<figure>
						<svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,262 0,0 180,0 z"/></svg>
						<figcaption>
						<div class="title">工厂</div>
						</figcaption>
					</figure>
					<span>更多</span>
				</a>
				<a href="workshop.jsp" data-path-hover="m 180,70.57627 -180,0 L 0,0 180,0 z">
					<figure>
						<svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,262 0,0 180,0 z"/></svg>
						<figcaption>
							<div class="title">车间</div>
						</figcaption>
					</figure>
					<span>更多</span>
				</a>
				<a href="machine.jsp" data-path-hover="m 180,70.57627 -180,0 L 0,0 180,0 z">
					<figure>
						<svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,262 0,0 180,0 z"/></svg>
						<figcaption>
						<div class="title">机床</div>
						</figcaption>
					</figure>
					<span>更多</span>
				</a>
				<a href="Worker/showWorker.do" data-path-hover="m 180,70.57627 -180,0 L 0,0 180,0 z">
					<figure>
						<svg viewBox="0 0 180 320" preserveAspectRatio="none"><path d="M 180,160 0,262 0,0 180,0 z"/></svg>
						<figcaption>
						<div class="title">员工</div>
						</figcaption>
					</figure>
					<span>更多</span>
				</a>
			</section>
		</div>
<!--==============================Content=================================-->
		<div class="content">
			<div class="container_12">
				<div class="grid_6">
					<img src="images/page1_img1.jpg" alt="" class="img_inner fleft">
					<div class="extra_wrapper">
						<div class="title1">车间管理系统</div>
						<p>
							&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp本系统是基于光栅尺的工厂车间中用来监控生产过程的监控系统，包括光栅数据的采集、数据汇聚统计、服务器存储、客户端查询数据及历史数据转存等系统基本构成部分.
						</p>
					</div>
					<div class="clear cl1"></div>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp本方案采取C/S与B/S相结合的架构，利用C/S架构的灵活性来处理整个方案实施过程中的具体事务处理，B/S的方便与稳定性来进行数据传输与存储。
				</div>
				<div class="grid_3">
					<div class="block1">
						<div class="title">20 <span>年的生产经验</span></div>
						成都万明机械设备制造有限公司创建于1993年
						<br>
						<a href="manufacturer.jsp" class="btn bt1">更多</a>
					</div>
				</div>
				<div class="grid_3 ver">
					<div class="block1">
						<div class="title">5 <span>次民营先进企业称号</span></div>
						集自主开发、设计、制造为一体的专业生产各型冷弯成型设备的大型企业
						<br>
						<a href="manufacturer.jsp" class="btn bt1">更多</a>
					</div>
				</div>
			</div>
		</div>
		<div class="gray_block">
			<div class="container_12">
				<div class="grid_4">
					<div class="block2">
						<time datetime="2014-01-01"><span class="col1">18</span>二月</time>
						<div class="">
							<div class="extra_wrapper">
								<div class="title col1"><a href="#">彩钢瓦设备</br>行业特点</a></div>
							</div>
						</div>
						<div class="clear"></div>
						<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp彩钢瓦设备冷弯成型技术近些年已经在国内被广泛应用，它是一种把卷材、工字钢等金属板类材料不断横向弯曲，以达到适合生产采用的形状的加工工艺。</p>
						<a href="#" class="col1">更多</a>
					</div>
				</div>
				<div class="grid_4">
					<div class="block2">
						<time datetime="2014-01-01"><span class="col1">21</span>二月</time>
						<div class="">
							<div class="extra_wrapper">
								<div class="title col1"><a href="#">彩钢瓦设备</br>琉璃瓦成型设备特点</a></div>
							</div>
						</div>
						<div class="clear"></div>
						<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp经该彩钢瓦设备机辊轧冲模成型的仿古琉璃瓦具有外形美观、古朴典雅、造型考究别致、品位高贵等特点，可广泛用于别墅、度假村、花园式工厂、旅游风景区、亭台楼榭等地方。</p>
						<a href="#" class="col1">更多</a>
					</div>
				</div>
				<div class="grid_4">
					<div class="block2">
						<time datetime="2014-01-01"><span class="col1">12</span>二月</time>
						<div class="">
							<div class="extra_wrapper">
								<div class="title col1"><a href="#">车间曲线</br>统计图</a></div>
							</div>
						</div>
						<div class="clear"></div>
						<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp在android客户端上可以实时看到车间每天的温度、湿度变化曲线，用户可以通过android客户端在平板或者手机上方便、快捷地实时查看工厂的车间和机床的实时信息。</p>
						<a href="#" class="col1">更多</a>
					</div>
				</div>
			</div>
		</div>
<!--==============================footer=================================-->
		<footer>
			<div class="container_12">
				<div class="grid_12">
					<div class="socials">
						<a href="#" class="fa fa-facebook"></a>
						<a href="#" class="fa fa-twitter"></a>
						<a href="#" class="fa fa-google-plus"></a>
					</div>
					<div class="clear"></div>
					<div class="copy">
						 &copy; 2014 | <a href="#">版权</a> <br> 成都万明机械设备制造有限公司 <a href="http://www.wmcgw.com/" rel="nofollow">http://www.wmcgw.com/</a>
					</div>
				</div>
			</div>
		</footer>
		<script>
			$(document).ready(function(){
			 $(".bt-menu-trigger").toggle(
				function(){
				$('.bt-menu').addClass('bt-menu-open');
				},
				function(){
				$('.bt-menu').removeClass('bt-menu-open');
				}
			);
			});
			(function() {
			function init() {
				var speed = 250,
				easing = mina.easeinout;
				[].slice.call ( document.querySelectorAll( '#grid > a' ) ).forEach( function( el ) {
				var s = Snap( el.querySelector( 'svg' ) ), path = s.select( 'path' ),
					pathConfig = {
					from : path.attr( 'd' ),
					to : el.getAttribute( 'data-path-hover' )
					};
				el.addEventListener( 'mouseenter', function() {
					path.animate( { 'path' : pathConfig.to }, speed, easing );
				} );
				el.addEventListener( 'mouseleave', function() {
					path.animate( { 'path' : pathConfig.from }, speed, easing );
				} );
				} );
			}
			init();
			})();
		</script>
	</body>
</html>