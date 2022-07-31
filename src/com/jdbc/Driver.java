package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


//import java.sql.*; // import everything
public class Driver {
    public static void main(String[] args) {
        try {
            //1. Connect the database

            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/courses", "root", "");

            //2. Create a statement


            //3. Execute SQL query




            //4. Process the result






        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
