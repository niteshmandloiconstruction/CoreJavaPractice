package in.sterling.oop;

//import in.sterling.corejava.Abc;

public class MethodOverriding {

	public void parentMethod() {
		System.out.println("Hello World, I am from parent class");
	}

}

class OverridingClass extends MethodOverriding{
	
	public void parentMethod () {
		System.out.println("Hello World, I am from child Class");
	} 
	
}
class TestOverride{
	
public static void main(String[] args) {
	
	MethodOverriding abc=new OverridingClass();
	abc.parentMethod();
}
}