package in.sterling.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter Roll_No: ");
		 int rollNo=sc.nextInt();
		 
		 sc.nextLine();
		 System.out.println("Please enter Name: ");
		 String name=sc.nextLine();
		 
		 System.out.println("Please enter Chemistry_Marks: ");
		 int chemMarks=sc.nextInt();
		 
		 System.out.println("Please enter Maths_Marks: ");
		 int mathsMarks=sc.nextInt();
		 
		 System.out.println("Please enter Physics_Marks: ");
		 int phyMarks=sc.nextInt();
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv5","root","root");
		 PreparedStatement ps=con.prepareStatement("insert into school_data values(?,?,?,?,?)");
		 
		 ps.setInt(1, rollNo);
		 ps.setString(2, name);
		 ps.setInt(3, chemMarks);
		 ps.setInt(4, mathsMarks);
		 ps.setInt(5, phyMarks);
		 
		 int i=ps.executeUpdate();
		 System.out.println(i+" row(s) affected");
		
		 con.close();
		 sc.close();
	}

}
