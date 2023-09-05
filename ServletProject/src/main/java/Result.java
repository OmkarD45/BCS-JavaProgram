import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie sp[]=request.getCookies();
		out.println("Name Of Cooike "+sp[0].getName()+"\nName Of Student "+sp[0].getValue());
		out.println("Address "+sp[1].getName()+"\nAddress "+sp[1].getValue());
		out.println("Contact "+sp[2].getName()+"\nContact "+sp[2].getValue());
		int m1=Integer.parseInt(request.getParameter("m1"));
		int m2=Integer.parseInt(request.getParameter("m2"));
		int m3=Integer.parseInt(request.getParameter("m3"));
		out.println("\nM1="+m1);
		out.println("\nM2="+m2);
		out.println("\nM3="+m3);
		
	}

}
