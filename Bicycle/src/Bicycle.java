
public class Bicycle {

		int speed;
		int cadence;
		int gear;
		
		public Bicycle() {
			// TODO Auto-generated constructor stub
		}
		
		public Bicycle(int speed, int cadence, int gear) {
			this.speed = speed;
			this.cadence = cadence;
			this.gear = gear;
		}
		
		public void changeCadence(int value) {
	        cadence = value;
	    }
	        
	    public void changeGear(int value) {
	        gear = value;
	    }
	    
	    public void accelerate(int increment) {
	        speed += increment;
	    }
	        
	    public void applyBrake(int decrement) {
	        speed -= decrement;
	    }
	        
	   

	}
	
	
	
	
