import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/staff")
public class StaffListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Success");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","Harshal@1402");
			System.out.println("Connection Success");
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from employee;");
			
			HttpSession session=req.getSession();
			session.setAttribute("rs", rs);
			
			resp.sendRedirect("StaffList.jsp");
		}
		catch(Exception e)
		{
			System.out.println("StaffListServlet.java : "+e);
		}
		
	}
	
}
