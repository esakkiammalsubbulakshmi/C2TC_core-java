package ProblemStatement_2;


public class MontaneBike	extends	Bicycle
{
	private	int	Seat_height;

	public int getSeat_height() {
		return Seat_height;
	}

	public void setSeat_height(int seat_height) {
		Seat_height = seat_height;
	}

	@Override
	public String toString() {
		return "MontaneBike [Seat_height=" + Seat_height + ", Number_of_gears=" + getNumber_of_gears()
				+ ", Speed_of_bicycle=" + getSpeed_of_bicycle() + "]";
	}

	
	
	

	

}
