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
public class YiliaoForm extends org.apache.struts.action.ActionForm {
    
    private String yiliaotitle;
    private String yiliaocontent;

  
    /**
     *
     */
    public YiliaoForm() {
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
     * @return the yiliaotitle
     */
    public String getYiliaotitle() {
        return yiliaotitle;
    }

    /**
     * @param yiliaotitle the yiliaotitle to set
     */
    public void setYiliaotitle(String yiliaotitle) {
        this.yiliaotitle = yiliaotitle;
    }

    /**
     * @return the yiliaocontent
     */
    public String getYiliaocontent() {
        return yiliaocontent;
    }

    /**
     * @param yiliaocontent the yiliaocontent to set
     */
    public void setYiliaocontent(String yiliaocontent) {
        this.yiliaocontent = yiliaocontent;
    }
}
