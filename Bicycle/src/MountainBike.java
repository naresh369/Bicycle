
public class MountainBike extends Bicycle {
	
	int seatHeight;
	
	public MountainBike() {
		// TODO Auto-generated constructor stub
	}

	public MountainBike(int speed, int cadence, int gear, int seatHeight) {
		super(speed, cadence, gear);
		this.seatHeight = seatHeight;
	}

	/**
	 * @return the seatHeight
	 */
	public int getSeatHeight() {
		return seatHeight;
	}

	/**
	 * @param seatHeight the seatHeight to set
	 */
	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	
	public void seatHeight() {
		System.out.println("Height of the seat in mountain bike:"+getSeatHeight());
	}

	
	
	
	
	
}
