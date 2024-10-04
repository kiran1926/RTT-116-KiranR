package Homework.m303_2.GLAB_303_2_1;

public class AssignmentOperatorsDemo {
    public static void main (String args [] ) {
        // Assigning Primitive values

        int j , k ;
        j = 10;
        j = 5; //previous value is overwritten
        k = j; // k gets value of j which is 5
        System.out.println("j is : " + j );
        System.out.println("k is : " + k);

        //Multiple assignments
        k = j = 10; //(k = (j = 10))
        System.out.println("j is : " + j );
        System.out.println("k is : " + k);
    }
}
