package com.flight;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightDao {
	Connection con=FDbUtill.getDBConnection();
	public int insertEmployee(Flight f) {
		String insertQuery = "insert into Employee values(?,?,?)";
		// ? positional parameters
		int count = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, f.getFid());
			pstmt.setString(2, f.getFname());
			pstmt.setDouble(3, f.getFprice());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

}
