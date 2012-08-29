package Title;
import java.sql.*;
import Link.*;
public class Title {
     public Title(){

	}
	private String showstr;
	public String getShowstr() {
		return showstr;
	}
	public void setShowstr(String add,int y) throws Exception {
		this.showstr = this.show(add,y);
	}

   private String show(String add,int y) throws Exception{
	      Fenye ye=new Fenye();
	      ResultSet rst=ye.fen(add, 6, y);
	      String url="\"C:/Program Files/Apache Software Foundation/Tomcat 6.0/upload/"+add+"/";
	      int i=0,j=0;
	      String str="<table align=center cellspacing=50 >";
	      while(rst.next() && j<6){
	    	  if(i==0){

	    		  str=str+"<tr align=center>";
	    	  }

	    	  str=str+"<th>";

	    	  str=str+"<a href=\"content.jsp?id="+rst.getObject("id")+"&add="+add+"\"><img src="+url+rst.getObject("id")+".jpg\"  align=center  style=\"width:150px;height:150px;\" >";

	    	  str=str+" <br clear=all>"+rst.getObject(add+"title")+"</a>";

	    	  str=str+"</th>";
	        	  i++;
	        	  j++;
	        if(i==2){

	        	str=str+"</tr>";
	        	i=0;
	        }

	      }

	      str=str+"</table> <center> ";
	      for(int b=1;b<=ye.yeshu(add,6);b++){
	    	  str=str+"<a href=\"title.jsp?add="+add+"&y="+b+"\"> ["+b+"]</a>     ";
	      }
	      str=str+"</center> ";
	      return str;

   }
}

