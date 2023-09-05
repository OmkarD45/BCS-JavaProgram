import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/GetValueServlet")
public class GetValueServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname=request.getParameter("sname");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body><h1>");
		pw.println(""+sname);
		pw.println("</h1></body></html>");
	}

}
