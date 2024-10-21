package Homework.mod_303.HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = x/y;
            System.out.println(z);
        } catch(InputMismatchException ime ){
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
