import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exit")
public class ExitPOJO {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int exit_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="empid")
	private String empid;
	
	@Column(name="exit_date")
	private String exit_date;

	public int getExit_id() {
		return exit_id;
	}

	public void setExit_id(int exit_id) {
		this.exit_id = exit_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getExit_date() {
		return exit_date;
	}

	public void setExit_date(String exit_date) {
		this.exit_date = exit_date;
	}
	
	

}
