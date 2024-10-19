package org.perscholas.M303_12;

public class CheckedExceptionExample {

    // this one chooses to deal with the exception in the start method after being thrown again by method1
    public void  start() {
        try {
            method1();
        }catch ( Exception e){

        }
    }


    public void method1() throws CustomException {
        System.out.println("method1");

        method2();
    }

    public void method2() throws CustomException{
        System.out.println("method2");
        throw new CustomException("error in method 2");
    }


    public static void main (String args[]){
        CheckedExceptionExample cee = new CheckedExceptionExample();
        cee.start();
    }
}
