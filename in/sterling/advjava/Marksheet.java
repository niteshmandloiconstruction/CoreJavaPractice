package in.sterling.advjava;

public class Marksheet {
	
	private String rollNo=null;
	private String name=null;
	private int chemistryMarks=0;
	private int physicsMarks=0;
	private int mathsMarks=0;
	
	
public Marksheet() {}
	
	public Marksheet(String rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	public String getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}
	public int getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
	
	
}
