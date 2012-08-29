package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import entity.BBS;
import java.sql.DriverManager;

public class RegisterDao  {
     private Connection con;
     private String Str;
     public RegisterDao() throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
        this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/company","root","root");

    }
	
	public int insertLeaveMessage(BBS message){
       //  Statement stmt=con.createStatement();
		//Connection connection = getConnection();
		PreparedStatement pstate = null;
		int i = 0;
		try{
			Str = "insert into bbs " +

"(name,sex,company,telephone,fox,email,address,title,content,create_date) values(?,?,?,?,?,?,?,?,?,?)";
			pstate = con.prepareStatement(Str);
			pstate.setString(1, message.getName());
			pstate.setString(2, message.getSex());
			pstate.setString(3, message.getCompany());
			pstate.setString(4, message.getTelephone());
			pstate.setString(5, message.getFox());
			pstate.setString(6, message.getEmail());
			pstate.setString(7, message.getAddress());
			pstate.setString(8, message.getTitle());
			pstate.setString(9, message.getContent());
			pstate.setString(10, null);
			i = pstate.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}

}
