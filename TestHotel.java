public class TestHotel {
	public static void main(String[] args) {
		Room r1 = new Room("queen");
		Room r2 = new Room("double");
		Room r3 = new Room("king");
		Room r4 = new Room("queen");
		Room[] rooms1 = new Room[] {r1,r2};
		Room[] rooms2 = new Room[] {r3,r4};
		Hotel h1 = new Hotel("Ritz", rooms1);
		Hotel h2 = new Hotel("Delta", rooms2);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1.reserveRoom("king"));
		System.out.println(h2.reserveRoom("king"));
		System.out.println(h1.cancelRoom("double"));
		System.out.println(h2.cancelRoom("KING"));
	}
}
