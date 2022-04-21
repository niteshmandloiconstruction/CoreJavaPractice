package in.sterling.comparable;

import java.util.Iterator;
import java.util.TreeSet;

import sun.reflect.generics.tree.Tree;

public class TestMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marksheet m=new Marksheet();
		m.setRollNo(101);
		m.setName("Ajay");
		m.setCheMarks(78.4);
		m.setPhyMarks(65.5);
		m.setMathsMarks(66.4);
		
		Marksheet m1=new Marksheet();
		m1.setRollNo(104);
		m1.setName("Rahul");
		m1.setCheMarks(88.4);
		m1.setPhyMarks(45.6);
		m1.setMathsMarks(64.3);
		
		Marksheet m2=new Marksheet();
		m2.setRollNo(102);
		m2.setName("Nitesh");
		m2.setCheMarks(38.4);
		m2.setPhyMarks(95.5);
		m2.setMathsMarks(76.4);
		
		Marksheet m3=new Marksheet();
		m3.setRollNo(105);
		m3.setName("Vishal");
		m3.setCheMarks(71.9);
		m3.setPhyMarks(67.5);
		m3.setMathsMarks(89.4);
		
		Marksheet m4=new Marksheet();
		m4.setRollNo(103);
		m4.setName("Chetan");
		m4.setCheMarks(48.4);
		m4.setPhyMarks(65.1);
		m4.setMathsMarks(69.4);
		
		//TreeSet ts=new TreeSet(new SortByRollNo());
		//TreeSet ts=new TreeSet(new SortByChemMarks());
		//TreeSet ts=new TreeSet(new SortByPhyMarks());
		TreeSet ts=new TreeSet(new SortByMathsMarks());
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		ts.add(m4);
		ts.add(m);
		
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			Marksheet ms=(Marksheet)it.next();
			System.out.println(ms.getRollNo());
			System.out.println(ms.getName());
			System.out.println(ms.getCheMarks());
			System.out.println(ms.getPhyMarks());
			System.out.println(ms.getMathsMarks());
			System.out.println("----------------------");
			
		}
	}

}
