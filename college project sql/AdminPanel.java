
package com.collage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminPanel{ 
	
	private static final String url ="jdbc:mysql://127.0.0.1:3306/collage";
	private static final String user ="root";
	private static final String pass ="123123";
	
	public static void main(String args[]) throws SQLException {
		
		Connection conn =DriverManager.getConnection(url,user,pass);
		  Scanner sc = new Scanner(System.in);
	        Student st = new Student(conn,sc);
	        Teacher te = new Teacher(conn,sc);
	        while(true) {
	        System.out.println("\nWelcome to Student Management System");
	        System.out.println("Press 1 to Add Student");
	        System.out.println("Press 2 to Display Student");
	        System.out.println("Press 3 to Add Teacher");
	        System.out.println("Press 4 to Display Teacher");
	        System.out.println("Press 5 to Exit");
	        System.out.print("Enter Choice : ");
	        int choice = sc.nextInt();
	        switch(choice) {
	        case 1:
	            st.AddStudent();
	            break;
	        case 2:
	            st.DisplayStudnt();
	            break;
	        case 3:
	            te.AddTeacher();
	            break;
	        case 4:
	            te.DisplayTeacher();
	            break;
	        case 5:
	            System.out.println("Bye-Bye Admin!");
	            return;
	        default:
	            System.out.println("Wrong Entered!");
	        }
	        }
	    }
	}