package Homework.mod_303.M303_14_Practice;

public class MyRunnerCalc {
    public static void main(String args[]){

        Calculator c = new Calculator();
        int result_abstractMethod = c.obj.sum(5, 5);
        System.out.println(result_abstractMethod);
        int result_defaultMethod = c.obj.multiply(5, 5);
        System.out.println(result_defaultMethod);
        
    }
}
