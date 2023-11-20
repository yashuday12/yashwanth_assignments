package com.hexaware.springboot5.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexaware.springboot5.model.Admin;
@Repository
public class AdminDao implements IAdminDao {
	Connection con=AdminUtil.getDBConnection();

	@Override
	public int InsertDeatils(Admin admin) {
		String insertQuery = "insert into Admin values(?,?,?)";
		// ? positional parameters

		int count = 0;

		try {

			PreparedStatement pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, admin.getAdminId());
			pstmt.setString(2, admin.getAdminName());
			pstmt.setDouble(3, admin.getAdminAge());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;
	
	}

	@Override
	public List<Admin> getAll(Admin admin) {
		List<Admin> list=new ArrayList<>();
		String SelectAll="Select* from Admin";
		PreparedStatement pstmt;
		try {
			pstmt=con.prepareStatement(SelectAll);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int adminId=rs.getInt(1);
				String adminName=rs.getString(2);
				int adminAge=rs.getInt(3);
				Admin admindetails=new Admin(adminId, adminName,adminAge);
				list.add(admindetails);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	

	
}
