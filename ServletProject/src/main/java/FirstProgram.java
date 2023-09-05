import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/FirstProgram")
public class FirstProgram extends HttpServlet {
  public FirstProgram() {
        super();
   }
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, 
							IOException {
		PrintWriter pw=response.getWriter();
		pw.println("Welcome to CSM Computer");
		pw.println("<html><body bgcolor=red>");
		pw.println("<input type=text></body>");
			}
	

}
