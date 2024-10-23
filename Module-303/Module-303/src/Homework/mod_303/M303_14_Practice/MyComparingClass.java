package Homework.mod_303.M303_14_Practice;

public class MyComparingClass {
    Generic_Func_Interface<Integer> compareTwoVar = new Generic_Func_Interface<Integer>(){

        @Override
        public Integer compare(Integer a, Integer b) {
            if ( a > b ){
                return a;
            }else {
                return b;
            }
        }
    };

    Generic_Func_Interface<String> compareTwoStr = new Generic_Func_Interface<String>() {
        @Override
        public String compare(String a, String b) {
            if(a.equals(b)){
                return "true";
            }else{
                return "false";
            }
        }
    };
}
