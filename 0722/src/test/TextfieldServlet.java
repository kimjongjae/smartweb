package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/textfield")
public class TextfieldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		
//		response.setCharacterEncoding("text/html; charset=EUC-KR");
		response.setContentType("text/html");
		response.setCharacterEncoding("EUC-KR");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("¿Ã∏ß : " +name+"<br/>");
		out.print("</body></body>");
		out.close();
	}
	
}
