<%-- 
    Document   : login
    Created on : 2010-12-21, 9:20:42
    Author     : liujintao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
 <script language="javascript">
<!--
function send()//检查表单是否填写完整
{

var obj = document.form_login.account;
//var obj1 = document.form_login.type;
var obj2 = document.form_login.password;
            if (obj.value.length==0)
            {

                obj.focus();
                alert("请输您的用户名和密码！");
                return false;

            }
else if(obj2.value==0){

                obj.focus();
                alert("请输入您的密码！");
                return false;

            }


}

//-->
</script>
    </head>
    <body>
        
        <form action="login.do" name="form_login" method="post" onSubmit="return send()">
            用户名:<input type="textfield" name="account" id="account" value="" /> <br/>
            密码:<input type="password" name="password" id="password" value="" /><br/>
            <input type="submit" value="提交"/>
</form>
    </body>
</html>
