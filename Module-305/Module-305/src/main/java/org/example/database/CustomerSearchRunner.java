package org.example.database;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerSearchRunner {

    public static void main (String args[]){

        CustomerDAO cdao = new CustomerDAO();
        //to take input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter lastname: ");
        String lastName = scan.nextLine();

        List<Customer> customers = cdao.serachCustomer(firstName, lastName);
        for(Customer c : customers){
            System.out.println(c);
        }

    }
}
