package com.collage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Teacher {
    private Connection conn;
    private Scanner sc;

    public Teacher(Connection conn, Scanner sc) {
        this.conn = conn;
        this.sc = sc;
    }

    public void AddTeacher() {
        try {
            System.out.print("Enter Teacher Name: ");
            String name = sc.next();
            System.out.print("Enter Phone: ");
            String mobile = sc.next();
            System.out.print("Enter Subject: ");
            String subject = sc.next();

            String sql = "INSERT INTO teacher(name, phone, subject) VALUES (?, ?, ?)";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, name);
                pst.setString(2, mobile);
                pst.setString(3, subject);

                int ar = pst.executeUpdate();
                if(ar>0)
                	System.out.println("Add succesful!");
                else
                	System.out.println("Add valid!");
            }
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }

    public void DisplayTeacher() {
        try {
            String sql = "SELECT * FROM teacher";
            try (PreparedStatement pst = conn.prepareStatement(sql);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    System.out.println("ID : " + rs.getInt(1));
                    System.out.println("Name: " + rs.getString(2));
                    System.out.println("Phone: " + rs.getString(3));
                    System.out.println("Subject: " + rs.getString(4));
                    System.out.println("====================");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

