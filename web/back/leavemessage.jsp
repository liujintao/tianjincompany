<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="dao.RegisterDao"%>
<%@page import="entity.BBS" %>
<%@page import="java.util.*"%>
<%request.setCharacterEncoding("UTF-8");%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<script language="javascript">

function send()//检查表单是否填写完整
{

var obj = document.qiezhi.myfile;
//var obj1 = document.yiliao.yiliaocontent;
//var obj2 = document.insertuser.insertpassword2;
            if (obj.value.length==0)
            {

                obj.focus();
                alert("请上传照片！");
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
<base href="<%=basePath%>"/>
    </head>
    <body>
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
     <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
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
  <tr>
    <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17" height="17" /></td>
    <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
    <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16" height="17" /></td>
  </tr>
</table>
</body>
</html>