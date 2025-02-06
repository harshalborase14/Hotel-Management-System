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

@WebServlet("/addstaff")
public class AddStaffServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String eid = req.getParameter("empid");
			int empid = Integer.parseInt(eid);
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String dept = req.getParameter("dept");
		String salary = req.getParameter("salary");
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		StaffPOJO s2 = new StaffPOJO();
		s2.setEmpid(empid);
		s2.setName(name);
		s2.setGender(gender);
		s2.setEmail(email);
		s2.setDob(dob);
		s2.setDepartment(dept);
		s2.setSalary(salary);
		
		s.save(s2);
		
		t.commit();
		sf.close();
		s.close();
		
		System.out.println("Record Added SuccessFully");
		resp.sendRedirect("./fetch1");
	}
}
