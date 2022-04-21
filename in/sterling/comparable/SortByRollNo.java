package in.sterling.comparable;

import java.util.Comparator;

public class SortByRollNo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Marksheet m1=(Marksheet)o1;
		Marksheet m2=(Marksheet)o2;
		
		return (new Integer(m1.getRollNo())).compareTo(new Integer(m2.getRollNo()));
	}

	
	
}
