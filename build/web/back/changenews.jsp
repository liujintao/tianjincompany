<%@page contentType="text/html" pageEncoding="UTF-8" import="com.myapp.bean.*" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="images/skin.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #EEF2FB;
}
-->
</style>
    </head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif">
        <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">修改</div></td>
      </tr>
    </table></td>
    <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" /></td>
  </tr>
  <tr>
    <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
    <td valign="top" bgcolor="#F7F8F9">
        <body style="background-color:#ffffff;">
<DIV class=mcont>
  <DIV class=main-cont>
    <DIV class=cont-info>
      <H1>已经添加的新闻：</H1>
      <DIV class=cont-info-rember>
        <DIV class=finish-area>
          <TABLE border=0 cellSpacing=0 cellPadding=0>
            <TBODY>
              <tr>
                <td>序号</td>
                <td>新闻标题</td>
                <td>新闻内容</td>

                <td>删除</td>
              </tr>
                  <%
ContactBean contact=new ContactBean("news");
String jumpPage=(String)(request.getParameter("jumpPage"));
if(jumpPage==null)
    jumpPage="1";
PageBean pageCtl=contact.listData(jumpPage);
Vector v=pageCtl.getResult();
    int t=(Integer.parseInt(jumpPage)-1)*pageCtl.rowsPerPage;
Enumeration  e=v.elements();
 while(e.hasMoreElements())
{ t++;
 Object[] obj=(Object[])e.nextElement();
%>
              <tr>
                <td><%=t  %> </td>

                <td><%=(String) obj[1]%> </td>
                <td><%=(String) obj[2]%> </td>

                <td><%  jumpPage=pageCtl.curPage+"";
                        out.println("<a href=deletesuccess.jsp?account="+(String)obj[0]+"&jumpPage="+jumpPage+">删除</a >");
                        %>
                </td>
              </tr>
              <%} %>
            </TBODY>
          </TABLE>
           <div class="cont-info-rember">
  <div class="hd">
          <form name="PageForm"  action="changenews.jsp" method="post">
           <div style="float:left; width:auto">
              每页<%=pageCtl.rowsPerPage%>行
              共<%=pageCtl.maxRowCount%>  行
              第<%=pageCtl.curPage%>   页
              共<%=pageCtl.maxPage%>  页
            </div>
            <div style="float:right; width:auto">
              <%if (pageCtl.curPage == 1) {
            out.print(" 首页 上一页");
        } else {%>
                  <A href="changenews.jsp?jumpPage=1">首页</A>
                  <A href="changenews.jsp?jumpPage=<%=pageCtl.curPage - 1%>">上一页</A>
                  <%}%>

                  <%if (pageCtl.curPage >= pageCtl.maxPage) {
            out.print("下一页 尾页");
        } else {%>
                  <A HREF="changenews.jsp?jumpPage=<%=pageCtl.curPage + 1%>">下一页</A>
                  <A HREF="changenews.jsp?jumpPage=<%=pageCtl.maxPage%>">尾页</A>
                  <%}%>
                  转到第<SELECT name="jumpPage">
                      <% for (int i = 1; i <= pageCtl.maxPage; i++) {
            if (i == pageCtl.curPage) {
                      %>
                      <OPTION selected value=<%=i%>><%=i%></OPTION>
                      <%} else {%>
                      <OPTION value=<%=i%>><%=i%></OPTION>
                      <%
            }
        }%>
                  </SELECT>页
              <input type="image" src="../images/nextpage.jpg"></div>
          </form>
          </div>
          </div>
        </DIV>
      </DIV>
    </DIV>
  </DIV>
</DIV>

</body>
    <td background="images/mail_rightbg.gif">&nbsp;</td>
  </tr>
  <tr>
    <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17" height="17" /></td>
    <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
    <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16" height="17" /></td>
  </tr>
</table>
</body>
</html>
