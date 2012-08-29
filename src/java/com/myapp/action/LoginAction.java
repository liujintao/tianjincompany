/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.bean.LoginBean;
import com.myapp.form.LoginForm;
import com.myapp.entity.User;

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
    public class LoginAction extends Action {

    /* forward name="success" path="" */
    private final static String ERROR = "error";
     private final static String  loginY="loginY";
      private final static String loginN="loginN";
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
            {
        try{
              //LoginForm f=(LoginForm)form;
            LoginBean service=new LoginBean();
            
              //  return mapping.findForward(loginY);
          //  f.getAccount();




    //int id =service.login("23", "123");
        //int id=service.login(f.getAccount(),f.getPassword());
            String account = request.getParameter("account");
            String password = request.getParameter("password");
            int id=service.login(account,password);
           if(0!=id)
          //  {
             //   User user=new User();
              //  user.setAccount(f.getAccount());
               // user.setType(f.getType());
            //    user.setId(id);
        
             //   request.getSession().setAttribute("login", "yes");
                return mapping.findForward(loginY);
        //    }
            else
                return mapping.findForward(loginN);


        

        }
          
        
        catch(Exception e){
             return mapping.findForward(ERROR);

        }


    }
}


