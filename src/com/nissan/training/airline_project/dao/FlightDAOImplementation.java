package com.nissan.training.airline_project.dao;


import java.sql.*;
import com.nissan.training.airline_project.pojo.Admin;
import com.nissan.training.airline_project.pojo.Flight;

public class FlightDAOImplementation implements IFlightDAO {
	Connection con = null;
	
	public void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/airlinesystem", "root", "Admin1234");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void showAllFlight() {
		createConnection();
		Statement st;
		try {
			st = (Statement) con.createStatement();
			String str = "select * from Flight";
			ResultSet rs = ((java.sql.Statement) st).executeQuery(str); 
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)+ " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8));
			}
			
		} catch (SQLException e) {
			
		}
		
	}
	
	public Flight showFlight(int flightId)   {

			createConnection();
			Statement st;
			try {
				st = (Statement) con.createStatement();
				String str = "select * from Flight where id="+flightId;
				ResultSet rs = ((java.sql.Statement) st).executeQuery(str); 
				rs.next();
//				System.out.println(rs.getInt(1));
				Flight fl = new Flight(flightId, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
				
				return fl;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return null; 
	}
	
	public void deleteFlight(int flightId) {
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "delete from Flight where id="+flightId;
			st.executeUpdate(str); 
			st.close();
			
		} catch (SQLException e) {
			
		}

		
	
	}
	
	public void updateFlight(int flightId, String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status) {
		createConnection();
		Statement st;
		try {
			st = con.createStatement();
			String str = "update Flight set arrivalTime=?, departureTime=?, source=?, "
					+ "destination=?, airline=?, numOfSeats=?, status=? where id="+flightId;
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1,arrivalTime);
			stmt.setString(2,departureTime);  
			stmt.setString(3, source);
			stmt.setString(4, destination);
			stmt.setString(5, airline);
			stmt.setInt(6, numOfSeats);
			stmt.setInt(7, status);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void addFlight(String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status) {
		
		createConnection();
		Statement st;

		try {
			st = con.createStatement();
			String str = "insert into Flight Values(0, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement(str);  
			stmt.setString(1,arrivalTime);
			stmt.setString(2,departureTime);  
			stmt.setString(3, source);
			stmt.setString(4, destination);
			stmt.setString(5, airline);
			stmt.setInt(6, numOfSeats);
			stmt.setInt(7, status);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");  			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}