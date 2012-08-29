<%-- 
    Document   : nengxiao
    Created on : 2010-12-25, 22:19:50
    Author     : liujintao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.io.*,java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="javascript">

function send()//检查表单是否填写完整
{

var obj = document.nengxiao.nengxiaotitle;
var obj1 = document.nengxiao.nengxiaocontent;
//var obj2 = document.insertuser.insertpassword2;
            if (obj.value.length==0)
            {

                obj.focus();
                alert("请输用产品名！");
                return false;

            }
else if(obj1.value==0){

                obj.focus();
                alert("请输入产品信息！");
                return false;

            }


}
//-->
</script>
<link href="images/skin.css" rel="stylesheet" type="text/css" />
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
    <% request.setCharacterEncoding("utf-8"); %>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif">
        <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">能效信息</div></td>
      </tr>
    </table></td>
    <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" /></td>
  </tr>
  <tr>
    <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
    <td valign="top" bgcolor="#F7F8F9">
        <h1>产品信息发布 第一步</h1>
        <form name="nengxiao" action="nengxiao.do" method="POST" onsubmit="return send()">
            产品名：<input type="text" name="nengxiaotitle" value="" />
            产品简述：<textarea name="nengxiaocontent" rows="20" cols="30">
            </textarea>
            <input type="submit" value="提交" />
        </form>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p></td>
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
