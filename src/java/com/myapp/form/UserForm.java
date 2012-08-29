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
public class UserForm extends org.apache.struts.action.ActionForm {
    
    private String insertaccount;
    private String insertpassword;
    private String phone;

  

    /**
     *
     */
    public UserForm() {
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
     * @return the insertaccount
     */
    public String getInsertaccount() {
        return insertaccount;
    }

    /**
     * @param insertaccount the insertaccount to set
     */
    public void setInsertaccount(String insertaccount) {
        this.insertaccount = insertaccount;
    }

    /**
     * @return the insertpassword
     */
    public String getInsertpassword() {
        return insertpassword;
    }

    /**
     * @param insertpassword the insertpassword to set
     */
    public void setInsertpassword(String insertpassword) {
        this.insertpassword = insertpassword;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
