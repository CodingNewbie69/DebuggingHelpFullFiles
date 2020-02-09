public class Basket {
	private Reservation[] reservations;
	
	// CONSTRUCTOR (1)
	public Basket() {
		this.reservations=new Reservation[0];
	}
	
	// COPY RESERVATIONS (2)
	public Reservation[] getProducts() {
		Reservation[] products = new Reservation[reservations.length];
		for (int i=0; i < reservations.length; i++) {
			products[i]=reservations[i];
		}
		return products;
	}
	
	// ADD A RESERVATION (3)
	public int add(Reservation x) {
		Reservation[] newreservations = new Reservation[reservations.length+1];
		for (int i=0; i < reservations.length; i++) {
			newreservations[i]=reservations[i];
			newreservations[newreservations.length]=x;
			reservations=newreservations;
		}
		return reservations.length;
	}
	
	// REMOVE A RESERVATION (4)
	public boolean remove(Reservation x) {
		boolean c=true;
		for (int i=0; i < reservations.length; i++) {
			if (reservations[i]==x) {
				Reservation[] newreservations = new Reservation[reservations.length-1];
				for (int j=0; j<i; j++) {
					newreservations[j]=reservations[j];
				}
				for (int j=i+1; j<reservations.length; j++) {
					newreservations[j-1]=reservations[j];
				}
				reservations=newreservations;
				c=true;
			} else {
				c=false;
			}
		}
		return c;
	}
	
	// EMPTY RESERVATIONS (5)
	public void clear() {
		for (int i=0; i < reservations.length; i++) {
			reservations=new Reservation[0];
		}
	}
	
	// GETTER FOR NUMBER OF RESERVATIONS (6)
	public int getNumOfReservations() {
		return reservations.length;
	}
	
	// GETTER FOR TOTAL COST (7)
	public int getTotalCost() {
		int sum=reservations[0].getCost();
		for (int i=1; i < reservations.length; i++) {
			sum+=reservations[i].getCost();
		}
		return sum;
	}
}