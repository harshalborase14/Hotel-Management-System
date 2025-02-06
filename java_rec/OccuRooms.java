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

@WebServlet("/occuroomsServlet")
public class OccuRooms extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","Harshal@1402");
			System.out.println("Connection Success");
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from rooms where availability= 'occupied';");
			
			HttpSession session = req.getSession();
			session.setAttribute("rs", rs);
			System.out.println("Data fetching is done in AvaRooms.java");
			resp.sendRedirect("RoomList2.jsp");
		}
		catch(Exception e)
		{
			System.out.println("AvaRooms.java : "+e);
		}
		
	}

}
