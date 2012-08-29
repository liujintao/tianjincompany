/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.bean;
import java.lang.Exception;
import java.sql.*;
/**
 *
 * @author liujintao
 */
public class InsertUserBean {
     private Connection con;
     private String Str;
    public InsertUserBean() throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
        this.con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/company","root","root");

    }
    public void InsertUser(String account,String password,String phone)throws Exception
    {
        Statement stmt=con.createStatement();
       Str="insert into user(account,password,phone) values('"+account+"','"+password+"','"+phone+"');" ;
      //   Str="insert into user values(null,'123','123','232323');";
      //  int i=stmt.executeUpdate(Str);
       
       //     return i;
         stmt.executeUpdate(Str);
         stmt.close();
        // return 0;
    }
     public int delete(String account ){
        int t = 0;
        try {
            Statement stmt = con.createStatement();
           // String sqlstr="select account from user where id='"+account+"';";
           // ResultSet rst=stmt.executeQuery(sqlstr);
          //  while(rst.next()){
          //  if(!rst.getString(1).equals("user")){
            String Str = "delete from user where id='" + account + "';";
            t=stmt.executeUpdate(Str);
            return t;
            }
            
        catch (Exception e) {
            e.printStackTrace();
                
        }
      return t;
    }
public void InsertNews(String newstitle,String newscontent)throws Exception
    {
        Statement stmt=con.createStatement();
     //   Date date = new Date(System.currentTimeMillis());
      
          //   Date d = new java.sql.Date(date.getTime());
    //   Str="insert into news(newstitle,newscontent,newstime) values('"+newstitle+"','"+newscontent+"','"+d+"');" ;
           Str="insert into news(newstitle,newscontent) values('"+newstitle+"','"+newscontent+"');" ;
      //   Str="insert into user values(null,'123','123','232323');";
      //  int i=stmt.executeUpdate(Str);
       
       //     return i;
         stmt.executeUpdate(Str);
         stmt.close();
        // return 0;
    }

public void InsertJianzhu(String jianzhutitle,String jianzhucontent)throws Exception
    {
        Statement stmt=con.createStatement();
      //  Date date = new Date(System.currentTimeMillis());

        //     Date d = new java.sql.Date(date.getTime());
       Str="insert into jianzhu(jianzhutitle,jianzhucontent) values('"+jianzhutitle+"','"+jianzhucontent+"');" ;
      //   Str="insert into user values(null,'123','123','232323');";
      //  int i=stmt.executeUpdate(Str);

       //     return i;
         stmt.executeUpdate(Str);
         stmt.close();
        // return 0;
    }
public void InsertShui(String shuititle,String shuicontent)throws Exception
    {
        Statement stmt=con.createStatement();
      //  Date date = new Date(System.currentTimeMillis());

        //     Date d = new java.sql.Date(date.getTime());
       Str="insert into shui(shuititle,shuicontent) values('"+shuititle+"','"+shuicontent+"');" ;
      //   Str="insert into user values(null,'123','123','232323');";
      //  int i=stmt.executeUpdate(Str);

       //     return i;
         stmt.executeUpdate(Str);
         stmt.close();
        // return 0;
    }
public int InsertJianqie(String jianqietitle,String jianqiecontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into jianqie(jianqietitle,jianqiecontent) values('"+jianqietitle+"','"+jianqiecontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertNengxiao(String nengxiaotitle,String nengxiaocontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into nengxiao(nengxiaotitle,nengxiaocontent) values('"+nengxiaotitle+"','"+nengxiaocontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertBangong(String bangongtitle,String bangongcontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into bangong(bangongtitle,bangongcontent) values('"+bangongtitle+"','"+bangongcontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertHaishi(String haishititle,String haishicontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into haishi(haishititle,haishicontent) values('"+haishititle+"','"+haishicontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertYiliao(String yiliaotitle,String yiliaocontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into yiliao(yiliaotitle,yiliaocontent) values('"+yiliaotitle+"','"+yiliaocontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertChezhan(String chezhantitle,String chezhancontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into chezhan(chezhantitle,chezhancontent) values('"+chezhantitle+"','"+chezhancontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertJichang(String jichangtitle,String jichangcontent)throws Exception
    {
        Statement stmt=con.createStatement();

       Str="insert into jichang(jichangtitle,jichangcontent) values('"+jichangtitle+"','"+jichangcontent+"');" ;

         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public int InsertChanpin(String chanpintitle,String chanpincontent,String type)throws Exception
    {
      Statement stmt=con.createStatement();
      if(type.equals("zhileng"))
       Str="insert into zhileng(zhilengtitle,zhilengcontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
      else if (type.equals("zidonghua"))
        Str="insert into zidonghua(zidonghuatitle,zidonghuacontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
        else if (type.equals("jiudian"))
        Str="insert into jiudian(jiudiantitle,jiudiancontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
        else if (type.equals("qiezhi"))
        Str="insert into qiezhi(qiezhititle,qiezhicontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
        else if (type.equals("jixie"))
        Str="insert into jixie(jixietitle,jixiecontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
        else if (type.equals("zhagang"))
        Str="insert into zhagang(zhagangtitle,zhagangcontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
       else if (type.equals("moju"))
        Str="insert into moju(mojutitle,mojucontent) values('"+chanpintitle+"','"+chanpincontent+"');" ;
         stmt.executeUpdate(Str);
         int id = 0;
         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
         if(rs.next()){
             id = rs.getInt(1);
         }
         stmt.close();
         return id;
        // return 0;
    }
public void InsertBBS(String name,String company,String phone,String address,String title,String content)throws Exception
    {
        Statement stmt=con.createStatement();
       Str="insert into bbs(name,company,telephone,address,title,content) values('"+name+"','"+company+"','"+phone+"','"+address+"','"+title+"','"+content+"');" ;
         stmt.executeUpdate(Str);
         stmt.close();
//         stmt.executeUpdate(Str);
//         int id = 0;
//         ResultSet rs  = stmt.executeQuery("select  LAST_INSERT_ID();");
//         if(rs.next()){
//             id = rs.getInt(1);
//         }
//         stmt.close();
//         return id;
        // return 0;
    }

}
