/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Content;

import java.sql.ResultSet;

import Link.Link;

public class NewsContent {


	private String showstr;
	public String getShowstr() {
		return showstr;
	}
	public void setShowstr(String add,String id) throws Exception {
		this.showstr = this.show(add, id);
	}
	public NewsContent(){
    	
    }
	private String show(String add,String id) throws Exception{
		Link link=new Link();
		String sql="select * from "+add+" where id="+id;
        ResultSet rst=link.select(sql);
    rst.next();
   	String str="<h2 align=center>";
   	str=str+rst.getObject(add+"title")+"</h2><hr>";
   	str=str+rst.getObject(add+"content")+"<p>";
	return str;
	}
}

