/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Link;
import java.sql.*;

public class Fenye {
	public Fenye(){

	}
    public int rows(String add)throws Exception{
        Link link=new Link();
        int i=1;
	      String sql="select * from "+add+" order by id  DESC";
	      ResultSet rst=link.select(sql);
          while(rst.next()){
              i++;
          }
          return i;
    }
	public int yeshu(String add,int i) throws Exception{
        if(this.rows(add)>i){
	       return (1+(this.rows(add)/i));
        }
        else return 0;
	}
	 public ResultSet fen(String add,int i,int y) throws Exception{
		 Link link=new Link();
	      String sql="select * from "+add+" order by id  DESC";
	      ResultSet rst=link.select(sql);
	    	  for(int j=i;j<y*i;j++){
	    		  rst.next();
	      }
	      return rst;
	 }


}