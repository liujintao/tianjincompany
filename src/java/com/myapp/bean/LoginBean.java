/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.bean;
import java.sql.*;
/**
 *
 * @author liujintao
 */
public class LoginBean {
     private Connection con;
     private String Str;

    public LoginBean() throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
        this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/company","root","root");

    }
    public int login(String account,String password)throws Exception
    {
        Statement stmt=con.createStatement();
        Str="select * from user where account='"+account+"' and password='"+password+"';";
           // Str="select * from teacher where account='"+account+"' and password='"+password+"'and type='"+"命题老师';";
            //Str="select * from "+type+" where account='"+account+"' and password='"+password+"';";
        ResultSet rst=stmt.executeQuery(Str);
        if(rst.next())
            return rst.getInt(1);
        else
            return 0;

    }


}
