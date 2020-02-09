public class Room {
	private String type;
	private int price;
	private boolean free;

	// CONSTRUCTOR (1)
	public Room(String type) {
		try {
		if (type.equalsIgnoreCase("double")) {
			this.type="double";
			this.price=90*100;
			this.free=true;
		} else if (type.equalsIgnoreCase("queen")) {
			this.type="queen";
			this.price=110*100;
			this.free=true;
		} else if (type.equalsIgnoreCase("king")) {
			this.type="king";
			this.price=150*100;
			this.free=true;
		} else {
			throw new IllegalArgumentException();
		}
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error 1: No room of such type can be created.");
		}
	}
	
	// COPY CONSTRUCTOR (2)
	public Room(Room r) {
		this.type=r.type;
		this.price=r.price;
		this.free=r.free;
	}
		
	// GETTER FOR TYPE (3.1)
	public String getType() {
		return this.type;
	}
		
	// GETTER FOR PRICE (3.2)
	public int getPrice() {
		return this.price;
	}
	
	// Getter for availability
	public boolean getFree() {
		return this.free;
	}
	
	// CHANGE AVAILABILITY (4)
	public void changeAvailability() {
		if (this.free==true) {
			this.free=false;
		} else {
			this.free=true;
		}
	}
	
	// FIND FIRST FREE ROOM (5)
	public static Room findAvailableRoom(Room[] rooms, String type) {
		Room b=null;
		for (int i=0; i < rooms.length; i++) {
			if (rooms[i].free==true & (rooms[i].type).equalsIgnoreCase(type)) {
				int a=i;
				i=rooms.length;
				b = rooms[a];
			} else {
				b = null;
			}
		}
		return b;
	}

	// MAKE FIRST UNAVAILABLE ROOM FREE (6)
	public static boolean makeRoomAvailable(Room[] rooms, String type) {
		boolean c=true;
		for (int i=0; i < rooms.length; i++) {
			if (rooms[i].free==false & (rooms[i].type).equalsIgnoreCase(type)) {
				rooms[i].free=true;
				i=rooms.length;
				c=true;
			} else {
				c=false;
				}
		}
		return c;
	}
}