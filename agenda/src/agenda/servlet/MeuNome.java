package agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nome")
public class MeuNome extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter n = response.getWriter();
		n.println("<html>");
		n.println("<head>");
		n.println("<style>");
		n.println("body{background-color: black;}");
		n.println("h1{ font-size:70px; text-align:center; color:white; font-family: arial;");
		n.println("</style>");
		n.println("</head>");
		n.println("<body>");
		n.println("<h1>Ellen Mendonça</h1>");
		n.println("</body>");
		n.println("</html>");
		
	}
}
