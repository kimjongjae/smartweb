package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Response")
public class ResponseServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("EUC-KR");	
		PrintWriter out=resp.getWriter();
//		out.write("<HTML><HEAD><TITLE>ServletTest</TITLE></HEAD>");
//		out.write("<BODY><H1>");
//		out.write("ResponseServlet 요청성공");
//		out.write("</H1><BODY></HTML>");
//		out.close();
		
		out.println("<HTML><HEAD>Response 요청성공!!</HEAD></HTML>");
		out.println();
		out.close();
	}
}		
	

