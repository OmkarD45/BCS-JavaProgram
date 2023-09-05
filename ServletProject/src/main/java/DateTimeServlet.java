import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/DateTimeServlet")
public class DateTimeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html><body><h1>");
		Date now=new Date();
		pw.println("Date And Time is "+now);
		pw.println("</h1></body></html>");
	}

}
