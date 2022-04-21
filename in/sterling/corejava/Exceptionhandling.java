package in.sterling.corejava;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		try {
			int a=10; int b=0;
			System.out.println("start");
			System.out.println("run");
			char[] arr= {'c', 'v', 'r', 'r'};
			System.out.println(arr);
			System.exit(-1);
			System.out.println("Exit");
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		
	}
}
