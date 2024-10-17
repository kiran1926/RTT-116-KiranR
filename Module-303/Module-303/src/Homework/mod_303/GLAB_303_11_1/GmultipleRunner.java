package Homework.mod_303.GLAB_303_11_1;

public class GmultipleRunner {
    public static void main (String args[]){

        GMultipleDatatype<String, Integer> obj1 = new GMultipleDatatype<>("Per Scholas", 11023);

        System.out.println(obj1.getValueOne());
        System.out.println(obj1.getValueTwo());

        GMultipleDatatype <String, String> obj2 = new GMultipleDatatype<>("Per Scholas", "Non-profit");
        System.out.println(obj2.getValueOne());
        System.out.println(obj2.getValueTwo());

    }
}
