<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>车间</title>
		<link rel="icon" href="images/favicon.ico">
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" href="css/style.css">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-migrate-1.1.1.js"></script>
		<script src="js/jquery.equalheights.js"></script>
		<script src="js/jquery.ui.totop.js"></script>
		<script src="js/jquery.easing.1.3.js"></script>
		<script src="js/touchTouch.jquery.js"></script>	
		<script>
		$(document).ready(function(){
			$().UItoTop({ easingType: 'easeOutQuart' });
			$('.gallery a.gal').touchTouch();
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
	<body class="">
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
<!--==============================Content=================================-->
		<div class="content cont2">
			<div class="container_12">
				<div class="grid_12">
					<h2 class="mb0">我们的车间</h2>
				</div>
			</div>
		</div>
		<div class="gray_block gb1">
			<div class="container_12">
				<div class="grid_8">
					<div class="blog">
						<img src="images/page5_img1.jpg" alt="">
						<div class="extra_wrapper">
							<div class="text1">
							<a href="#">万明机械生产</a>
							<time class="col2" datetime="2014-01-01">2014年3月12日</time>
							</div>万明机械生产的彩钢瓦设备出口南非，因为服务质量优良，技术先进，受到了外国客户的极大赞誉。
							<br>
							<a href="#" class="btn">更多</a>
						</div>
					</div>
					<div class="blog bd1">
						<img src="images/page5_img2.jpg" alt="">
						<div class="extra_wrapper">
							<div class="text1">
							<a href="#">生产车间的特点</a>
							<time class="col2" datetime="2014-01-01">2014年2月24日</time>
							</div>高效</br>
							高产</br>
							高性能</br>
							高水平</br>
							<br>
							<a href="#" class="btn">更多</a>
						</div>
					</div>
				</div>
				<div class="grid_4">
					<div class="text1 col3 head1">功能</div>
					<ul class="list l1">
						<li><a href="<s:url value="Workshop/showWorkshop.do"/>">所有车间<a></li></br>
						<li><a href="Workshop/addWorkshop.jsp">增加车间</a></li>
						<li><a href="FindDynamicWorkshopServlet">所有车间动态信息</a></li>
						<li><a href="DynamicWorkshop/addDynamicWorkshop.jsp">增加车间动态信息</a></li>
					</ul>
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
		</script>
	</body>
</html>