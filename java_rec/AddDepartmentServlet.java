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

@WebServlet("/AddDepartmentServlet")
public class AddDepartmentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dname = req.getParameter("dept_name");
		String dbudget = req.getParameter("budget");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		DepartmentPOJO d = new DepartmentPOJO();
		d.setDept_name(dname);
		d.setBudget(dbudget);
		
		s.save(d);
		
		t.commit();
		sf.close();
		s.close();
		
		System.out.println("Department Added Successfully");
		resp.sendRedirect("AddDepartment.jsp");
	}
}
