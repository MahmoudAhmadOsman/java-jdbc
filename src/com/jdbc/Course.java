package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.*; // import everything
public class Course {
    static final String DB_URL = "jdbc:mysql://localhost:3306/courses";
    static final String USER = "root";
    static final String PASS = "";


    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement = connection.createStatement();
        ) {
            //1. Connect the database - using [ Connection ] function

            //Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courses", "root", "");
            //2. Create a statement - using [ Statement ] function
            // Statement statement = connection.createStatement();

            //3. Execute SQL query - using [ ResultSet ] function + SQL [ SELECT ] command
            System.out.println("================= Select all from course table ================= ");
            ResultSet queryResult = statement.executeQuery("SELECT * FROM course");


            //Insert SQL query
            System.out.println("================= Insert into course table ================= ");
            //String sql = "INSERT INTO courses VALUES(2,'Python', 'John Dow', '4', '2500', 'Python introduction class.' )";
            String sql = "INSERT INTO course" +
                    "(id, courseTitle, instructorName, credit, cost, description)" +
                    " VALUES (1, 'Java', 'John Doe', 4, 1500, 'Java course.')";
            //now, update the statement query
            statement.executeUpdate(sql);
            System.out.println("Data inserted!!!");


            //4. Process the result - using while loop
            while (queryResult.next()) {
                System.out.println(queryResult.getString("id") + ", "
                        + queryResult.getString("courseTitle") + ", "
                        + queryResult.getString("instructorName") + ","
                        + queryResult.getString("credit") + ","
                        + queryResult.getString("cost") + ", "
                        + queryResult.getString("description"));
            }


        } catch (Exception e) {
            System.out.println("Something went wrong!!!");
            e.printStackTrace();
        }


    }
}
