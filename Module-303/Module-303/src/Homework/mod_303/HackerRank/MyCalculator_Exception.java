package Homework.mod_303.HackerRank;
import java.util.Scanner;


public class MyCalculator_Exception {
    /*
     * Create the method long power(int, int) here.
     */
    public long power(int n, int p)throws Exception{

        if (n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        } else if(n ==0 && p == 0){
            throw new Exception("n and p should not be zero.");
        } else{
            long x = (long)Math.pow(n, p);
            return x;
        }
    }
}

    class Solution {
    public static final MyCalculator_Exception my_calculator = new MyCalculator_Exception();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


