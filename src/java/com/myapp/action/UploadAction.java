/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.myapp.form.UploadForm;

import java.io.FileOutputStream;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author liujintao
 */
public class UploadAction extends org.apache.struts.action.Action {
    
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
       FormFile myFile=uaf.getMyfile();
       if (myFile !=null){
           //System.out.println("fileName"+myFile.getFileName());
          // System.out.println(myFile.getFileName());
           FileOutputStream fos=new FileOutputStream("c:\\"+myFile.getFileName());
           fos.write(myFile.getFileData());
           fos.flush();
           fos.close();

       }
        
        return mapping.findForward(SUCCESS);
    }
}
