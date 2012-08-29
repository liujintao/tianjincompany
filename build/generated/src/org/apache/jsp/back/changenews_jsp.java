package org.apache.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.myapp.bean.*;
import java.util.*;

public final class changenews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
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
      out.write("        <td height=\"31\"><div class=\"titlebt\">修改</div></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td width=\"16\" valign=\"top\" background=\"images/mail_rightbg.gif\"><img src=\"images/nav-right-bg.gif\" width=\"16\" height=\"29\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td valign=\"middle\" background=\"images/mail_leftbg.gif\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\" bgcolor=\"#F7F8F9\">\n");
      out.write("        <body style=\"background-color:#ffffff;\">\n");
      out.write("<DIV class=mcont>\n");
      out.write("  <DIV class=main-cont>\n");
      out.write("    <DIV class=cont-info>\n");
      out.write("      <H1>已经添加的新闻：</H1>\n");
      out.write("      <DIV class=cont-info-rember>\n");
      out.write("        <DIV class=finish-area>\n");
      out.write("          <TABLE border=0 cellSpacing=0 cellPadding=0>\n");
      out.write("            <TBODY>\n");
      out.write("              <tr>\n");
      out.write("                <td>序号</td>\n");
      out.write("                <td>新闻标题</td>\n");
      out.write("                <td>新闻内容</td>\n");
      out.write("\n");
      out.write("                <td>删除</td>\n");
      out.write("              </tr>\n");
      out.write("                  ");

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

      out.write("\n");
      out.write("              <tr>\n");
      out.write("                <td>");
      out.print(t  );
      out.write(" </td>\n");
      out.write("\n");
      out.write("                <td>");
      out.print((String) obj[1]);
      out.write(" </td>\n");
      out.write("                <td>");
      out.print((String) obj[2]);
      out.write(" </td>\n");
      out.write("\n");
      out.write("                <td>");
  jumpPage=pageCtl.curPage+"";
                        out.println("<a href=deletesuccess.jsp?account="+(String)obj[0]+"&jumpPage="+jumpPage+">删除</a >");
                        
      out.write("\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              ");
} 
      out.write("\n");
      out.write("            </TBODY>\n");
      out.write("          </TABLE>\n");
      out.write("           <div class=\"cont-info-rember\">\n");
      out.write("  <div class=\"hd\">\n");
      out.write("          <form name=\"PageForm\"  action=\"changenews.jsp\" method=\"post\">\n");
      out.write("           <div style=\"float:left; width:auto\">\n");
      out.write("              每页");
      out.print(pageCtl.rowsPerPage);
      out.write("行\n");
      out.write("              共");
      out.print(pageCtl.maxRowCount);
      out.write("  行\n");
      out.write("              第");
      out.print(pageCtl.curPage);
      out.write("   页\n");
      out.write("              共");
      out.print(pageCtl.maxPage);
      out.write("  页\n");
      out.write("            </div>\n");
      out.write("            <div style=\"float:right; width:auto\">\n");
      out.write("              ");
if (pageCtl.curPage == 1) {
            out.print(" 首页 上一页");
        } else {
      out.write("\n");
      out.write("                  <A href=\"changenews.jsp?jumpPage=1\">首页</A>\n");
      out.write("                  <A href=\"changenews.jsp?jumpPage=");
      out.print(pageCtl.curPage - 1);
      out.write("\">上一页</A>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("\n");
      out.write("                  ");
if (pageCtl.curPage >= pageCtl.maxPage) {
            out.print("下一页 尾页");
        } else {
      out.write("\n");
      out.write("                  <A HREF=\"changenews.jsp?jumpPage=");
      out.print(pageCtl.curPage + 1);
      out.write("\">下一页</A>\n");
      out.write("                  <A HREF=\"changenews.jsp?jumpPage=");
      out.print(pageCtl.maxPage);
      out.write("\">尾页</A>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("                  转到第<SELECT name=\"jumpPage\">\n");
      out.write("                      ");
 for (int i = 1; i <= pageCtl.maxPage; i++) {
            if (i == pageCtl.curPage) {
                      
      out.write("\n");
      out.write("                      <OPTION selected value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</OPTION>\n");
      out.write("                      ");
} else {
      out.write("\n");
      out.write("                      <OPTION value=");
      out.print(i);
      out.write('>');
      out.print(i);
      out.write("</OPTION>\n");
      out.write("                      ");

            }
        }
      out.write("\n");
      out.write("                  </SELECT>页\n");
      out.write("              <input type=\"image\" src=\"../images/nextpage.jpg\"></div>\n");
      out.write("          </form>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </DIV>\n");
      out.write("      </DIV>\n");
      out.write("    </DIV>\n");
      out.write("  </DIV>\n");
      out.write("</DIV>\n");
      out.write("\n");
      out.write("</body>\n");
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
