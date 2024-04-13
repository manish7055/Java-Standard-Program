package com.collage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.util.Scanner;

public class Student{
	
	private Connection conn;
	private Scanner sc;
	
	public Student(Connection conn,Scanner sc) {
		this.conn =conn;
		this.sc = sc;
		
	}
	public void AddStudent() {
		System.out.print("Enter Student name:");
		String name =sc.next();
		System.out.print("Enter  Age :");
		int age =sc.nextInt();
		System.out.print("Enter  Class:");
		String clas=sc.next();
		try {
			
			String sql ="insert into student(name,age ,class) value(?,?,?)";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1,name);
			pst.setInt(2, age);
			pst.setString(3,clas);
			int ar =pst.executeUpdate();
			if(ar>0) {
		    System.out.println(" Add succesful!");
			}else {
				System.out.println("Add valid!");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public  void  DisplayStudnt() {
		try {
			
			String sql ="SELECT *FROM student";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs =pst.executeQuery();
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Age:"+rs.getInt(3));
				System.out.println("Class:"+rs.getString(4));
				System.out.println("=======================");
			}
		}catch(Exception e) {
		System.out.println(e);
		
		}
	}
	
	
}