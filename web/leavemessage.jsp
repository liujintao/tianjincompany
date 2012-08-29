<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*"%>
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
<title>CSS+DIV软件宣传模板 | 首页 by 865171.cn</title>
<base href="<%=basePath%>"/>
<link href="css/css.css" rel="stylesheet" type="text/css" />
<script language="javascript" src="js/menu.js"></script>
</head>
<body>
<div class="zhong">
  <div class="top">
    <div class="top_left">Logo</div>
    <div class="top_right">
      <div class="top_right_1"><a href="http://www.865171.cn">设为首页</a>　|　<a href="http://www.865171.cn">加入收藏</a>　|　<a href="http://www.865171.cn">繁體中文</a></div>
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
      <h2><a href="jiejuefanan.jsp">解决方案</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="nengxiaoguanli.jsp">能效管理</a></li>
          <li><a href="shuichuli.jsp">水处理</a></li>
          <li><a href="haishi.jsp">海事</a></li>
          <li><a href="yiliao.jsp">医疗</a></li>
          <li><a href="jiudian.jsp">酒店</a></li>
          <li><a href="bangonglou.jsp">办公楼</a></li>
          <li><a href="chezhan.jsp">车站</a></li>
          <li  class="lli"><a href="jigou.html">机构</a></li>
        </ul>
      </div>
    </div>
    <div id="menu2" class="menusel">
      <h2><a href="chanpinyufuwu.jsp">产品与服务</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="jianzhu.jsp">建筑</a></li>
          <li><a href="zhilen.jsp">制冷</a></li>
          <li><a href="qiegeji.jsp">剪切机</a></li>
          <li><a href="zidonghua.jsp">自动化</a></li>
          <li><a href="jixie.jsp">机械</a></li>
          <li><a href="yagangji.jsp">轧钢机</a></li>
          <li><a href="meju.jsp">磨具</a></li>
          <li class="lli"><a href="qiezhi.jsp">切纸</a></li>
        </ul>
      </div>
    </div>
    <div id="menu3" class="menusel">
      <h2><a href="kehuzhuanqu.jsp">客户专区</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="fenxiaoshangzhuanqu.jsp">分销商专区</a></li>
          <li><a href="shejiyuanzhuanqu.sjp">设计院专区</a></li>
          <li><a href="chengpinchangzhuanqu.jsp">成品厂专区</a></li>
          <li><a href="xitongjichengshangzhuanqu.jsp">系统集成商专区</a></li>
          <li><a href="zhuangshigongsizhuanqu.jsp">装饰公司专区</a></li>
          <li><a href="fangdichanzhuanqu.jsp">房地产专区</a></li>
          <li><a href="gaoxiaohezuozhuanqu.jsp">高校合作专区</a></li>
          <li  class="lli"><a href="liuyanban.jsp">留言板</a></li>
        </ul>
      </div>
    </div>
    <div id="menu4" class="menusel">
      <h2><a href="guonsixinxi.sjp">公司信息</a></h2>
      <div class="position">
        <ul class="clearfix typeul">
          <li><a href="guanyuwomen.jsp">关于我们</a></li>
          <li><a href="rencaizhaopin.jsp">人才招聘</a></li>
          <li  class="lli"><a href="xinwenzhongxin.jsp">新闻中心</a></li>
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
            <li><a href="http://www.865171.cn">滚动滚动滚动滚动</a></li>
            <li><a href="http://www.865171.cn">穿透内网文件传输</a></li>
            <li><a href="http://www.865171.cn">网络版本的个人资料库</a></li>
            <li><a href="http://www.865171.cn">强大的手机短信双向功能</a></li>
          </ul>
        </div>
      </div>
      <div class="box_1" style="margin:0px;">
        <div class="left_title">公司信息</div>
        <div class="left_nr">
          <ul>
            <li><a href="http://www.865171.cn">WEB信息发布系列</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="right">    
<table border="3">
			<tr >
				<td >Id</td>
				<td>姓名</td>
				<td>性别</td>
				<td>公司</td>
				<td>电话</td>
				<td>传真</td>
				<td>email</td>
				<td>地址</td>
				<td>标题</td>
				<td>内容</td>
				<td>时间</td>
			</tr>
	<%
		RegisterDao registerDao = new RegisterDao();
		List<BBS> lists =  registerDao.listbbs();
	%>
	
	<%
		for(BBS b : lists) {
	%>
		
			<tr >
				<td ><%=b.getId() %></td>
				<td><%=b.getName() %></td>
				<td><%=b.getSex() %></td>
				<td><%=b.getCompany() %></td>
				<td><%=b.getTelephone() %></td>
				<td><%=b.getFox() %></td>
				<td><%=b.getEmail() %></td>
				<td><%=b.getAddress() %></td>
				<td><%=b.getTitle() %></td>
				<td><%=b.getContent() %></td>
				<td><%=b.getCreate_date() %></td>
			</tr>
		
	<%
		}
	%>
	
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
  <div class="bottom"> Email：215288671@qq.com 联系电话：15886674344 QQ：215288671<br />
    版权所有 2009-2010 <a href="http://www.865171.cn">免费模板网</a> </div>
</div>
<script src="js/meun.js" type="text/javascript"></script>
</body>
</html>