import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class StaffPOJO {
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="e_name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	// Getter & Setter
	
		public String getName() {
		return name;
	}

	public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Column(name="email")
	private String Email;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="department")
	private String department;
	
	@Column(name="salary")
	private String salary;
}
