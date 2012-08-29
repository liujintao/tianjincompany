/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.bean.InsertUserBean;
import com.myapp.form.InsertUserForm;
import com.myapp.form.UserForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author liujintao
 */
public class UserAction extends org.apache.struts.action.Action {
    
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
          UserForm f=(UserForm)form;
              InsertUserBean service=new InsertUserBean();
              service.InsertUser(f.getInsertaccount(),f.getInsertpassword(),f.getPhone());
              // service.InsertUser("ad","asd","232");
             //   return mapping.findForward(loginY);
          //  f.getAccount();




    //int id =service.login("23", "123");


//           request.setCharacterEncoding("utf-8");
//           String account = request.getParameter("insertaccount");
//           String password = request.getParameter("insertpassword1");
//           String phone=request.getParameter("phone");

       //    service.InsertUser(account,password,phone);
        
        return mapping.findForward(SUCCESS);
    }
}
