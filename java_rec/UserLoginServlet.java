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

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		org.hibernate.Query  q = s.createQuery("from UserPOJO where userName=:userName");
		q.setParameter("userName", userName);
		
		UserPOJO temp = (UserPOJO)q.uniqueResult();
		
		String un = temp.getUserName();
		String p = temp.getPassword();
		
		t.commit();
		t.getClass();
		sf.close();
		
		if(userName.equals(un) && password.equals(p))
		{
			System.out.println("User Login Success");
			System.out.println("Welcome "+un);
			resp.sendRedirect("UserDashboard.jsp");
		}
		else
		{
			System.out.println("Error");
		}
		
	}
	
}