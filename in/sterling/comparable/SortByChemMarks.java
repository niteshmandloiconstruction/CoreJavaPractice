package in.sterling.comparable;

import java.util.Comparator;

public class SortByChemMarks implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Marksheet m1=(Marksheet)o1;
		Marksheet m2=(Marksheet)o2;
		
		return (new Double(m1.getCheMarks())).compareTo(new Double(m2.getCheMarks()));
	}

	
	
}
