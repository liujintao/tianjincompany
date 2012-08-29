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
public class HaishiForm extends org.apache.struts.action.ActionForm {
    
    private String haishititle;
    private String haishicontent;

   
    /**
     *
     */
    public HaishiForm() {
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
     * @return the haishititle
     */
    public String getHaishititle() {
        return haishititle;
    }

    /**
     * @param haishititle the haishititle to set
     */
    public void setHaishititle(String haishititle) {
        this.haishititle = haishititle;
    }

    /**
     * @return the haishicontent
     */
    public String getHaishicontent() {
        return haishicontent;
    }

    /**
     * @param haishicontent the haishicontent to set
     */
    public void setHaishicontent(String haishicontent) {
        this.haishicontent = haishicontent;
    }
}
