

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductForm")
public class ProductForm extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String pname=request.getParameter("pname");
		HttpSession ss=request.getSession();
		String cn=(ss.getAttribute("cname")).toString();
		pw.println("Product Name "+pname);
		pw.println("Customer Name "+cn);
	}

	
}
