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
public class ShuiForm extends org.apache.struts.action.ActionForm {
    
    private String shuititle;
    private String shuicontent;

    //private int number;

  
    /**
     *
     */
    public ShuiForm() {
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
  //      if (getName() == null || getName().length() < 1) {
     //       errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
     //   }
        return errors;
    }

    /**
     * @return the shuititle
     */
    public String getShuititle() {
        return shuititle;
    }

    /**
     * @param shuititle the shuititle to set
     */
    public void setShuititle(String shuititle) {
        this.shuititle = shuititle;
    }

    /**
     * @return the shuicontent
     */
    public String getShuicontent() {
        return shuicontent;
    }

    /**
     * @param shuicontent the shuicontent to set
     */
    public void setShuicontent(String shuicontent) {
        this.shuicontent = shuicontent;
    }
}
