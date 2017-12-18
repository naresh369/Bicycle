
public class RoadBike extends Bicycle {

	int heightOfHandleBar;
	int radiusOfTire;
	
	public RoadBike() {
		// TODO Auto-generated constructor stub
	}

	

	public RoadBike(int speed, int cadence, int gear, int heightOfHandleBar, int radiusOfTire) {
		super(speed, cadence, gear);
		this.heightOfHandleBar = heightOfHandleBar;
		this.radiusOfTire = radiusOfTire;
	}



	/**
	 * @return the heightOfHandleBar
	 */
	public int getHeightOfHandleBar() {
		return heightOfHandleBar;
	}

	/**
	 * @param heightOfHandleBar the heightOfHandleBar to set
	 */
	public void setHeightOfHandleBar(int heightOfHandleBar) {
		this.heightOfHandleBar = heightOfHandleBar;
	}

	/**
	 * @return the radiusOfTire
	 */
	public int getRadiusOfTire() {
		return radiusOfTire;
	}

	/**
	 * @param radiusOfTire the radiusOfTire to set
	 */
	public void setRadiusOfTire(int radiusOfTire) {
		this.radiusOfTire = radiusOfTire;
	}
	
	public void tireRadius() {
		System.out.println("Radius of tire in road bike:"+getRadiusOfTire());
		
	}
	
	public void handleHeight() {
		System.out.println("Height of handle bar in road bike:"+getHeightOfHandleBar());
	}
	
	
}
