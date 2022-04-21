package in.sterling.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

class Student implements Comparable{
	
	private int rollNo=0;
	private String name=null;
	private String address=null;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, String address) {
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int compareTo(Object o) {
		Student o1=(Student)o;
		int i=(this.name).compareTo(o1.name);
		return i;
	}	
	
	public static Comparator<Student> cmprByRoll=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return Integer.valueOf(o1.getRollNo()).compareTo(Integer.valueOf(o2.getRollNo()));
		}	
	};
	
	public static Comparator<Student> comprByAdrs=new Comparator<Student>() {
	public int compare(Student o1, Student o2) {
		return o1.getAddress().compareTo(o2.getAddress());	
	}
	
	};
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.rollNo+" // "+this.name+" // "+this.address;
	}
}

public class CollectionSort{

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101, "Nitesh", "Indore"));
		al.add(new Student(103, "Nikky", "Khargone"));
		al.add(new Student(104, "Vishal", "Indore"));
		al.add(new Student(102, "Vihu", "Dewas"));
		
		Collections.sort(al);;
		System.out.println(al);
		System.out.println("--------------------------------------------------------------------");
		/*Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.print(s.getRollNo()+"	//	");
			System.out.print(s.getName()+"	// ");
			System.out.println(s.getAddress());
		*/
		
			ArrayList<Student> al1=new ArrayList<Student>();
			al1.add(new Student(101, "Nitesh", "Indore"));
			al1.add(new Student(103, "Nikky", "Khargone"));
			al1.add(new Student(104, "Vishal", "Indore"));
			al1.add(new Student(102, "Vihu", "Dewas"));
			
			Collections.sort(al1, Student.cmprByRoll);	
			System.out.println(al1);
			System.out.println("--------------------------------------------------------------------");
			/*Iterator<Student> it1=al1.iterator();
			while(it1.hasNext()) {
				Student s1=it1.next();
				System.out.print(s.getRollNo()+"	//	");
				System.out.print(s.getName()+"	// ");
				System.out.println(s.getAddress());
				
		}*/
			
			ArrayList<Student> al2=new ArrayList<Student>();
			al2.add(new Student(101, "Nitesh", "Indore"));
			al2.add(new Student(103, "Nikky", "Khargone"));
			al2.add(new Student(104, "Vishal", "Indore"));
			al2.add(new Student(102, "Vihu", "Dewas"));
			
			Collections.sort(al2, Student.comprByAdrs);	
			System.out.println(al2);
			System.out.println("--------------------------------------------------------------------");
	}
	
	}


