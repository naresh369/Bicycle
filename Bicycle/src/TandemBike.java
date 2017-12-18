
public class TandemBike extends Bicycle {

	int numOfSeats;
	int handleBars;
	
	public TandemBike() {
		// TODO Auto-generated constructor stub
	}

	public TandemBike(int speed, int cadence, int gear, int numOfSeats, int handleBars) {
		super(speed, cadence, gear);
		this.numOfSeats = numOfSeats;
		this.handleBars = handleBars;
	}

	/**
	 * @return the numOfSeats
	 */
	public int getNumOfSeats() {
		return numOfSeats;
	}

	/**
	 * @param numOfSeats the numOfSeats to set
	 */
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	/**
	 * @return the handleBars
	 */
	public int getHandleBars() {
		return handleBars;
	}

	/**
	 * @param handleBars the handleBars to set
	 */
	public void setHandleBars(int handleBars) {
		this.handleBars = handleBars;
	}

	public void Seats() {
		System.out.println("Number of seats in tandem bike:"+getNumOfSeats());
	}
	
	public void handlebars() {
		System.out.println("Number of handle bars in tandem bike:"+getHandleBars());
	}
	
	
	
	
}
