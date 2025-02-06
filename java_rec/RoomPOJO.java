import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rooms")
public class RoomPOJO {

	@Id
	@Column(name="room_no")
	private int roomno;
	
	@Column(name="room_type")
	private String roomtype;
	
	@Column(name="availability")
	private String availability;
	
	@Column(name="price")
	private double price;

	
	//Getter & Setter Methods
	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
