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
public class ChanpinForm extends org.apache.struts.action.ActionForm {
    
    private String chanpintitle;
    private String chanpincontent;

   

    /**
     *
     */
    public ChanpinForm() {
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
 //      }
        return errors;
    }

    /**
     * @return the chanpintitle
     */
    public String getChanpintitle() {
        return chanpintitle;
    }

    /**
     * @param chanpintitle the chanpintitle to set
     */
    public void setChanpintitle(String chanpintitle) {
        this.chanpintitle = chanpintitle;
    }

    /**
     * @return the chanpincontent
     */
    public String getChanpincontent() {
        return chanpincontent;
    }

    /**
     * @param chanpincontent the chanpincontent to set
     */
    public void setChanpincontent(String chanpincontent) {
        this.chanpincontent = chanpincontent;
    }
}
