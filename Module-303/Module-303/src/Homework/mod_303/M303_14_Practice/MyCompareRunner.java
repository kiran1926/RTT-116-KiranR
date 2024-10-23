package Homework.mod_303.M303_14_Practice;

public class MyCompareRunner {
    public static void main (String args[]){

        MyComparingClass compareObj = new MyComparingClass();

        int result_compare_int = compareObj.compareTwoVar.compare(4, 3);
        System.out.println(result_compare_int);

        String result_compare_Str = compareObj.compareTwoStr.compare("Kira", "Raki");
        System.out.println(result_compare_Str);
    }
}
