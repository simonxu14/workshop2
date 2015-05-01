<%@ page language="java" import="java.util.*,com.server.bean.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
  <head>
    <base href="<%=basePath%>">
    <title>修改子工厂</title>
    
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>

		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
		<link rel="icon" href="<%=basePath%>images/favicon.ico">
		<link rel="shortcut icon" href="<%=basePath%>images/favicon.ico">
		<link rel="stylesheet" href="<%=basePath%>css/list.css">
		<link rel="stylesheet" href="<%=basePath%>css/style.css">
		<script src="<%=basePath%>js/jquery.js"></script>
		<script src="<%=basePath%>js/jquery-migrate-1.1.1.js"></script>
		<script src="<%=basePath%>js/jquery.equalheights.js"></script>
		<script src="<%=basePath%>js/main.js"></script>
		<script src="<%=basePath%>js/jquery.ui.totop.js"></script>
		<script src="<%=basePath%>js/jquery.easing.1.3.js"></script>
		<script src="<%=basePath%>js/m.js"></script>
    
    
    
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
					<li class="current bt-icon"><a href="index.jsp">首页</a>
					</li>
					<li class="bt-icon"><a href="manufacturer.jsp">工厂</a>
					</li>
					<li class="bt-icon"><a href="Worker/showWorker.do">员工</a>
					</li>
					<li class="bt-icon"><a href="workshop.jsp">车间</a>
					</li>
					<li class="bt-icon"><a href="machine.jsp">机床</a>
					</li>
					<li class="bt-icon"><a href="contact.jsp">联系我们</a>
					</li>
				</ul>
				</nav>
            <div class="clear"></div>
          </div>
          <div class="clear"></div>
        </div>
      </div>
    </header>
<!--==============================Content=================================-->
    <div class="content cont1">
      <div class="container_12">
        <div class="grid_12">
          <h2 class="mb0">修改子工厂</h2>
        </div>
      </div>
    </div>
    <div class="gray_block gb1">
      <div class="container_12">
                <!-- Content -->
                
                <%
  		Manufacturer u =(Manufacturer)request.getAttribute("user");
  	%>
                
                
                    <form action="<c:url value="/Manufacturer/updateManufacturer.do"/>" method="post">
                   
                    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tr>
                    </tr>
                    </table>
                     <center>
                    <table width="694" border="0" align="center" cellpadding="0" cellspacing="0">
                      <tr>
                        <td width="547" valign="top"><table width="100%"  border="0" cellspacing="0" cellpadding="0">
                    </br></br>
                            <tr>
                              <div class="input-group" style="width:350">
                                <span class="input-group-addon">厂家编号：&nbsp</span>
                                <input type="text" class="form-control" name="ID" value="<%=u.getID()%>" maxlength="15" >
                              </div>
                            </tr>
                            <tr>
                              <div class="input-group" style="width:350">
                                <span class="input-group-addon">厂家名称：&nbsp</span>
                                <input type="text" class="form-control" name="name" value="<%=u.getName()%>" maxlength="15" >
                              </div>
                            </tr>
                            <tr>
                              <div class="input-group" style="width:350">
                                <span class="input-group-addon">负责人员：&nbsp</span>
                                <input type="text" class="form-control" name="principal" value="<%=u.getPrincipal()%>" maxlength="15" >
                              </div>
                            </tr>
                            <tr>
                              <div class="input-group" style="width:350">
                                <span class="input-group-addon">联系电话：&nbsp</span>
                                <input type="text" class="form-control" name="phone" value="<%=u.getPhone()%>" maxlength="15" >
                              </div>
                            </tr>
                            <tr>
                              <div class="input-group" style="width:350">
                                <span class="input-group-addon">工厂地址：&nbsp</span>
                                <input type="text" class="form-control" name="address" value="<%=u.getAddress()%>" maxlength="15" >
                              </div>
                            </tr>
                            <tr>
                              <td height="34">&nbsp;</td>
                              <td width="30%" class="word_grey"><input class="btn btn-primary btn-sm" role="button" type="submit" value="确定保存"/>
                              <input name="Reset" type="reset" class="btn_grey btn btn-primary btn-sm" id="Reset" value="重新填写"></td>
                            </tr>
                            
                        </table>
                        </center></td>
                      </tr>
                    </table>
                    
                    </form>
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
      $('.responsive').on('click', '.close', function(){
        $('.close').remove();
        bgColor = $('.active .card-front').css('background-color');
        $('.responsive').removeClass(effect);
        $('.all-content').hide();
        $('.content li').removeClass('active').show().css({ 
          'border-bottom':'1px solid #2c2c2c',
          'border-left':'1px solid #2c2c2c' 
        });
        $('.card-front, .card-back').show();
        $('.content').css('background-color',bgColor);
      });
    });
    </script>
  </body>
</html>
