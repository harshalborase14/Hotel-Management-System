import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/adminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		String hotelname = req.getParameter("hotelname");
		String adminname = req.getParameter("adminname");
		String password = req.getParameter("password");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		AdminPOJO admin = new AdminPOJO();
		admin.setAdminName(adminname);
		admin.setCity(city);
		admin.setHotel_name(hotelname);
		admin.setPassword(password);
		admin.setState(state);
		
		s.save(admin);
		
		t.commit();
		sf.close();
		s.close();
		
		System.out.println("Registration Success");
		
	}
	
}
