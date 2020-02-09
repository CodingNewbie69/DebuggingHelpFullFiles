public class TestAirport {
	public static void main(String[] args) {
		Airport a1 = new Airport(254,810,4000*100);
		Airport a2 = new Airport(54,69,3500*100);
		Airport a3 = new Airport(50,65,4500*100);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Airport.getDistance(a1, a2));
	}
}