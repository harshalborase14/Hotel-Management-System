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

@WebServlet("/CheckinServlet")
public class CheckInServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String adhar = req.getParameter("adharno");
			double adharno = Double.parseDouble(adhar);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String phone = req.getParameter("phoneno");
			double phoneno = Double.parseDouble(phone);
		String gender = req.getParameter("gender");
		String room = req.getParameter("roomno");
			int roomno = Integer.parseInt(room);
		String dep = req.getParameter("deposit");
			double deposit = Double.parseDouble(dep);
		String checkindate = req.getParameter("checkindate");
		String checkintime = req.getParameter("checkintime");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		CheckinPOJO c = new CheckinPOJO();
		c.setAdharno(adharno);
		c.setFirstname(fname);
		c.setLastname(lname);
		c.setPhoneno(phoneno);
		c.setGender(gender);
		c.setRoomno(roomno);
		c.setDeposit(deposit);
		c.setCheckindate(checkindate);
		c.setCheckintime(checkintime);
		
		s.save(c);
		System.out.println("Record Inserted");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","Harshal@1402");
			System.out.println("Connection Success");
			
			PreparedStatement pstm = con.prepareStatement("update rooms set availability = 'Occupied' where room_no = '"+roomno+"';");
			
			int i = pstm.executeUpdate();
			if(i!=0)
			{
				System.out.println("Database updated");
				resp.sendRedirect("./roomno");
			}
			else
				System.out.println("Error");
		}
		catch(Exception e)
		{
			System.out.println(e+" in CheckinServlet.java");
		}
		
		t.commit();
		sf.close();
		s.close();

	}

}
