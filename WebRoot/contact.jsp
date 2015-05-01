<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
	<head>
		<title>Contacts</title>
		<meta charset="utf-8">
		<link rel="icon" href="images/favicon.ico">
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" href="css/form.css">
		<link rel="stylesheet" href="css/style.css">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-migrate-1.1.1.js"></script>
		<script src="js/jquery.equalheights.js"></script>
		<script src="js/jquery.ui.totop.js"></script>
		<script src="js/jquery.easing.1.3.js"></script>
		<script src="js/touchTouch.jquery.js"></script>
		<script src="js/TMForm.js"></script>
		<script>
		$(document).ready(function(){
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
					<h2 class="mb0">找到我们</h2>
				</div>
			</div>
		</div>
		<div class="gray_block gb1">
			<div class="container_12">
				<div class="grid_12">
					<div class="map">
						<figure class="">
							<iframe width="425" height="350" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://ditu.google.cn/maps?f=q&amp;source=s_q&amp;hl=zh-CN&amp;geocode=&amp;q=%E5%9B%9B%E5%B7%9D%E7%9C%81%E6%88%90%E9%83%BD%E6%B8%A9%E6%B1%9F%E5%8C%BA%E4%B8%87%E6%98%8E%E6%9C%BA%E6%A2%B0%E8%AE%BE%E5%A4%87%E5%88%B6%E9%80%A0%E5%85%AC%E5%8F%B8&amp;aq=0&amp;oq=%E4%B8%87%E6%98%8E&amp;sll=30.572269,104.066541&amp;sspn=0.617208,1.234589&amp;brcurrent=3,0x36efdcb3190150d3:0xb76b4bc1a73ac318,0%3B5,0,0&amp;ie=UTF8&amp;hq=%E4%B8%87%E6%98%8E%E6%9C%BA%E6%A2%B0%E8%AE%BE%E5%A4%87%E5%88%B6%E9%80%A0%E5%85%AC%E5%8F%B8&amp;hnear=%E5%9B%9B%E5%B7%9D%E7%9C%81%E6%88%90%E9%83%BD%E6%B8%A9%E6%B1%9F%E5%8C%BA&amp;ll=30.721678,103.903619&amp;spn=0.086845,0.103341&amp;t=m&amp;output=embed"></iframe><br /><small><a href="http://ditu.google.cn/maps?f=q&amp;source=embed&amp;hl=zh-CN&amp;geocode=&amp;q=%E5%9B%9B%E5%B7%9D%E7%9C%81%E6%88%90%E9%83%BD%E6%B8%A9%E6%B1%9F%E5%8C%BA%E4%B8%87%E6%98%8E%E6%9C%BA%E6%A2%B0%E8%AE%BE%E5%A4%87%E5%88%B6%E9%80%A0%E5%85%AC%E5%8F%B8&amp;aq=0&amp;oq=%E4%B8%87%E6%98%8E&amp;sll=30.572269,104.066541&amp;sspn=0.617208,1.234589&amp;brcurrent=3,0x36efdcb3190150d3:0xb76b4bc1a73ac318,0%3B5,0,0&amp;ie=UTF8&amp;hq=%E4%B8%87%E6%98%8E%E6%9C%BA%E6%A2%B0%E8%AE%BE%E5%A4%87%E5%88%B6%E9%80%A0%E5%85%AC%E5%8F%B8&amp;hnear=%E5%9B%9B%E5%B7%9D%E7%9C%81%E6%88%90%E9%83%BD%E6%B8%A9%E6%B1%9F%E5%8C%BA&amp;ll=30.721678,103.903619&amp;spn=0.086845,0.103341&amp;t=m" style="color:#0000FF;text-align:left">查看大图</a></small>
								
								
						</figure>
					</div>
				</div>
				<div class="grid_4">
					<h2 class="head1">地址</h2>
					<div class="map">
					<address>
						<dl>
							<dt>四川省成都市温江区永宁镇永福
							</dt>

							<dd><span>服务热线</span>400-6191-908</dd>
							<dd><span>销售电话</span>028-82662762</dd>
							<dd><span>手机</span>15682023368</dd>
							<dd><span>质量投诉</span>13568967932</dd>
						</dl>
					</address>
					
					</div>
				</div>
				<div class="grid_8">
					<h2 class="head1">联系我们</h2>
					<form id="form">
						<div class="success_wrapper">
							<div class="success-message">Contact form submitted</div>
						</div>
						<label class="name">
							<input type="text" placeholder="姓名:" data-constraints="@Required @JustLetters" />
							<span class="empty-message">*This field is required.</span>
							<span class="error-message">*This is not a valid name.</span>
						</label>
						<label class="email">
							<input type="text" placeholder="邮箱:" data-constraints="@Required @Email" />
							<span class="empty-message">*This field is required.</span>
							<span class="error-message">*This is not a valid email.</span>
						</label>
						<label class="phone">
							<input type="text" placeholder="电话:" data-constraints="@Required @JustNumbers"/>
							<span class="empty-message">*This field is required.</span>
							<span class="error-message">*This is not a valid phone.</span>
						</label>
						<label class="message">
							<textarea placeholder="留言:" data-constraints='@Required @Length(min=20,max=999999)'></textarea>
							<span class="empty-message">*This field is required.</span>
							<span class="error-message">*The message is too short.</span>
						</label>
						<div>
							<div class="clear"></div>
							<div class="btns">
								<a href="#" data-type="reset" class="btn">清除</a>
								<a href="#" data-type="submit" class="btn">提交</a>
							</div>
						</div>
					</form>
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