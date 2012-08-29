/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Content;
import Link.Link;
import java.sql.*;
public class Content {
    private String showstr;
	public String getShowstr() {
		return showstr;
	}
	public void setShowstr(String add,String id) throws Exception {
		this.showstr = this.show(add, id);
	}
	public Content(){

    }
	private String show(String add,String id) throws Exception{
		Link link=new Link();
		String sql="select * from "+add+" where id="+id;
        ResultSet rst=link.select(sql);
    rst.next();
   	String str="<h2>名称 ：";
   	str=str+rst.getObject(add+"title")+"</h2><hr>";
   	str=str+"<img src=\"C:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\upload\\"+add+"\\"+id+".jpg\" style=\"width:200px;height:200px;\" align=right vspace=10 hspace=20>";
   	str=str+rst.getObject(add+"content")+"<p>";
	return str;
	}
}