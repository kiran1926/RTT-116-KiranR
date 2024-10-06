package Homework.mod_303.GLAB_303_2_1;

public class TernaryOperatorDemo {
    public static void main ( String args []) {
        int age = 18;
        String result = age < 200 ?
                "Less that 100" :"Greater than 100";
        // if age < 200 is true then "Less than 100" operation is performed
        //else if age < 200 is false then "greater than 100 " which is 2nd operation is performed.
        System.out.println(result);
    }
}
