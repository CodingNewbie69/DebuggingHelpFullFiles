public class Customer {
	private String name;
	private int balance;
	private Basket customerBasket;
	
	// CONSTRUCTOR (1)
	public Customer(String name, int initialBalance) {
		this.name=name;
		this.balance=initialBalance;
		this.customerBasket=new Basket();
	}
	
	// GETTER FOR NAME (2.1)
	public String getName() {
		return name;
	}
	
	// GETTER FOR BALANCE (2.2)
	public int getBalance() {
		return balance;
	}
	
	// GETTER FOR CUSTOMER BASKET (3)
	public Basket getBasket() {
		return this.customerBasket;
	}
	
	// ADDING FUNDS TO BALANCE (4)
	public int addFunds(int cents) {
		try {
		if (cents < 0) {
			throw new IllegalArgumentException();
		} else {
			balance+=cents;
		}
		}
		catch (IllegalArgumentException i) {
			System.out.println("Error 5: The balance to be added is negative.");
		}
		return balance;
	}
	
	// ADD RESERVATION TO CUSTOMER BASKET (5)
	public int addToBasket(Reservation x) {
		int s=0;
		try {
		if (x.reservationName()==this.name) {
				return customerBasket.add(x);
		} else {
			throw new IllegalArgumentException();
		}
		}
		catch (IllegalArgumentException j) {
			System.out.println("The name in the input reservation does not match any customer's name in the system.");
		}
		return s;
	}
	
	// ADD HOTEL/BNB RESERVATION TO CUSTOMER BASKET (6)
	public int addToBasket(Hotel hotel, String type, int nights, boolean breakfast) {
		if (breakfast==false) {
			customerBasket.add(new HotelReservation(this.name, hotel, type, nights));
		} else {
			customerBasket.add(new BnBReservation(this.name, hotel, type, nights));
		}
		return customerBasket.getNumOfReservations();
	}
	
	// ADD FLIGHT RESERVATION TO CUSTOMER BASKET (7)
	public int addToBasket(Airport a1, Airport a2) {
		customerBasket.add(new FlightReservation(this.name, a1, a2));
		return customerBasket.getNumOfReservations();
	}
	
	// REMOVE RESERVATION FROM CUSTOMER BASKET (8)
	public boolean removeFromBasket(Reservation x) {
		return customerBasket.remove(x);
	}

	// CHECK OUT (9)
	public int checkOut() {
		int s=0;
		try {
		if (this.balance >= customerBasket.getTotalCost()) {
			this.balance -= customerBasket.getTotalCost();
			customerBasket.clear();
			s=this.balance;
		} else {
			throw new IllegalStateException();
		}
		}
		catch (IllegalStateException e) {
			System.out.println("The customer’s balance is not enough to cover the total cost of their basket.");
		}
		return s;
	}
}