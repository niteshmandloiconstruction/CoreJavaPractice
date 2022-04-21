package in.sterling.advjava;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DatabaseConnectionPoolPractice {

	public static void main(String[] args) throws PropertyVetoException, SQLException {
		// TODO Auto-generated method stub

		ComboPooledDataSource cpds=new ComboPooledDataSource();
		
		cpds.setDriverClass("com.mysql.jdbc.Driver");
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/adv5");
		cpds.setUser("root");
		cpds.setPassword("root");
		cpds.setInitialPoolSize(5);
		cpds.setMaxPoolSize(10);
		cpds.setMaxIdleTime(100);
		cpds.setAcquireIncrement(5);
		cpds.setMinPoolSize(10);
		
		Connection con=cpds.getConnection();
		Statement stmt=con.createStatement();
		System.out.println("Statement Created Successfully");
	
	}

}
