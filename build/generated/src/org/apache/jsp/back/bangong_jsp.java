package org.apache.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bangong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<script language=\"javascript\">\n");
      out.write("\n");
      out.write("function send()//检查表单是否填写完整\n");
      out.write("{\n");
      out.write("\n");
      out.write("var obj = document.bangong.bangongtitle;\n");
      out.write("var obj1 = document.bangong.bangongcontent;\n");
      out.write("//var obj2 = document.insertuser.insertpassword2;\n");
      out.write("            if (obj.value.length==0)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                obj.focus();\n");
      out.write("                alert(\"请输用产品名！\");\n");
      out.write("                return false;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("else if(obj1.value==0){\n");
      out.write("\n");
      out.write("                obj.focus();\n");
      out.write("                alert(\"请输入产品信息！\");\n");
      out.write("                return false;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("<link href=\"images/skin.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-top: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("\tbackground-color: #EEF2FB;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"17\" valign=\"top\" background=\"images/mail_leftbg.gif\"><img src=\"images/left-top-right.gif\" width=\"17\" height=\"29\" /></td>\n");
      out.write("    <td valign=\"top\" background=\"images/content-bg.gif\">\n");
      out.write("        <table width=\"100%\" height=\"31\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"left_topbg\" id=\"table2\">\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"31\"><div class=\"titlebt\">剪切机产品</div></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td width=\"16\" valign=\"top\" background=\"images/mail_rightbg.gif\"><img src=\"images/nav-right-bg.gif\" width=\"16\" height=\"29\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td valign=\"middle\" background=\"images/mail_leftbg.gif\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\" bgcolor=\"#F7F8F9\">\n");
      out.write("        <h1>产品信息发布 第一步</h1>\n");
      out.write("        <form name=\"bangong\" action=\"bangong.do\" method=\"POST\" onsubmit=\"return send()\">\n");
      out.write("            产品名：<input type=\"text\" name=\"bangongtitle\" value=\"\" />\n");
      out.write("            产品信息：<textarea name=\"bangongcontent\" rows=\"4\" cols=\"20\">\n");
      out.write("            </textarea>\n");
      out.write("            <input type=\"submit\" value=\"提交\" />\n");
      out.write("        </form>\n");
      out.write("        ");


        //   response.sendRedirect("jianqieupload.jsp");
           
      out.write("\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("    <p>&nbsp;</p></td>\n");
      out.write("    <td background=\"images/mail_rightbg.gif\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td valign=\"bottom\" background=\"images/mail_leftbg.gif\"><img src=\"images/buttom_left2.gif\" width=\"17\" height=\"17\" /></td>\n");
      out.write("    <td background=\"images/buttom_bgs.gif\"><img src=\"images/buttom_bgs.gif\" width=\"17\" height=\"17\"></td>\n");
      out.write("    <td valign=\"bottom\" background=\"images/mail_rightbg.gif\"><img src=\"images/buttom_right2.gif\" width=\"16\" height=\"17\" /></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
