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
