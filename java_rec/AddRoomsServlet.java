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

@WebServlet("/AddRoomsServlet")
public class AddRoomsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String roomno = req.getParameter("roomno");
		int room = Integer.parseInt(roomno);
		String roomtype = req.getParameter("roomtype");
		String ava = req.getParameter("availability");
		String price = req.getParameter("price");
		double prc = Double.parseDouble(price);
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		RoomPOJO r = new RoomPOJO();
		r.setRoomno(room);
		r.setRoomtype(roomtype);
		r.setAvailability(ava);
		r.setPrice(prc);
		
		s.save(r);
		
		t.commit();
		sf.close();
		s.close();
		
		System.out.println("Room Added Successfully");
		resp.sendRedirect("AddRooms.jsp");
		
	}
}
