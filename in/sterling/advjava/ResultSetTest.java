package in.sterling.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv5","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()){
			System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4)+"--"+rs.getString(5));
		}
		stmt.close();
		con.close();
	}
}
