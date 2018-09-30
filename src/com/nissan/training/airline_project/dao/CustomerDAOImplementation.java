package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Customer;
import java.sql.*;

public class CustomerDAOImplementation implements ICustomerDAO{

	@Override
	public int addCustomer(Customer c)  {
		
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "sa", "Admin1234");
					Statement st =  conn.createStatement();
					
					
					
						PreparedStatement stmt = conn.prepareStatement("insert into customer values(0,?,?,?,?,?)");
						stmt.setString(1,c.getName());  
						stmt.setString(2,c.getEmail());
						stmt.setString(3, c.getPassword());
						stmt.setString(4, c.getDob());
						stmt.setString(5, c.getContact());
						int i=stmt.executeUpdate();  
						System.out.println("Customer REGISTERED");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	

				
				return 0;
	}

	public Connection connectToDatabase() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "sa", "Admin1234");
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			
			
		}
		return null;
	
	}
	public Customer getCustomer(String name,String password) {
		
		Connection conn = connectToDatabase();
		
		
		Statement st;
		try {
			String str = "select * from customer where name=? and password=?";
			PreparedStatement stmt=(PreparedStatement) conn.prepareStatement(str);  
			stmt.setString(1, name);
			stmt.setString(2, password);  
			ResultSet rs = stmt.executeQuery(); 
			
			if(rs == null)
				return null;
			
			rs.next();
			Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			return cus;
			
		} catch (SQLException e) {
			
		}
	
	return null; 
}
	@Override
	public int showCustomer(int cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int showAllCustomer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(int cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
