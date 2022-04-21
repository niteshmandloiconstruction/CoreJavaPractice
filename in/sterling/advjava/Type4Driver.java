package in.sterling.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.sql.ResultSet;

public class Type4Driver {

	static String rollNo=null;
	static String rall=null;
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		//Load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded Successfully");
	
		//Connection establishment
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv5", "root", "root");
		System.out.println("Connection Created Successfully");
		
		//create statement
		Statement stmt=conn.createStatement();
		System.out.println("Statement Created Succesfully");
	
		
		ResultSet rs=null;
		double avgResult=0.0;
		try {
		rs=stmt.executeQuery("select rollNo from marksheet_project where chemistrymarks>=33 and physicsmarks>=33 and mathsmarks>=33");
		double rows=0.0;
		double totalRows=0.0;
				if(rs.last()) {
					rows=rs.getRow();
				}
				rs=stmt.executeQuery("Select * from marksheet_project");
				if(rs.last()) {
					totalRows=rs.getRow();
				}
				avgResult=Math.round((rows/totalRows)*100);
				System.out.println(rows+" "+totalRows+" "+avgResult);
		}catch(SQLException s) {
			s.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		/*int stop=0;
		while(i.next()) {
			int z=i.getInt("count(*)");
			*/
			/*if(stop<5) {
			rollNo=i.getString(1);
			rall=i.getString(2);
			Marksheet m=new Marksheet(rollNo, rall);
			st.add(m);
			stop++;
			}*/
		}
		/*
		Iterator<Marksheet> it=st.iterator();
		while(it.hasNext()) {
			Marksheet m=it.next();
			System.out.print(m.getRollNo()+"	");
			System.out.println(m.getName());
		}
		*/
		
		//System.err.println("Student's Roll Number - "+it.next());
		//System.err.println("Student's Name - "+it.next());
		//System.out.println("Student's Chemistry Marks - "+al.get(2));
		//System.out.println("Student's Physics Marks - "+al.get(3));
		//System.out.println("Student's Maths Marks - "+al.get(4));
	
	
		//release the resources
	
	
	}

