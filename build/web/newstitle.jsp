<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*,Title.*"%>
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
<title>目录</title>
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
           <li><a href="title.jsp?add=nengxiao&y=1">能效管理</a></li>
          <li><a href="title.jsp?add=shui&y=1">水处理</a></li>
          <li><a href="title.jsp?add=haishi&y=1">海事</a></li>
          <li><a href="title.jsp?add=yiliao&y=1">医疗</a></li>
          <li><a href="title.jsp?add=jiudian&y=1">酒店</a></li>
          <li><a href="title.jsp?add=bangong&y=1">办公楼</a></li>
          <li><a href="title.jsp?add=chezhan&y=1">车站</a></li>
          <li  class="lli"><a href="title.jsp?add=jichang&y=1">机场</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="index.jsp">产品与服务</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="title.jsp?add=jianzhu&y=1">建筑</a></li>
          <li><a href="title.jsp?add=zhileng&y=1">制冷</a></li>
          <li><a href="title.jsp?add=jianqie&y=1">剪切机</a></li>
          <li><a href="title.jsp?add=zidonghua&y=1">自动化</a></li>
          <li><a href="title.jsp?add=jixie&y=1">机械</a></li>
          <li><a href="title.jsp?add=zhagang&y=1">轧钢机</a></li>
          <li><a href="title.jsp?add=moju&y=1">磨具</a></li>
          <li class="lli"><a href="title.jsp?add=qiezhi&y=1">切纸</a></li>
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
          <li><a href="newstitle.jsp?add=zhaopin&y=1">人才招聘</a></li>
          <li  class="lli"><a href="newstitle.jsp?add=news&y=1">新闻中心</a></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="main">
    <div class="left">
      <div class="box_1">
        <div class="left_title">产品目录</div>
        <div class="left_nr">
          <ul>
            <li><a href="title.jsp?add=jianzhu&y=1">建筑</a></li>
          <li><a href="title.jsp?add=zhileng&y=1">制冷</a></li>
          <li><a href="title.jsp?add=jianqie&y=1">剪切机</a></li>
          <li><a href="title.jsp?add=zidonghua&y=1">自动化</a></li>
          <li><a href="title.jsp?add=jixie&y=1">机械</a></li>
          <li><a href="title.jsp?add=zhagang&y=1">轧钢机</a></li>
          <li><a href="title.jsp?add=moju&y=1">磨具</a></li>
          <li class="lli"><a href="title.jsp?add=qiezhi&y=1">切纸</a></li>
          </ul>
        </div>
      </div>
      <div class="box_1" style="margin:0px;">
        <div class="left_title">公司信息</div>
        <div class="left_nr">
          <ul>
            <li><a href="guanyuwomen.jsp">关于我们</a></li>
          <li><a href="newstitle.jsp?add=zhaopin&y=1">人才招聘</a></li>
          <li  class="lli"><a href="newstitle.jsp?add=news&y=1">新闻中心</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">
      <img src="images/img_8.gif" style="float:left"/>
      <div class="news">
        <div class="news_title"><span><img src="images/title_1.gif" /></span><a href="http://www.865171.cn"><img src="images/more.gif" /></a></div>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <%
         String add=request.getParameter("add").trim();
           int y=Integer.parseInt(request.getParameter("y"));
          NewsTitle til=new NewsTitle();
       	  til.setShowstr(add,y);
       	out.print(til.getShowstr());
    %>
          </tr>
        </table>
      </div>
    </div>
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