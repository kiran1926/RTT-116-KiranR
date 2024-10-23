package Homework.mod_303.M303_14_Practice.LambdaExp;

public class MyRunner {
    public static void main (String args[]){

        // using () -> statement/expression
        Human obj = () -> System.out.println("Hello, it's me!");
        obj.say();

        //using () -> {}
        Human obj1 = () -> {
            System.out.println("Hello, there!");
        };
        obj1.say();

        // with one parameter

        // (n) -> sout(n);
        HumanWithOneParameter obj2 = (st) -> System.out.println(st + " It's me!");
        obj2.say("Hello,");

        // n -> sout(n)
        HumanWithOneParameter obj3 = st -> System.out.println(st + " What's up?");
        obj3.say("Hello,");

        // (n) -> {sout(n);};
        HumanWithOneParameter obj4 = (st) -> {
            System.out.println(st + " How are you?");
        };
        obj4.say("Hello,");

    }
}
