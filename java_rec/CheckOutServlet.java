import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/checkout")
public class CheckOutServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String adhar = req.getParameter("adharno");
			double adharno = Double.parseDouble(adhar);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String roomno = req.getParameter("roomno");
		String date = req.getParameter("checkoutdate");
		String time = req.getParameter("checkouttime");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","Harshal@1402");
			System.out.println("Connection Success");
			
			PreparedStatement pstm = con.prepareStatement("update rooms set availability = 'available' where room_no = '"+roomno+"';");
			
			int i = pstm.executeUpdate();
			if(i!=0)
			{
				System.out.println("Database updated of room table");
			}
			else
				System.out.println("Error");
			
			PreparedStatement pstm2 = con.prepareStatement("delete from booking where roomno = '"+roomno+"';");
			int i1 = pstm2.executeUpdate();
			if(i1!=0)
			{
				System.out.println("record deleted from booking table");
				resp.sendRedirect("Checkout.jsp");
			}
			else
				System.out.println("Error");
		}
		catch(Exception e)
		{
			System.out.println("CheckOutServlet.java : "+e);
		}
	}

}
