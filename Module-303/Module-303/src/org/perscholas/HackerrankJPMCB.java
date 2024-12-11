package org.perscholas;

import java.util.ArrayList;
import java.util.List;

public class HackerrankJPMCB {

    public static List<Integer> isPower(List<Integer> arr){


        List<Integer> resultArr = new ArrayList<>();

        for (Integer num : arr) {
            resultArr.add(isPowerOfTwo(num) ? 1 : 0);
        }
        return resultArr;
    }
    public static boolean isPowerOfTwo(Integer number){
        if(number <= 0){
            return false;
        }
        while (number > 1){
            if ( number % 2 != 0){
                return false;
            }
            number /= 2;
        }
        return true;
    }
}


//problem 2

public static int splitIntoTwo(List<Integer> arr) {

    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    for (int i =0; i< arr.size(); i++){

    }




    return 1;

}























