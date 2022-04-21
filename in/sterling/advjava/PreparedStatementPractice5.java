package in.sterling.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementPractice5 {

	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fastwheeldata","root", "root");
			
			PreparedStatement ps=con.prepareStatement("update businfo set fair=? where fromCity=? and toCity=? or fromCity=? and toCity=?");
			ps.setInt(1, 456);
			ps.setString(2, "indore");
			ps.setString(3, "bhopal");
			ps.setString(4, "bhopal");
			ps.setString(5, "indore");
			
			int i = ps.executeUpdate();
			System.out.println(i);
			
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
