public abstract class Reservation {
	private String name;
	
	// CONSTRUCTOR (1)
	public Reservation(String name) {
		this.name=name;
	}
	
	// GETTER FOR CLIENT NAME (2)
	public final String reservationName() {
		return this.name;
	}

	// GETTER FOR COST (3)
	public abstract int getCost();
	
	// VERIFY EQUALITY (4)
	public abstract boolean equals(Object x);
}