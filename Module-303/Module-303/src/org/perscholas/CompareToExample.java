package org.perscholas;

public class CompareToExample {
    public static void main (String args[]){

        //

        String s1 = "abc";
        String s2 = "ABC";

        int result = s1.compareTo(s2);

        System.out.println(s1 + " == "+ s2+ "compareTo = "+ result);

        Integer i1 = 10;
        Integer i2 = 10;
        int r1 = i1.compareTo(i2);

        System.out.println(i1 + " == "+ i2 + " compare to = "+ r1);


    }
}
