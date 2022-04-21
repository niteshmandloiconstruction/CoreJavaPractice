package in.sterling.comparable;

public class Marksheet implements Comparable{

private int rollNo=0;
private String Name=null;
private double cheMarks=0.0;
private double phyMarks=0.0;
private double mathsMarks=0.0;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getCheMarks() {
	return cheMarks;
}
public void setCheMarks(double cheMarks) {
	this.cheMarks = cheMarks;
}
public double getPhyMarks() {
	return phyMarks;
}
public void setPhyMarks(double phyMarks) {
	this.phyMarks = phyMarks;
}
public double getMathsMarks() {
	return mathsMarks;
}
public void setMathsMarks(double mathsMarks) {
	this.mathsMarks = mathsMarks;
}
@Override
public int compareTo(Object o) {
	Marksheet m=(Marksheet)o;
	//if we want to sort it w.r.t name use this 
	  String s1=this.Name;
	String s2=m.Name;
	return s1.compareTo(s2);
}
}
