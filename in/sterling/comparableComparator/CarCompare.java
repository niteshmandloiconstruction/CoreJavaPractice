package in.sterling.comparableComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class CarCompare {

	public static void main(String[] args) {
		
		Cars c1=new Cars(85465, "Creta", "Black", 1500000, 5, 160);
		Cars c2=new Cars(10698, "Scorpio", "White", 1700000, 8, 175);
		Cars c3=new Cars(58794, "Alto800", "Metallic Grey", 350000, 5, 120);
		Cars c4=new Cars(325788, "Thar", "Mehroon", 1500000, 4, 140);
		Cars c5=new Cars(7945985, "Seltos", "MattBlack", 1700000, 6, 165);
		
//	TreeSet<Cars> ts=new TreeSet<>(new SortByName());
		TreeSet<Cars> ts=new TreeSet<>(new SortByPrice());
		ts.add(c2);
		ts.add(c4);
		ts.add(c1);
		ts.add(c5);
		ts.add(c3);
		
		Iterator<Cars> it=ts.iterator();
		while (it.hasNext()) {
			Cars cars = (Cars) it.next();
			System.out.println("Registration Number-	"+cars.getRegistrationNumber());
			System.out.println("Car Name-	"+cars.getCarName());
			System.out.println("Car Colour-	"+cars.getCarColor());
			System.out.println("Car Price-	"+cars.getCarPrice());	
			System.out.println("Seating Capacity-	"+cars.getSeatingCapacity());
			System.out.println("Maximum Speed-	"+cars.getMaxSpeed());
			System.out.println("=====================================");
			
			
		}
		
		
	}
	
}
