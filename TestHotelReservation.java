public class TestHotelReservation {
	public static void main(String[] args) {
		Room room1 = new Room("double");
		Room room2 = new Room("double");
		Room room3 = new Room("queen");
		System.out.println(room1);
		System.out.println(room2);
		System.out.println(room3);
		Room[] rooms = {room1, room2, room3};
		Hotel h1 = new Hotel("myHotel", rooms);
		System.out.println(h1.getHotelRooms()[0].getFree()==true && h1.getHotelRooms()[0].getType()=="double");
		System.out.println(h1.getHotelRooms()[1].getFree()==true && h1.getHotelRooms()[1].getType()=="double");
		HotelReservation reserve1 = new HotelReservation("Jack", h1, "double", 3);
		HotelReservation reserve2 = new HotelReservation("Jill", h1, "double", 3);
	}
}