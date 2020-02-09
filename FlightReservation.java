public class FlightReservation extends Reservation {
	private Airport departureAirport;
	private Airport arrivalAirport;

	// CONSTRUCTOR (1)
	public FlightReservation(String name, Airport dA, Airport aA) {
		super(name);
		try {
		if (dA==aA) {
			throw new IllegalArgumentException();
		} else {
			this.departureAirport=dA;
			this.arrivalAirport=aA;
		}
		}
		catch (IllegalArgumentException g) {
			System.out.println("Error 3: The two input airports are identical. Please try again.");
		}
	}
		
	@Override // GETTER FOR COST (2)
	public int getCost() {
		double cost=(Math.ceil(Airport.getDistance(this.departureAirport, this.arrivalAirport))/167.52)*124+this.departureAirport.getFees()+this.arrivalAirport.getFees()+5375;
		return (int)Math.ceil(cost);
	}

	@Override // VERIFY EQUALITY (3)
	public boolean equals(Object x) {
		if (x.getClass()==this.getClass() &&
				((Reservation) x).reservationName()==this.reservationName() &&
				(((FlightReservation) x).departureAirport==this.departureAirport &&
				((FlightReservation) x).arrivalAirport==this.arrivalAirport)) {
			return true;
		} else {
			return false;
			}
	}
}