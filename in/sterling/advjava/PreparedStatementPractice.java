package in.sterling.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementPractice {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter ID: ");
		 int id=sc.nextInt();
		 
		 sc.nextLine();

		 System.out.println("Please enter Name: ");
		 String name=sc.nextLine();
		 
		 System.out.println("Please enter Department: ");
		 String department=sc.nextLine();
		
		 System.out.println("Please enter Address: ");
		 String address=sc.nextLine();
		 
		 System.out.println("Please enter Mobile_No: ");
		 Long mobileNo=sc.nextLong();
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv5","root","root");
		 PreparedStatement ps=con.prepareStatement("update Company_data set name=?, department=?, address=?, mobile_No=? where id=?");
		
		 ps.setString(1, name);
		 ps.setString(2, department);
		 ps.setString(3, address);
		 ps.setLong(4, mobileNo);
		 ps.setInt(5, id);
		 
		 int i=ps.executeUpdate();
		 System.out.println(i+" row(s) affected");
		
		 con.close();
		 sc.close();
		}

	}

	

