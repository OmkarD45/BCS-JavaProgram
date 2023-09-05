import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/HtmlFormServlet")
public class HtmlFormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");
		pw.println("<h1 style=color:red>This is CSM Computer </h1>");
		pw.println("</body></html>");
		
	}
}
