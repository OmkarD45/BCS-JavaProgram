import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CustomerForm")
public class CustomerForm extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String cn=request.getParameter("cname");
		HttpSession session=request.getSession();
		session.setAttribute("cname",cn);
		pw.println("<form action=ProductForm method=get>");
		pw.println("Product Name <input type=text name=pname>");
		pw.println("<input type=submit value=bill>");
		pw.println("</form>");
	}

}
