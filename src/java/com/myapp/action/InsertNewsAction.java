/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.form.InsertNewsForm;
import com.myapp.bean.InsertUserBean;

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
public class InsertNewsAction extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
   // private final static String SUCCESS = "success";
        private final static String ERROR = "error";
     private final static String  loginY="loginY";
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
              try{
          request.setCharacterEncoding("utf-8");
          response.setCharacterEncoding("utf-8");
          InsertNewsForm f=(InsertNewsForm)form;
            InsertUserBean service=new InsertUserBean();
           // String newstitle = request.getParameter("newstitle");
            //String newscontent = request.getParameter("newscontent");
          //   service.InsertNews(newstitle,newscontent);
        service.InsertNews(f.getNewstitle(),f.getNewscontent());

        return mapping.findForward(loginY);
    }
      catch(Exception e){
             return mapping.findForward(ERROR);//zhixingde zhege

        }


    }
}
