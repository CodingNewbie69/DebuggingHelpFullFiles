public class Hotel {
	private String hotelName;
	private Room[] hotelRooms;
	
	// CONSTRUCTOR (1)
	public Hotel(String hotelName, Room[] rooms) {
		this.hotelName=hotelName;
		Room[] hotelRooms=new Room[rooms.length];
		for (int i=0; i < rooms.length; i++) {
			hotelRooms[i]=new Room(rooms[i].getType());
		}
		this.hotelRooms=hotelRooms;
	}
	
	// Get hotel name
	public String getHotelName() {
		return this.hotelName;
		}
	
	// Get hotel rooms
	public Room[] getHotelRooms() {
		return this.hotelRooms;
	}
	
	// RESERVE ROOM (2)
	public int reserveRoom(String type) {
		int s=0;
		for (int i=0; i < this.getHotelRooms().length;i++) {
			try {
			if (this.getHotelRooms()[i].getFree()==true && (this.getHotelRooms()[i].getType()).equalsIgnoreCase(type)) {
				this.getHotelRooms()[i].changeAvailability();
				s=this.getHotelRooms()[i].getPrice();
				i=this.getHotelRooms().length;
			} else {
				throw new IllegalArgumentException();
			}
			}
			catch (IllegalArgumentException f) {
				System.out.println("Error 2: No room of the specified type is available.");
				}
		}
		return s;
	}
	
	// CANCEL ROOM (3)
	public boolean cancelRoom(String type) {
		boolean c=true;
		for (int i=0; i < this.getHotelRooms().length; i++) {
			if (this.getHotelRooms()[i].getFree()==false && (hotelRooms[i].getType()).equalsIgnoreCase(type)) {
				this.getHotelRooms()[i].changeAvailability();
				i=this.getHotelRooms().length;
				c=true;
			} else {
				c=false;
				}
		}
		return c;
	}
}