package Homework.mod_303.M303_14_Practice;
@FunctionalInterface
public interface FuncInterfaceExample {

    //single abstract method
    int sum (int a, int b);

    //default method
    default int multiply (int a, int b){
        return a*b;
    }
}
