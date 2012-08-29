/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.bean;
import java.util.*;
import java.sql.*;
import sun.security.action.GetIntegerAction;

/**
 *
 * @author liujintao
 */
public class UploadContactBean {
     private Connection con;
     private String Str;
     Vector v;
     public UploadContactBean()throws Exception
	{
		 Class.forName("org.gjt.mm.mysql.Driver");
        this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/company", "root", "root");
		v=new Vector();
	}
public String JianqieContactBean  (String jianqietitle, String jianqiecontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from jianqie where jianqietitle= '"+jianqietitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String BangongContactBean  (String bangongtitle, String bangongcontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from bangong where bangongtitle= '"+bangongtitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String NengxiaoContactBean  (String nengxiaotitle, String nengxiaocontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from nengxiao where nengxiaotitle= '"+nengxiaotitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String HaishiContactBean  (String haishititle, String haishicontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from haishi where haishititle= '"+haishititle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String ShuiContactBean  (String shuititle, String shuicontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from shui where shuititle= '"+shuititle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String YiliaoContactBean  (String yiliaotitle, String yiliaocontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from yiliao where yiliaotitle= '"+yiliaotitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String ChezhanContactBean  (String chezhantitle, String chezhancontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from chezhan where chezhantitle= '"+chezhantitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String JichangContactBean  (String jichangtitle, String jichangcontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from jichang where jichangtitle= '"+jichangtitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String JianzhuContactBean  (String jianzhutitle, String jianzhucontent) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
     Str = "select * from jianzhu where jianzhutitle= '"+jianzhutitle+"';";
                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
public String ChanpinContactBean  (String chanpintitle, String chanpincontent,String type) throws Exception
//public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
{
     Statement stmt=con.createStatement();
    if(type.equals("zhileng"))
           Str = "select * from zhileng where zhilengtitle= '"+chanpintitle+"';";
    else if (type.equals("zidonghua"))
           Str = "select * from zidonghua where zidonghuatitle= '"+chanpintitle+"';";
        else if (type.equals("jiudian"))
           Str = "select * from jiudian where jiudiantitle= '"+chanpintitle+"';";
        else if (type.equals("qiezhi"))
           Str = "select * from qiezhi where qiezhititle= '"+chanpintitle+"';";
        else if (type.equals("jixie"))
           Str = "select * from jixie where jixietitle= '"+chanpintitle+"';";
        else if (type.equals("zhagang"))
           Str = "select * from zhagang where jixietitle= '"+chanpintitle+"';";
       else if (type.equals("moju"))
           Str = "select * from moju where mojutitle= '"+chanpintitle+"';";

                ResultSet rset = stmt.executeQuery(Str);
                int id=0;
                if (rset.next()) {
                 //   Object[] obj = new Object[3];
                     id = rset.getInt(1);

                }
                rset.close();
                return id + "";
}
//public String Chanpin1ContactBean  (String chanpintitle, String chanpincontent) throws Exception
////public void JianqieContactBean （String jianqietitle, String jianqiecontent）throws Exception
//{
//     Statement stmt=con.createStatement();
//     //if(type.equals("zhileng"))
//           Str = "select * from zhileng where zhilengtitle= '"+chanpintitle+"';";
//
//                ResultSet rset = stmt.executeQuery(Str);
//                int id=0;
//                if (rset.next()) {
//                 //   Object[] obj = new Object[3];
//                     id = rset.getInt(1);
//
//                }
//                rset.close();
//                return id + "";
//}
//    public static void main(String args[]){
//        try{
//             UploadContactBean uc = new UploadContactBean();
//       String str = uc.ChanpinContactBean("dddd","ddddd","zhileng");
//       System.out.println(str);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
}
