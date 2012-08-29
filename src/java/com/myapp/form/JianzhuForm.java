/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author liujintao
 */
public class JianzhuForm extends org.apache.struts.action.ActionForm {
    
    private String jianzhutitle;
    private String jianzhucontent;
   // private int number;

    /**
     * @return
     */
    public String getJianzhuTitle() {
        return jianzhutitle;
    }

    /**
     * @param string
     */
    public void setJianzhuTitle(String string) {
        jianzhutitle = string;
    }

    /**
     * @return
     */
    public String getJianzhuContent() {
        return jianzhucontent;
    }

    /**
     * @param i
     */
    public void setJianzhuContent(String string) {
        jianzhucontent = string;
    }

    /**
     *
     */
    public JianzhuForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
}
