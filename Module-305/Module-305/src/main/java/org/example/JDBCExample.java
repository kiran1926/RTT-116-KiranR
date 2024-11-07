package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://127.0.0.1:3306/classic_models";
        String user = "root";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you DB pwd");
        String password = sc.nextLine();
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);


            //a regular statement is going to run SQL when there are no substitutions
//            String SelectSQL = "Select * FROM employees WHERE id = 1002";
//            Statement stmt = connection.createStatement();
//            ResultSet result =  stmt.executeQuery(SelectSQL);

// For KBA !!!!!!!! first make connection Connection connection = DriverManager.getConnection(dburl, user, password);
            // and then create the preparedStatemnet and then execute it


            // when we have variables we want to use a PreparedStatement
            // in general we want to use a preparedStatement for everything !!! as a best practice
            // primarily for security reason around SQL Injection attacks
            String selectSQL = "Select * FROM employees WHERE id = ?";
            PreparedStatement stmt = connection.prepareStatement(selectSQL);
            stmt.setInt(1,1056);
            ResultSet result = stmt.executeQuery();


            // using the sample from the slides
//            String selectSQL1 = "SELECT * FROM employees WHERE salary > ? AND id = ?";
//            PreparedStatement stmt1 = connection.prepareStatement(selectSQL1);
//            stmt1.setInt((1, 80000);
//            stmt1.setInt(2,1056);

            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            result.close();
            stmt.close();
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
