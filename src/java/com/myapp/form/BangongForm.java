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
public class BangongForm extends org.apache.struts.action.ActionForm {
    
    private String bangongtitle;
    private String bangongcontent;

   

    /**
     *
     */
    public BangongForm() {
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
            // TODO: add 'error.name.required' key to your resources
//        }
        return errors;
    }

    /**
     * @return the bangongtitle
     */
    public String getBangongtitle() {
        return bangongtitle;
    }

    /**
     * @param bangongtitle the bangongtitle to set
     */
    public void setBangongtitle(String bangongtitle) {
        this.bangongtitle = bangongtitle;
    }

    /**
     * @return the bangongcontent
     */
    public String getBangongcontent() {
        return bangongcontent;
    }

    /**
     * @param bangongcontent the bangongcontent to set
     */
    public void setBangongcontent(String bangongcontent) {
        this.bangongcontent = bangongcontent;
    }
}
