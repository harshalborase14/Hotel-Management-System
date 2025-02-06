import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class CheckinPOJO {

	@Id
	@Column(name = "adhar_no")
	private double adharno;
	
    @Column(name = "f_name")
    private String firstname;

    @Column(name = "l_name")
    private String lastname;

    @Column(name = "gender")
    private String gender;
    
    @Column(name = "phone_no")
    private double phoneno;

    @Column(name = "check_in_time")
    private String checkintime;
    
    @Column(name = "check_in_date")
    private String checkindate;
    
    @Column(name = "roomno")
    private int roomno;

	@Column(name = "deposit")
    private double deposit;

    
    //getter & Setters
	
	 public int getRoomno() {
			return roomno;
		}

		public void setRoomno(int roomno) {
			this.roomno = roomno;
		}
		
	
	public String getCheckindate() {
			return checkindate;
		}

		public void setCheckindate(String checkindate) {
			this.checkindate = checkindate;
		}

	public double getAdharno() {
		return adharno;
	}

	public void setAdharno(double adharno) {
		this.adharno = adharno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(double phoneno) {
		this.phoneno = phoneno;
	}

	public String getCheckintime() {
		return checkintime;
	}

	public void setCheckintime(String checkintime) {
		this.checkintime = checkintime;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}
