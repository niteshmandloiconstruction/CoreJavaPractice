package in.sterling.advjava;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DCNConnectivity { //DCP Database Connection pool

	public static void main(String[] args) throws PropertyVetoException {
		// TODO Auto-generated method stub

		ComboPooledDataSource cp=new ComboPooledDataSource();
		
		cp.setDriverClass("com.mysql.jdbc.Driver");
		cp.setJdbcUrl("jdbc:mysql://localhost:3306/adv5");
		cp.setUser("root");
		cp.setPassword("root");
		cp.setInitialPoolSize(5);
		cp.setMaxPoolSize(10);
		cp.setMaxIdleTime(2000);
		cp.setAcquireIncrement(5);
		cp.setMinPoolSize(10);
		
		System.out.println("Connection established Succefully");
	}

}
