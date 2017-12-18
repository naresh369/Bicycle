
public class Test {

	public static void main(String[] args) {
		
		MountainBike m= new MountainBike(50, 20, 4, 70);
		TandemBike t= new TandemBike(55, 23, 4, 2, 2);
		RoadBike r= new RoadBike(65, 26, 5, 50, 30);
		
		m.seatHeight();
		t.Seats();
		t.handlebars();
		r.tireRadius();
		r.handleHeight();
		
		
		

	}

}
