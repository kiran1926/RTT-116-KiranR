package Homework.mod_303.M303_14_Practice;

public class NormalHumanClass {
    //define an anonymous inner class implementing the interface.
    //construct an instance and invoke the method

    //anonymous constructor 1
    Human obj = new Human() {          //instantiated functional interface Human
        @Override
        public void say() {
            System.out.println("I am Jones");
        }
    };

    //anonymous constructor 2
    Human obj2 = new Human() {
        @Override
        public void say() {
            System.out.println("I am Tony.");
        }
    };
}
