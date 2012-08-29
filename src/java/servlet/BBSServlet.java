package servlet;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.RegisterDao;

import entity.BBS;

public class BBSServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");


            RegisterDao registerDao;
        try {
            registerDao = new RegisterDao();
      


		
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String company = req.getParameter("company");
		String telephone = req.getParameter("telephone");
		String fox = req.getParameter("fox");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		BBS message = new BBS();
		message.setName(name);
		message.setSex(sex);
		message.setCompany(company);
		message.setTelephone(telephone);
		message.setFox(fox);
		message.setEmail(email);
		message.setAddress(address);
		message.setTitle(title);
		message.setContent(content);
		int i = 0;
		i = registerDao.insertLeaveMessage(message);
		if(0 == i){
			req.setAttribute("msg", "���ʧ��");
		}else{
			req.setAttribute("msg", "��ӳɹ�");
		}
		req.getRequestDispatcher("leavemessage.jsp").forward(req, resp);
//		resp.sendRedirect(req.getContextPath()+"/leavemessage.jsp");
          } catch (Exception ex) {
            Logger.getLogger(BBSServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}


}
