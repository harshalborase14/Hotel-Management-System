import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class DepartmentPOJO {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int dept_id;
	
	@Column(name="dept_name")
	private String dept_name;
	
	@Column(name="budget")
	private String budget;
	
//	Getter & Setter Methods
	public String getDept_name() {
		return dept_name;
	}
	
	public int getDept_id() {
		return dept_id;
	}



	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}



	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}
}