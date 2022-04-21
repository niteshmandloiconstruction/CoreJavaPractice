package in.sterling.corejava;

public class ForDebugging {

	public static void main(String[] args) {

		int x = 5;
		x = x++ + ++x - 5 + ++x + 9 * 2;
		System.out.println("x: "+x);

		int y = x + 2 + x++ + 9 * 2;
		System.out.println("y: "+y);
		System.out.println("x+y: "+(x + y));

		int m=show();

		System.out.println("m: "+m);
		System.out.println("x+y+m: "+(x+y+m));
		
		int n=show1();
		System.out.println("n: "+n);
		System.out.println("x+y+n: "+(x+y+n));
		
		double c=Math.random()*100;
		System.out.println("c: "+c);
		
		if(c>50) {
			System.out.println("m+n: "+(m+n));
		}
		else {
			System.out.println("Better Luck Next Time");
		}
	}

	private static int show() {
		// TODO Auto-generated method stub

		int k = 5;
		int x = 1;
		k = k+ x++ + ++x - 5 + ++x + 9 * 2;

		int y = x + 2 + x++ + 9 * 2;
		System.out.println("k-show: "+k);
		
		return k+y;
	}
	
	private static int show1() {
		// TODO Auto-generated method stub

		int k = 9;
		int x = 3;
		k = k+ x++ + ++x - 5 + ++x + 9 * 2;

		int y = x + 2 + x++ + 9 * 2;
		System.out.println("k-show1: "+k);
		
		return k+y;
	}

}
