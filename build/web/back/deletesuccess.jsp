<%-- 
    Document   : deletesuccess
    Created on : 2010-12-23, 9:34:39
    Author     : liujintao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="delWorker" class="com.myapp.bean.InsertUserBean" scope="page"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <%   if(delWorker.delete((String)(request.getParameter("account")))==1){ %>
<center>
  <h2  class="STYLE1">删除成功!</h2>
</center>
<% }else{ %>
<center >
  <h2 class="STYLE2"> 删除失败!</h2>
</center>
<% } %>
    </body>
</html>
