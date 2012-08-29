/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Link;

import java.sql.*;

public class Link {

	 private Connection con;
	 private Statement stmt;
	public Link() throws Exception
	 {

		    Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/company","root","root");
		    stmt=con.createStatement();
	 }

	public void addsql(String sql)throws Exception
	{
	     stmt.executeUpdate(sql);
	}
	  public ResultSet select(String sql) throws Exception
	  {
		  return stmt.executeQuery(sql);
	  }

}

