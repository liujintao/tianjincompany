/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.bean.InsertUserBean;
import com.myapp.form.JianqieForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author liujintao
 */
public class JianqieAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession b=request.getSession();
       
                
         JianqieForm f=(JianqieForm)form;
            InsertUserBean service=new InsertUserBean();
        service.InsertJianqie(f.getJianqietitle(),f.getJianqiecontent());
        System.out.println(0);
       // request.setAttribute("jianqietitle", f.getJianqietitle());
       // request.setAttribute("jianqiecontent", f.getJianqiecontent());
         b.setAttribute("jianqietitle",f);

        return mapping.findForward(SUCCESS);
    }
}
