package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;

public class EqualsExample {

    public static void main(String args[]){

        CustomerDAO customerDAO = new CustomerDAO();

        String s1 = "abc";
        String s2 = "xyz";

        boolean b1 = s1.equals(s2);

        Customer c1 =customerDAO.findById(114);
        Customer c2 = customerDAO.findById(119);
        Customer c3 = customerDAO.findById(119);

        System.out.println("c1 == c2 "+ c1.equals(c2));
        System.out.println("c3 == c2 "+ c3.equals(c2));

        // by default .equals compare memory location and objectType
        //not by default compares values
        //use mostly for primary key
        //generate equals() and hashcode()
        //use lombok at entity
    }
}
