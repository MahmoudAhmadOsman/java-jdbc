package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.*; // import everything
public class Driver {
    public static void main(String[] args) {
        try {
            //1. Connect the database - using [ Connection ] function

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courses", "root", "");

            //2. Create a statement - using [ Statement ] function
            Statement myStmt = myConn.createStatement();

            //3. Execute SQL query - using [ ResultSet ] function + SQL [ SELECT ] command
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM courses");

            //4. Process the result - using while loop
            while (myRs.next()){
                System.out.println(myRs.getString("id") + ", "
                        + myRs.getString("title") + ", "
                        + myRs.getString("instructor") + ","
                        + myRs.getString("credit") + ", "
                        + myRs.getString("description") );
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
