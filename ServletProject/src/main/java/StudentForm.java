import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/StudentForm")
public class StudentForm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("sname");
		String addr=request.getParameter("sadd");
		String contact=request.getParameter("contact");
		Cookie ck1=new Cookie("name",name);
		response.addCookie(ck1);
		Cookie ck2=new Cookie("saddr",addr);
		response.addCookie(ck2);
		Cookie ck3=new Cookie("scont",contact);
		response.addCookie(ck3);
		pw.println("<form action=Result method=get>");
		pw.println("Subject 1 <input type=text name=m1>");
		pw.println("Subject 2 <input type=text name=m2>");
		pw.println("Subject 3 <input type=text name=m3>");
		pw.println("<input type=submit></form>");
		
		
	}

}
