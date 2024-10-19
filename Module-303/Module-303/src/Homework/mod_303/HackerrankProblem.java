package Homework.mod_303;

public class HackerrankProblem {
    public static int fourthBit(int number) {
        // Write your code here
        String s = "";
        while (number > 0) {
            int reminder = number % 2;
            number = number / 2;
            s = s + reminder;
            for ( int i = s.length(); i >= 0; i--){
//                if (i == s.length()-4){
                  //

                return number;
                }
            }
        return number;
    }
}