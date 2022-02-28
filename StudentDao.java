package CRUDOparetion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;




public class StudentDao {

	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		try {
			Connection con =conP.creatcon();
			String q="insert into STUDENT(STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ)values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,st.getStudentName());
			pstmt.setDate(2,st.getStudent_DOB());
			pstmt.setDate(3,st.getStudent_DOJ());
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean updateStudentToDB(Student st) {
		
		boolean f=false;
		try {
			Connection con =conP.creatcon();
			String q="update STUDENT set STUDENT_NAME=?,STUDENT_DOB=?,STUDENT_DOJ=? where STUDENT_NO=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1,st.getStudent_no());
			pstmt.setString(2,st.getStudentName());
			pstmt.setDate(3,st.getStudent_DOB());
			pstmt.setDate(4,st.getStudent_DOJ());
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
			Connection con =conP.creatcon();
			String q="delete from STUDENT where STUDENT_NO=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudent() {
		
		try {
			Connection con =conP.creatcon();
			String q="select *from STUDENT";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next())
			{
				int s_no=set.getInt(1);
				String name=set.getString(2);
				Date dob=set.getDate(3);
				Date doj=set.getDate(4);
				System.out.println("ID :"+s_no);
				System.out.println("Name :"+name);
				System.out.println("date of birth :"+dob);
				System.out.println("date of join :"+doj);
				
				System.out.println("+++++++++++++++++++++++++++");
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	

	public static void singleStudentRecord(int userId) {
		try {
			Connection con =conP.creatcon();
			String q="select * from STUDENT where STUDENT_NO=?";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, userId);
			ResultSet rset=pstmt.executeQuery(q);
			
			while(rset.next())
			{
				int s_no=rset.getInt(1);
				String name=rset.getString(2);
				Date dob=rset.getDate(3);
				Date doj=rset.getDate(4);
				System.out.println("ID :"+s_no);
				System.out.println("Name :"+name);
				System.out.println("date of birth :"+dob);
				System.out.println("date of join :"+doj);
				
				System.out.println("+++++++++++++++++++++++++++");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
