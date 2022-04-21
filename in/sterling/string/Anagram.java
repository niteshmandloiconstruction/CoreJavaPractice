package in.sterling.string;

import java.util.Arrays;

public class Anagram {
 
	public static void main(String[] args) {
		
		
		String str=new String("uuujna");
		String str1= new String("juuuna");
		int match=0;
		
		if(str.length()!=str1.length()) {
			System.out.println("Given not anagram");
		}
		else {
		char[] crr1=str.toCharArray();
		char[] crr2=str1.toCharArray();
		
		Arrays.sort(crr1);
		Arrays.sort(crr2);
		
		for (int i = 0; i < crr1.length; i++) {
			if(crr1[i]==crr2[i]) {
				match++;
			}
		}
		
		if(match==str.length()) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		}
	}
	
	
}

