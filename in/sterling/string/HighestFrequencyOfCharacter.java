package in.sterling.string;

public class HighestFrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str=new String("java is programming languagezzzzz");
		int num1=0;
		int num2=0;
		char ch=' ';
		
		for(int i=0; i<str.length(); i++) {
			num2=0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					if(i<1) num1++;
					else num2++;
				}
			}
			if(num1<num2) {
				num1=num2;
				ch=str.charAt(i);
			}
		}

		System.out.println(ch+"  "+num1);
	}
	

}
