public class Airport {
	private int x;
	private int y;
	private int fees;
	
	// CONSTRUCTOR (1)
	public Airport(int x, int y, int fees) {
		this.x=x;
		this.y=y;
		this.fees=fees;
	}
	
	// Getter for x-coordinate
	private int getX() {
		return this.x;
		}
	
	// Getter for y-coordinate
	private int getY() {
		return this.y;
		}
	
	// GETTER FOR FEES (2)
	public int getFees() {
		return this.fees;
		}
	
	// GETTER FOR DISTANCE (3)
	public static int getDistance(Airport name1, Airport name2) {
		double deltaX = abs(name1.getX()-name2.getX());
		double deltaY = abs(name1.getY()-name2.getY());
		double distance = Math.pow(Math.pow(deltaX,2.0)+Math.pow(deltaY,2.0),0.5);
		return (int) Math.ceil(distance);
		}
	
	// Absolute value method
	private static double abs(int i) {
		double a = i;
		return a;
		}
}