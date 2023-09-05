import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	Connection con;
	Statement st;
	public CustomerServlet()throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
		st=con.createStatement();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name,addr,cont;
		int id;
		id=Integer.parseInt(req.getParameter("cid"));
		name=req.getParameter("cname");
		addr=req.getParameter("cadd");
		cont=req.getParameter("contact");
		PrintWriter pw=res.getWriter();
		try {
		insert(id,name,addr,cont);
		pw.println("<script>alert('Inserted')</script>");
		}catch(Exception ee) {}
	}
	void insert(int id,String name,String addr,String cont)throws Exception
	{
		String q="insert into customer values('"+id+"','"+name+"','"+addr+"','"+cont+"')";
		st.executeUpdate(q);
	}
	

}
