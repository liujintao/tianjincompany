/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author xiao
 */
public class InsertUserForm extends ActionForm {

    private String insertaccount;
    private String insertpassword;
    private String phone;

    public InsertUserForm() {
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
      //  if (getAccount() == null || getAccount().length() < 1) {
      //      errors.add("account", new ActionMessage("error.accout.required"));
            // TODO: add 'error.name.required' key to your resources
     //   }
       // else if(getPassword()==null||getAccount().length()<1)
       //     errors.add("password",new ActionMessage("error.password.required"));
        return errors;
    }


    public void reset(ActionMapping mapping, HttpServletRequest request) {
        insertaccount=null;
        insertpassword=null;
        phone=null;
    }


    /**
     * @return the account
     */
    public String getInsertAccount() {
        return insertaccount;
    }

    /**
     * @param account the account to set
     */
    public void setInsertAccount(String insertaccount) {
        this.insertaccount = insertaccount;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return insertpassword;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String insertpassword) {
        this.insertpassword = insertpassword;
    }

    /**
     * @return the type
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param type the type to set
     */
    public void setPhone(String type) {
        this.phone = phone;
    }

}
