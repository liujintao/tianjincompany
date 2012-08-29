/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import com.myapp.bean.UploadContactBean;
import com.myapp.form.UploadForm;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author liujintao
 */
public class ChanpinUploadAction extends org.apache.struts.action.Action {
    
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
        UploadForm uaf=(UploadForm)form;
        UploadContactBean a=new UploadContactBean();
          String chanpintitle = (String) request.getSession().getAttribute("chanpintitle");
          String chanpincontent = (String) request.getSession().getAttribute("chanpincontent");
          String type = (String) request.getSession().getAttribute("type");
       FormFile myFile=uaf.getMyfile();
       if (myFile !=null & a!=null){
           System.out.println(myFile.getFileName());
           String path=System.getProperty("user.dir")+"\\upload\\"+type;
         FileOutputStream fos=new FileOutputStream(path+"\\"+a.ChanpinContactBean(chanpintitle,chanpincontent,type) + ".jpg");

           fos.write(myFile.getFileData());
           fos.flush();
           fos.close();
       }
         return mapping.findForward(SUCCESS);
    }
}
