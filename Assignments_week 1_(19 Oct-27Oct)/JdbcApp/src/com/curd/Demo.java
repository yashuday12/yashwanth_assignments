package com.curd;
import java.sql.*;
public class Demo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Yash@123");
			Statement st=con.createStatement();
			
			String query="insert into student_info values(4, 'chandu',' 2003-04-30', 'anatapur')";
			int count=st.executeUpdate(query);
			System.out.println(count);
			String query1="select*from student_info;";
			ResultSet rs=st.executeQuery(query1);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getDate(3)+""+rs.getString(4));
			}
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
