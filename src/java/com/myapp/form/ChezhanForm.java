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
public class ChezhanForm extends org.apache.struts.action.ActionForm {
    
    private String chezhantitle;
    private String chezhancontent;

   
    /**
     *
     */
    public ChezhanForm() {
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
     * @return the chezhantitle
     */
    public String getChezhantitle() {
        return chezhantitle;
    }

    /**
     * @param chezhantitle the chezhantitle to set
     */
    public void setChezhantitle(String chezhantitle) {
        this.chezhantitle = chezhantitle;
    }

    /**
     * @return the chezhancontent
     */
    public String getChezhancontent() {
        return chezhancontent;
    }

    /**
     * @param chezhancontent the chezhancontent to set
     */
    public void setChezhancontent(String chezhancontent) {
        this.chezhancontent = chezhancontent;
    }
}
