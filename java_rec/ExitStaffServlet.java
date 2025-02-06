import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/exit")
public class ExitStaffServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String empid = req.getParameter("empid");
		String date = req.getParameter("date");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		ExitPOJO e = new ExitPOJO();
		e.setName(name);
		e.setEmpid(empid);
		e.setExit_date(date);
		
		s.save(e);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelproject","root","Harshal@1402");
			System.out.println("Connection Success");
			
			PreparedStatement pstm = con.prepareStatement("delete from employee where empid=? and e_name=?;");
			pstm.setString(1, empid);
			pstm.setString(2, name);
			
			int i = pstm.executeUpdate();
			
			if(i!=0)
			{
				System.out.println("Record Deleted");
			}
			else
			{
				System.out.println("Error :  Record Not Deleted");
			}
		}
		catch(Exception e1)
		{
			System.out.println("ExitServlet : "+e1);
		}
	}

}
