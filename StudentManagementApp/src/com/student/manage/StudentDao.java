

package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.Statement;

public class StudentDao {

		public static boolean insertStudentToDB(Student st) 
		{
			boolean f=false;
			try {
				//jdbc code
				Connection con=ConnectionProvider.create();
			    String q="insert into students(sname,scity,sphone) values(?,?,?)";
			    //prepared statement
			    PreparedStatement pstmt=con.prepareStatement(q);
			    //set the value of parameters
			    pstmt.setString(1, st.getStudentname());
			    pstmt.setString(2, st.getStudentcity());
			    pstmt.setString(3, st.getStudentphone());
			    //execute
			    pstmt.executeUpdate();
			    f=true;
			    
			} catch (Exception e) {
				e.printStackTrace();
			}
			return f;
		}

		public static boolean deleteStudent(int id) {

			boolean f=false;
			try {
				//jdbc code
				Connection con=ConnectionProvider.create();
			    String q="delete from students where sid=?";
			    //prepared statement
			    PreparedStatement pstmt=con.prepareStatement(q);
			    //set the value of parameters
			    pstmt.setInt(1, id);
			 
			    //execute
			    pstmt.executeUpdate();
			    f=true;
			    
			} catch (Exception e) {
				e.printStackTrace();
			}
			return f;
			
		}
		

		public static void showAllStudent() {
			
			try {
				//jdbc code
				Connection con=ConnectionProvider.create();
			    String q="select * from students;";
			    // statement
			  java.sql.Statement stmt=con.createStatement();
			  ResultSet set=stmt.executeQuery(q);
			    
			    while(set.next()) {
			    	int id=set.getInt(1);
			    	String name=set.getString(2);
			    	String city=set.getString(3);
			    	String phone=set.getString(4);
			    	
			    	System.out.println("Id: "+id);
			    	System.out.println("Name: "+name);
			    	System.out.println("City: "+city);
			    	System.out.println("Phone: "+phone);
			    	
			    	System.out.println("***************************");
			    }
			    
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	
}
