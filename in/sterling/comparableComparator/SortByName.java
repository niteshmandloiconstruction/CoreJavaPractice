package in.sterling.comparableComparator;

import java.util.Comparator;

public class SortByName implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Cars c1=(Cars)o1;
		Cars c2=(Cars)o2;
		
		return c1.getCarName().compareTo(c2.getCarName());
	}

	
}
