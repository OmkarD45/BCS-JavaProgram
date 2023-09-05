import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/ServerInfo")
public class ServerInfo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h1><br>Server Name "+getName(getServletContext().getServerInfo()));
	out.println("<br>Server Version "+getVersion(getServletContext().getServerInfo()));
	out.println("</h1>");
	}
 public String getName(String sinfo)
 {
	 int c=sinfo.indexOf('/');
	 if(c==-1)
		 return sinfo;
	 else
		 return (sinfo.subSequence(0, c)).toString();
 }
 public String getVersion(String sinfo)
 {
	 int c=sinfo.indexOf('/');
	 int len=sinfo.length();
	 if(c==-1)
		 return sinfo;
	 else
		 return (sinfo.subSequence(c+1,len)).toString();
 }

}
