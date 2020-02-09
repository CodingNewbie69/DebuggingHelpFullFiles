public class HotelReservation extends Reservation {
	private Hotel hotel;
	private String type;
	private int nights;
	private int nightprice;

	// CONSTRUCTOR (1)
	public HotelReservation(String name, Hotel hotel, String type, int nights) {
		super(name);
		try {
		for (int i=0; i < hotel.getHotelRooms().length; i++) {
			if (hotel.getHotelRooms()[i].getFree()==true && hotel.getHotelRooms()[i].getType()==type) {
				this.hotel=hotel;
				this.type=type;
				this.nights=nights;
				this.hotel.getHotelRooms()[i].changeAvailability();
			} else {
				throw new IllegalArgumentException();
			}
		}
		}
		catch (IllegalArgumentException h) {
			System.out.println("No room of the specified type is available in the selected hotel.");
		}
	}
		
	// GETTER FOR NUMBER OF NIGHTS (2)
	public int getNumOfNights() {
		return this.nights;
	}
		
	@Override //GETTER FOR COST (3)
	public int getCost() {
		return this.nightprice*this.nights;
	}

	@Override // VERIFY EQUALITY (4)
	public boolean equals(Object x) {
		if (x.getClass()==this.getClass() &&
				((Reservation) x).reservationName()==this.reservationName() &&
				((Hotel) hotel).getHotelName()==this.hotel.getHotelName() &&
				((Hotel) hotel).getHotelRooms()==this.hotel.getHotelRooms() &&
				((HotelReservation) x).type==this.type &&
				((HotelReservation) x).nights==this.nights &&
				((HotelReservation) x).getCost()==this.getCost()) {
			return true;
		} else {
			return false;
		}
	}
}