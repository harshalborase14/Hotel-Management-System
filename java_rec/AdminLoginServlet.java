import java.io.IOException;

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

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String adminName = req.getParameter("adminname");
		String password = req.getParameter("password");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		org.hibernate.Query q = s.createQuery("from AdminPOJO where adminName=:adminName");
		q.setParameter("adminName", adminName);
		
		AdminPOJO temp = (AdminPOJO) q.uniqueResult();
		
		String an = temp.getAdminName();
		String p = temp.getPassword();
		
		t.commit();
		t.getClass();
		sf.close();
		
		if(adminName.equals(an) && password.equals(p))
		{
			System.out.println("Login Success");
			System.out.println(an+"  "+p);
			resp.sendRedirect("AdminDashboard.jsp");
		}
		else
		{
			System.out.println("Error");
		}
	
	}
	
}
