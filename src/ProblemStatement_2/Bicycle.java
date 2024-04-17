package ProblemStatement_2;

public class Bicycle {
	private	int	number_of_gears;
	private	int	speed_of_bicycle;
	public int getNumber_of_gears() {
		return number_of_gears;
	}
	public void setNumber_of_gears(int number_of_gears) {
		this.number_of_gears = number_of_gears;
	}
	public int getSpeed_of_bicycle() {
		return speed_of_bicycle;
	}
	public void setSpeed_of_bicycle(int speed_of_bicycle) {
		this.speed_of_bicycle = speed_of_bicycle;
	}
	@Override
	public String toString() {
		return "Bicycle [number_of_gears=" + number_of_gears + ", speed_of_bicycle=" + speed_of_bicycle + "]";
	}
	
	
	
}
	
	
