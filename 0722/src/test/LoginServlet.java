package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid=req.getParameter("userid");
		String password=req.getParameter("password");
		
		resp.setContentType("text/html; charset=EUC-KR");
//		resp.setContentType("text/html");
//		resp.setCharacterEncoding("EUC-KR");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("���̵� : " +userid+"<br/>");
//		out.print("</body></body>");
//		out.print("<html><body>");
		out.print("��й�ȣ : " +password+"<br/>");
		out.print("</body></body>");
		out.close();
		
	}
	
}
