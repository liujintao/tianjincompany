/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.form.JianqieUploadForm;
import com.myapp.form.JianqieForm;
import com.myapp.bean.InsertUserBean;
import com.myapp.bean.UploadContactBean;

import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author liujintao
 */
public class JianqieUploadAction extends org.apache.struts.action.Action {
    
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
        JianqieUploadForm uaf=(JianqieUploadForm)form;
        //UploadJianqieForm f=(UploadJianqieForm)form;
        UploadContactBean a=new UploadContactBean();
        //JianqieForm f=(JianqieForm) form;
          String jianqietitle = (String) request.getSession().getAttribute("jianqietitle");
           String jianqiecontent = (String) request.getSession().getAttribute("jianqiecontent");
        //   HttpSession b=request.getSession();
     //      Object o = b.getAttribute("jianqietitle");


      //     System.out.println(jianqietitle);
         //  String phone=request.getParameter("phone");
       FormFile myFile=uaf.getMyfile();
       if (myFile !=null & a!=null){
           //System.out.println("fileName"+myFile.getFileName());
           System.out.println(myFile.getFileName());
           //System.out.println(a.JianqieContactBean(jianqietitle,jianqiecontent));
         //  System.out.println("jianqietitle");
           String path=System.getProperty("user.dir")+"\\upload\\jianqie";
          FileOutputStream fos=new FileOutputStream(path+"\\"+a.JianqieContactBean(jianqietitle,jianqiecontent) + ".jpg");
//          FileOutputStream fos=new FileOutputStream("c:\\"+myFile.getFileName());
//
           fos.write(myFile.getFileData());
           fos.flush();
           fos.close();
      }  
        
        return mapping.findForward(SUCCESS);
    }
    
//
// public static void main(String args[]){
//        try{
//             JianqieUploadAction uc = new JianqieUploadAction();
////       String str = uc.JianqieContactBean("gg","ggh");
////       System.out.println(str);
//            // String str = uc.
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
}