package in.sterling.string;

public class Palindrome {

	public static void main(String[] args){

		String s=new String("was it a car or a cat i saw");
		String s1=s.replaceAll(" ","");
		String s2="";

		for(int i=s1.length()-1; i>=0; i--){
		s2=s2+s1.charAt(i);
		}
		if(s2.equals(s1)){
		System.out.println("Sentence is Palindrome");
		}
		else{
		System.out.println("Sentence is not Palindrome");
		}
		}
	}
