public class BnBReservation extends HotelReservation {

	// CONSTRUCTOR (1)
	public BnBReservation(String name, Hotel hotel, String type, int nights) {
		super(name, hotel, type, nights);
	}
	
	// HOTEL + BREAKFAST COST (2)
	public int getCost() {
		return this.getCost()+this.getNumOfNights()*10*100;
	}
}