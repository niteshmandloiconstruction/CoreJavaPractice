package in.sterling.string;

public class ReverseWords {

	public static void main(String[] args) {
		
	String str="Java is programming language";
	String[] srr=str.split(" ");
	String str1="";
	int forMoving=0;
	
	while(forMoving<srr.length) {
	for(int i=srr[forMoving].length()-1; i>=0; i--) {
	str1=str1+srr[forMoving].charAt(i);	
	}
	str1=str1+" ";
	forMoving++;
	}
	System.out.println(str1);
	
}}

