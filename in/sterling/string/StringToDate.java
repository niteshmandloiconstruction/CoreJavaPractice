package in.sterling.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		String str="31/10/2001";
		Date d=new SimpleDateFormat("dd/MM/yyyy").parse(str);
		
		System.out.println(d);
	}
}
