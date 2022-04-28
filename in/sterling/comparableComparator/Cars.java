package in.sterling.comparableComparator;

public class Cars implements Comparable<Object>{

	private int registrationNumber;
	private String carName;
	private String carColor;
	private int carPrice;
	private int seatingCapacity;
	private int maxSpeed;
	
	public Cars(int registrationNumber, String carName, String carColor, int carPrice, int seatingCapacity,
			int maxSpeed) {
		super();
		this.registrationNumber = registrationNumber;
		this.carName = carName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.seatingCapacity = seatingCapacity;
		this.maxSpeed = maxSpeed;
	}
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int c1=this.registrationNumber;
		Cars c=(Cars)o;
		int c2=c.registrationNumber;
			
		return Integer.valueOf(c1).compareTo(Integer.valueOf(c2));
	}
	
	
}
