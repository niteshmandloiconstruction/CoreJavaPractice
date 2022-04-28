package in.sterling.comparableComparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Cars c1=(Cars)o1;
		Cars c2=(Cars)o2;
		
		return Integer.valueOf(c1.getCarPrice()).compareTo(Integer.valueOf(c2.getCarPrice()));
	}
}
