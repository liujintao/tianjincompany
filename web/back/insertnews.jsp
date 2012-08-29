<%-- 
    Document   : insertnews
    Created on : 2010-12-24, 10:35:53
    Author     : liujintao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="insertnews" action="insertnews.do" method="POST">
            新闻标题：<input type="text" name="newstitle" value="" />
            新闻内容：<textarea name="newscontent" rows="4" cols="20">
            </textarea>
            <input type="submit" value="提交"  />
        </form>
    </body>
</html>
