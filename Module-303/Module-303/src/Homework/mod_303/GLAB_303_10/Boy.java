package Homework.mod_303.GLAB_303_10;

public class Boy extends Person {
    static double ageFactor = 1.1;
    public String talk(){
        return (super.talk() + "....but I love Java class.");
    }
    public String walk(){
        return ("I am walking now");
    }
    //The lifespan() method did not work in the way expected. That is because for class methods,
    // method look-ups occur at compile time.  The lifeSpan() method in the Person class is used by both
    // the Boy and Person classes.  In this case, since the method is static and is declared in the Person class,
    // the ageFactor from the Person class is used. However, the Girl class has its own lifeSpan() method,
    // so the ageFactor within the Girl class is used in that case.
}
