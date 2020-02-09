public class TestFlightReservation {
	public static void main(String[] args) {
		Airport a1 = new Airport(4, 30000, 20000);
		Airport a2 = new Airport(7, 80000, 30000);
		FlightReservation f1 = new FlightReservation("myFlight", a1, a2);
		System.out.println(Airport.getDistance(a1,a2));
		System.out.println(f1.getCost());
	}
}