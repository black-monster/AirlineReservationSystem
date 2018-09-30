package com.nissan.training.airline_project.dao;

import java.sql.*;
import com.nissan.training.airline_project.pojo.Admin;

public class AdminDAOImplementation implements IAdminDAO{

	@Override
	public int addAdmin(Admin c) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "sa", "Admin1234");
			Statement st =  conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Admin;");
			
			int countAdmin=0;
			while(rs.next()) {
				
				 countAdmin = Integer.parseInt(rs.getString(1));
			}
			
			if(countAdmin==0) {
				PreparedStatement stmt = conn.prepareStatement("insert into admin values(0,?,?,?,?,?)");
				stmt.setString(1,c.getName());  
				stmt.setString(2,c.getEmail());
				stmt.setString(3, c.getPassword());
				stmt.setString(4, c.getDob());
				stmt.setString(5, c.getContact());
				int i=stmt.executeUpdate();  
				System.out.println("ADMIN REGISTERED");
			}
			else {
				System.out.println("ADMIN ALREADY EXISTS");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		
		return 0;
	}

	@Override
	public int showAdmin(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int showAllAdmin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmin(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
