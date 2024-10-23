package Homework.mod_303.M303_14_Practice;

public class Calculator {

    FuncInterfaceExample obj = new FuncInterfaceExample() {
        @Override
        public int sum(int a, int b) {
            return a+b;
        }
    };
}
