package Homework.mod_303.M303_14_Practice;

@FunctionalInterface
public interface Human {
    //single abstract method
    void say();

    //this is the default method
    default void sleep(){
        System.out.println("This is the default method");
    }

    //this is static method
    static void communication(){
        System.out.println("this is static method");
    }
}
