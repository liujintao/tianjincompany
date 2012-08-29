<%-- 
    Document   : login_error
    Created on : 2010-12-21, 9:28:27
    Author     : liujintao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登录失败</title>
    </head>
    <body>
        <%
    // 用户未登陆，提示用户登陆，并跳转
   response.setHeader("refresh","4;URL=login.jsp") ;
%>
    您还未登陆，请先登陆！！！<br>
    四秒后自动跳转到登陆窗口！！！<br>
    如果没有跳转，请按<a href="login.jsp">这里</a>！！！<br>
    </body>
</html>
