public class TestBnBReservation {
	public static void main(String[] args) {
		Room r1 = new Room("queen");
		Room r2 = new Room("double");
		Room r3 = new Room("king");
		Room r4 = new Room("queen");
		Room[] rooms1 = new Room[] {r1,r2};
		Room[] rooms2 = new Room[] {r3,r4};
		Hotel h1 = new Hotel("Ritz", rooms1);
		Hotel h2 = new Hotel("Delta", rooms2);
		HotelReservation hr1 = new HotelReservation("Sissy", h1, "queen", 1);
		HotelReservation hr2 = new HotelReservation("Sam", h2, "king", 1);
		System.out.println(hr1.getCost());
		System.out.println(hr2.getCost());
		System.out.println(hr1.equals(hr1));
		System.out.println(hr2.equals(hr2));
		System.out.println(hr1.equals(hr2));
		System.out.println(hr2.equals(hr1));
	}
}
