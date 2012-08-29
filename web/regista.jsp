<%@ page language="java" contentType="text/html;charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册新用户</title>
</head>

  <script type="text/javascript">
    function CheckForm()
{
	if (document.form1.name.value.length == 0) {
		alert("请输入您的姓名.");
		document.form1.name.focus();
		return false;
	}
	if (document.form1.telephone.value.length == 0) {
		alert("请输入您的联系电话.");
		document.form1.telephone.focus();
		return false;
	}
	if (document.form1.email.value.length == 0) {
		alert("请输入您的邮箱地址.");
		document.form1.email.focus();
		return false;
	}
	if (document.form1.title.value.length == 0) {
		alert("请输入留言标题.");
		document.form1.title.focus();
		return false;
	}
	if (document.form1.content.value.length == 0) {
		alert("请输入留言内容.");
		document.form1.content.focus();
		return false;
	}
	
	return true;
}
</script>

<body>
  <form action="/bbs/regist" name="form1" method="post"  onSubmit="return CheckForm();" >
   <table width="550">
    		<tr>
    			<td colspan="4"><font color="#CC6600">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 欢迎您光临！为了进一步改善公司的各项服务，  
                  加强与广大客户之间的交流， 我们希望了解各位朋友对我公司的评价、期望、意见和建议提供给我们。我们将会报以更优质的服务。谢谢您的支持和协助。</font></td>
    		</tr>
    		<tr>
    			<td id="title">姓名:</td>
    			<td><input type="text" name="name" size="10"/><input type="radio" value="先生" name="sex"/>先生<input type="radio" value="小姐" name="sex"/>小姐</td>
    			<td id="title">公司:</td>
    			<td><input type="text" name="company"/></td>
    		</tr>
    		<tr>
    			<td id="title">电话:</td>
    			<td><input type="text" name="telephone"/></td>
    			<td id="title">传真:</td>
    			<td><input type="text" name="fox"/></td>
    		</tr>
    		<tr>
    			<td id="title">邮箱:</td>
    			<td><input type="text" name="email"/></td>
    			<td id="title">地址:</td>
    			<td><input type="text" name="address"/></td>
    		</tr>
    		<tr>
    			<td id="title">标题:</td>
    			<td colspan="3"><input type="text" name="title"/></td>
    		</tr>
    		<tr>
    			<td id="title">内容:</td>
    			<td colspan="3"><textarea rows="10" cols="30" name="content"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td colspan="4" style="text-align: center"><input type=submit value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/></td>
    		</tr>
    	</table></form>
</body>
</html>