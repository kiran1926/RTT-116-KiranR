package org.perscholas;

public class EscapeSequenceExample {
    public static void main (String args[]){
        System.out.print("This is line 1\n This is line 2\n");
        System.out.println("This is line 3");
        System.out.println("This is line 4");

        //If we want to use tab in a string
        System.out.println("This is a tab ->\t<-");

        //If we want to pur double quote or single quote on our string output
        //we are going to use a \ to escape " so that java thinks it's actually the character
        //and not the string
        System.out.println("What happens if we want to have a \" in the string itself");

        //we want to use \ is the escape character, it too needs to be escaped
        System.out.println("We want to print out the \\ backslash character");

        //this string literal means that new string object is created and set to abc
        String x = "abc";
        String y = new String("abc");

        //to make it uppercase
        System.out.println(x.toUpperCase());

        //in contrast to a primitive type - there are no functions in a primitive data type
        int a = 5;


    }
}
