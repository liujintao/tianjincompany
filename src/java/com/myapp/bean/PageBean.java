/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.bean;
import java.util.Vector;
public class PageBean
{
	public int curPage ;
	public int maxPage ;
	public int maxRowCount;
	public int rowsPerPage=10;
	public java.util.Vector data;
	public PageBean()
	{

	}
	public void countMaxPage() {
    if (this.maxRowCount % this.rowsPerPage==0){
       this.maxPage = this.maxRowCount/this.rowsPerPage;
    }else{
       this.maxPage = this.maxRowCount/this.rowsPerPage + 1;
        }
    }
    public Vector getResult()
    {
    	return this.data;
    }

    public PageBean(ContactBean contact)throws Exception
    {
    	 this.maxRowCount = contact.getAvailableCount();
   		 this.data = contact.getResult();
    	 this.countMaxPage();
    }
}
