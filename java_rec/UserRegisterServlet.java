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

@WebServlet("/userRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		String hotelname = req.getParameter("hotelname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		UserPOJO user = new UserPOJO();
		user.setUserName(username);
		user.setCity(city);
		user.setHotel_name(hotelname);
		user.setPassword(password);
		user.setState(state);
		
		s.save(user);
		
		t.commit();
		sf.close();
		s.close();
		
		System.out.println("Registration Success");
		
	}	
}