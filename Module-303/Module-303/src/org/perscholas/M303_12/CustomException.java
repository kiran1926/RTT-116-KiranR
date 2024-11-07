package org.perscholas.M303_12;

public class CustomException extends Exception {
    //when making a custom exception the naming practice is to always end with the word Exception
    // 1) extends Exception
    //2) we create a constructor that takes a string and calls super to initialize the parent

    //***** one of the SBA questions will ask you to create a custom exception

    public CustomException (String message){
        super(message);

    }
}