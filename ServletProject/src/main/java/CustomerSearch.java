import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CustomerSearch")
public class CustomerSearch extends HttpServlet {
	Connection con;
	Statement st;
	ResultSet rs;
		public CustomerSearch()throws Exception
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
			st=con.createStatement();
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("cid"));
		PrintWriter pw=response.getWriter();
		try {
		String q="select * from customer where id='"+id+"'";
		rs=st.executeQuery(q);
		pw.println("<table border=1><tr><th>Id</th><th>Name</th>");
		pw.println("<th>Address</th><th>Contact</th></tr>");
		while(rs.next())
		{
		pw.println("<tr>");
		pw.println("<td>"+rs.getInt(1)+"</td>");
		pw.println("<td>"+rs.getString(2)+"</td>");
		pw.println("<td>"+rs.getString(3)+"</td>");
		pw.println("<td>"+rs.getString(4)+"</td>");
		pw.println("</tr>");
		}
		pw.println("</table>");
		}
		catch(Exception ee)
		{
			pw.println(""+ee);
		}
	}

}


