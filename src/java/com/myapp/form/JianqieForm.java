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
public class JianqieForm extends org.apache.struts.action.ActionForm {
    
    private String jianqietitle;

    private String jianqiecontent;

    /**
     * @return
     */
  

    /**
     *
     */
    public JianqieForm() {
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
     * @return the jianqietitle
     */
    public String getJianqietitle() {
        return jianqietitle;
    }

    /**
     * @param jianqietitle the jianqietitle to set
     */
    public void setJianqietitle(String jianqietitle) {
        this.jianqietitle = jianqietitle;
    }

    /**
     * @return the jianqiecontent
     */
    public String getJianqiecontent() {
        return jianqiecontent;
    }

    /**
     * @param jianqiecontent the jianqiecontent to set
     */
    public void setJianqiecontent(String jianqiecontent) {
        this.jianqiecontent = jianqiecontent;
    }
}
