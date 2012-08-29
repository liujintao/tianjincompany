/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

/**
 *
 * @author liujintao
 */
import com.myapp.bean.InsertUserBean;
import com.myapp.form.InsertUserForm;
//import com.myapp.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java.io.*;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
public class InsertUserAction extends Action{
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
              InsertUserForm f=(InsertUserForm)form;
              InsertUserBean service=new InsertUserBean();
             // service.InsertUser(f.getInsertAccount(),f.getPassword(),f.getPhone());
              // service.InsertUser("ad","asd","232");
             //   return mapping.findForward(loginY);
          //  f.getAccount();




    //int id =service.login("23", "123");


           request.setCharacterEncoding("utf-8");
           String account = request.getParameter("insertaccount");
           String password = request.getParameter("insertpassword1");
           String phone=request.getParameter("phone");
           
            service.InsertUser(account,password,phone);
            //System.out.println("account");
            //int id=service.login("12","12","2");
          // int id=service.InsertUserBean(account,password,phone);
        //  if(0!=id)
          //  {
             //   User user=new User();
              //  user.setAccount(f.getAccount());
               // user.setType(f.getType());
            //    user.setId(id);

             //   request.getSession().setAttribute("login", "yes");
          //    return mapping.findForward(loginN);
        //    }
       //  else
               return mapping.findForward(loginY);




        }


        catch(Exception e){
             return mapping.findForward(ERROR);//zhixingde zhege

        }


    }


}
