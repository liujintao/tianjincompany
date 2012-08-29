package Title;
import java.sql.*;
import Link.*;
public class NewsTitle {
     public NewsTitle(){

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
	      ResultSet rst=ye.fen(add, 8, y);
	      int i=0,j=0;
	      String str="<table align=left>";
	      while(rst.next() && j<6){


	    		  str=str+"<tr align=center>";


	    	  str=str+"<th>";

	    	  str=str+"<a href=\"newscontent.jsp?id="+rst.getObject("id")+"&add="+add+"\">";

	    	  str=str+rst.getObject(add+"title")+"</a>";

	    	  str=str+"</th>";
	        	  j++;

	        	str=str+"</tr>";


	      }

	      str=str+"</table> <br clear=all> <center> ";
	      for(int b=1;b<=ye.yeshu(add,8);b++){
	    	  str=str+"<a href=\"title.jsp?add="+add+"&y="+b+"\"> ["+b+"]</a>     ";
	      }
	      str=str+"</center> ";
	      return str;

   }
}

