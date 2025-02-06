import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeePOJO {
	
	@Id
	@Column(name="adharno")
	private double empid;
	
	@Column(name="name")
	private String e_name;
	
	@Id
	@Column(name="email")
	private String email;
	
	@Id
	@Column(name="phone")
	private String phone;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="job")
	private String job;
	
	
}
