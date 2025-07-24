package com.studentInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Student.DBConnection;
import com.Student.studentDetails;

public class manageStudentInterface implements StudentInterface{

	@Override
	public boolean insertStudent(studentDetails s) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Connection con = DBConnection.createConnection();
			
			String query = "insert into student_details(sname,collegeName,city,percentage) value(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, s.getName());
			pstmt.setString(2, s.getCollegeName());
			pstmt.setString(3, s.getCity());
			pstmt.setDouble(4, s.getPercentage());
			pstmt.executeUpdate();			
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(int roll) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Connection con = DBConnection.createConnection();
			String query = "delete from student_details where rollnumber = "+roll;
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean update(int roll, String update, int ch, studentDetails s) {
		// TODO Auto-generated method stub
		int choice = ch;
		boolean flag = false;
		try {
			Connection con = DBConnection.createConnection();
			switch(choice) {
			case 1: String query = "Update student_details set sname = ? where rollNumber = ?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, update);
					pstmt.setInt(2, roll);
					pstmt.executeUpdate();
					flag = true;
					break;
			
			case 2: String query1 = "Update student_details set collegeName = ? where rollNumber = ?";
					PreparedStatement pstmt1 = con.prepareStatement(query1);
					pstmt1.setString(1, update);
					pstmt1.setInt(2, roll);
					pstmt1.executeUpdate();
					flag = true;
					break;
					
			case 3: String query2 = "Update student_details set city = ? where rollNumber = ?";
					PreparedStatement pstmt2 = con.prepareStatement(query2);
					pstmt2.setString(1, update);
					pstmt2.setInt(2, roll);
					pstmt2.executeUpdate();
					flag = true;
					break;
			}
//			if(choice == 1) {
//				Connection con = DBConnection.createConnection();
//				String query = "Update student_details set sname = ? where rollnumber = ?";
//				PreparedStatement pstmt = con.prepareStatement(query);
//				pstmt.setString(1,update);
//				pstmt.setInt(2, roll);
//				pstmt.executeUpdate();
//				flag = true;
//			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void showAllStudent() {
		// TODO Auto-generated method stub
		try {
			Connection con = DBConnection.createConnection();
			
			String query = "select * from student_details";
			Statement stmt = con.createStatement(); 
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				System.out.println("Roll Number: "+res.getInt(1)+"\n"
						+ " Name: "+res.getString(2)+"\n"
						+"College Name: "+res.getString(3)+"\n"
								+ "City: "+res.getString(4)+"\n"
										+ "Percentage: "+res.getDouble(5));
				System.out.println("========================================");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean showStudentById(int roll) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBConnection.createConnection();
			
			String query = "select * from student_details where rollnumber="+roll;
			Statement stmt = con.createStatement(); 
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				System.out.println("Roll Number: "+res.getInt(1)+"\n"
						+ " Name: "+res.getString(2)+"\n"
						+"College Name: "+res.getString(3)+"\n"
								+ "City: "+res.getString(4)+"\n"
										+ "Percentage: "+res.getDouble(5));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	
}
