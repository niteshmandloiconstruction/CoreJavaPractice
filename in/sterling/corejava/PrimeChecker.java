package in.sterling.corejava;

import java.util.Scanner;

public class PrimeChecker {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number you want to check");
		int checker=sc.nextInt();
		
		int[] arr=new int[checker];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int count=1;
		int factor=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+":= ");
			for(int j=1; j<=arr[i]; j++) {
				factor =0;
				for(int k=1; k<=j; k++) {
					if(j%k==0) {
						factor++;
					}
				}
				if(factor==2) {
					System.out.print(j+", ");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

}
