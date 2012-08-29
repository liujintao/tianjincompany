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
public class JichangForm extends org.apache.struts.action.ActionForm {
    
    private String jichangtitle;
    private String jichangcontent;

   
    /**
     *
     */
    public JichangForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
//        if (getName() == null || getName().length() < 1) {
//            errors.add("name", new ActionMessage("error.name.required"));
//            // TODO: add 'error.name.required' key to your resources
//        }
        return errors;
    }

    /**
     * @return the jichangtitle
     */
    public String getJichangtitle() {
        return jichangtitle;
    }

    /**
     * @param jichangtitle the jichangtitle to set
     */
    public void setJichangtitle(String jichangtitle) {
        this.jichangtitle = jichangtitle;
    }

    /**
     * @return the jichangcontent
     */
    public String getJichangcontent() {
        return jichangcontent;
    }

    /**
     * @param jichangcontent the jichangcontent to set
     */
    public void setJichangcontent(String jichangcontent) {
        this.jichangcontent = jichangcontent;
    }
}
