package in.sterling.corejava;

public class FebonacciSeries {
	public static void main(String []args){

		int x=0;
		int y=1;

		System.out.print(x+" "+y+" ");
		for(int i=2; i<10; i++){
		int z=x+y;
		System.out.print(z + " ");
		x=y;
		y=z;
		}
		}
}
