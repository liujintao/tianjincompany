<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*,Title.*,Content.*"%>
<%@page import="dao.RegisterDao"%>
<%@page import="entity.BBS" %>
<%request.setCharacterEncoding("UTF-8");%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>详细信息</title>
<base href="<%=basePath%>"/>
<link href="css/css.css" rel="stylesheet" type="text/css" />
<script language="javascript" src="js/menu.js"></script>
</head>
<body>
<div class="zhong">
  <div class="top">
    <div class="top_left">Logo</div>
    <div class="top_right">
      <div class="top_right_1"><a   href= "http://localhost:8080/web/index.jsp"     class= "a-top "   onClick= "this.style.behavior= 'url(#default#homepage) ';this.setHomePage( '天津郡阳塑胶机械有限公司 ');return(false); "   style= "behavior:   url(#default#homepage) "   > 设为首页 </a>
　|<A   href= "javascript:window.external.addFavorite( 'http://localhost:8080/web/index.jsp ', '天津郡阳塑胶机械有限公司 ') "   class= "a-top "   target= "_self "> 加入收藏 </A> 　|　<a href="Englishindex.jsp">English</a></div>
      <div class="top_right_2"><img src="images/img_1.gif" /></div>
    </div>
    <div class="clear"></div>
  </div>
  <div class="banner"><img src="images/img_2.gif" /></div>
  <div class="menu">
    <div class="menusel" style="width:95px;">
      <h2><a href="index.jsp">首页</a></h2>
    </div>
    <div id="menu1" class="menusel">
      <h2><a href="index.jsp">解决方案</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="title.jsp?add=nengxiao">能效管理</a></li>
          <li><a href="title.jsp?add=shui">水处理</a></li>
          <li><a href="title.jsp?add=haishi">海事</a></li>
          <li><a href="title.jsp?add=yiliao">医疗</a></li>
          <li><a href="title.jsp?add=jiudian">酒店</a></li>
          <li><a href="title.jsp?add=bangong">办公楼</a></li>
          <li><a href="title.jsp?add=chezhan">车站</a></li>
          <li  class="lli"><a href="title.jsp?add=jichang">机场</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="index.jsp">产品与服务</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="title.jsp?add=jianzhu">建筑</a></li>
          <li><a href="title.jsp?add=zhileng">制冷</a></li>
          <li><a href="title.jsp?add=jianqie">剪切机</a></li>
          <li><a href="title.jsp?add=zidonghua">自动化</a></li>
          <li><a href="title.jsp?add=jixie">机械</a></li>
          <li><a href="title.jsp?add=zhagang">轧钢机</a></li>
          <li><a href="title.jsp?add=moju">磨具</a></li>
          <li class="lli"><a href="title.jsp?add=qiezhi">切纸</a></li>
        </ul>
      </div>
    </div>
    <div id="menu3" class="menusel">
      <h2><a href="index.jsp">客户专区</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li  class="lli"><a href="liuyanban.jsp">留言板</a></li>
        </ul>
      </div>
    </div>
    <div id="menu4" class="menusel">
      <h2><a href="index.jsp">公司信息</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
           <li><a href="guanyuwomen.jsp">关于我们</a></li>
          <li><a href="newstitle.jsp?add=zhaopin">人才招聘</a></li>
          <li  class="lli"><a href="newstitle.jsp?add=news">新闻中心</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="main">
    <div class="left">
          <div class="box_1">
        <div class="left_title">用户登录</div>
        <div class="left_nr">
          <ul>
         <form action="login.do" name="form_login" method="post" onSubmit="return send()">
            用户:<input type="textfield" name="account" id="account" value="" /> <br/><br/>
            密码:<input type="password" name="password" id="password" value="" /><br/>
            <input type="submit" value="提交"/>      <input type="reset" value="重置" />
         </form>
          </ul>
        </div>
      </div>
      <div class="box_1">
        <div class="left_title">产品目录</div>
        <div class="left_nr">
          <ul>
            <li><a href="title.jsp?add=jianzhu">建筑</a></li>
          <li><a href="title.jsp?add=zhileng">制冷</a></li>
          <li><a href="title.jsp?add=jianqie">剪切机</a></li>
          <li><a href="title.jsp?add=zidonghua">自动化</a></li>
          <li><a href="title.jsp?add=jixie">机械</a></li>
          <li><a href="title.jsp?add=zhagang">轧钢机</a></li>
          <li><a href="title.jsp?add=moju">磨具</a></li>
          <li class="lli"><a href="title.jsp?add=qiezhi">切纸</a></li>
          </ul>
        </div>
      </div>
      <div class="box_1" style="margin:0px;">
        <div class="left_title">公司信息</div>
        <div class="left_nr">
          <ul>
           <li><a href="guanyuwomen.jsp">关于我们</a></li>
          <li><a href="newstitle.jsp?add=zhaopin">人才招聘</a></li>
          <li  class="lli"><a href="newstitle.jsp?add=news">新闻中心</a></li>
          </ul>
        </div>
      </div>
    </div>
        <h1>留言成功，我们会尽快联系您的，谢谢！</h1>
     <div class="clear"></div>
    <div class="huoban">
      <div class="huoban_title"><img src="images/title_2.gif" /></div>
      <div class="huoban_nr">
        <ul>
          <li><img src="images/huoban_logo.gif" /></li>
          <li><img src="images/huoban_logo.gif" /></li>
          <li><img src="images/huoban_logo.gif" /></li>
          <li><img src="images/huoban_logo.gif" /></li>
          <li><img src="images/huoban_logo.gif" /></li>
        </ul>
        <div class="clear"></div>
      </div>
    </div>
  </div>
 <div class="bottom"> Email：liujintaocool@163.com 联系电话：15854558902 QQ：814417622<br />
    版权所有 2010-2011 <a href="http://localhost:8080/web/index.jsp">天津郡阳塑胶机械有限公司
</a> </div>
<script src="js/meun.js" type="text/javascript"></script>
</body>
</html>
