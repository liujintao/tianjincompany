/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.filter;

/**
 *
 * @author liujintao
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class filter implements Filter{

 	protected FilterConfig filterConfig;
	private String encoding = "UTF-8";

	public void init(FilterConfig filterConfig) throws ServletException {
//		this.filterConfig = filterConfig;
		//本过滤器默认编码是UTF-8，但也可以在web.xml配置文件里设置自己需要的编码
	//	if(filterConfig.getInitParameter("encoding") != null)
	//		encoding = filterConfig.getInitParameter("encoding");
	}

  public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        chain.doFilter(request,response);

    }

	public void destroy() {
	//	this.encoding = null;
	}

}




//public class filter {
//
//}
