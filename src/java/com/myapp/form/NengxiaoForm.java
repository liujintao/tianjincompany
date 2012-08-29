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
public class NengxiaoForm extends org.apache.struts.action.ActionForm {
    
    private String nengxiaotitle;
    private String nengxiaocontent;

   

    /**
     *
     */
    public NengxiaoForm() {
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
     * @return the nengxiaotitle
     */
    public String getNengxiaotitle() {
        return nengxiaotitle;
    }

    /**
     * @param nengxiaotitle the nengxiaotitle to set
     */
    public void setNengxiaotitle(String nengxiaotitle) {
        this.nengxiaotitle = nengxiaotitle;
    }

    /**
     * @return the nengxiaocontent
     */
    public String getNengxiaocontent() {
        return nengxiaocontent;
    }

    /**
     * @param nengxiaocontent the nengxiaocontent to set
     */
    public void setNengxiaocontent(String nengxiaocontent) {
        this.nengxiaocontent = nengxiaocontent;
    }
}
