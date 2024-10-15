package Homework.mod_303.PA303_10_3;

public class LibraryInterfaceRunner {
    public static void main ( String args[]){

        KidUser k1 = new KidUser();
        k1.setAge(10);
        k1.registerAccount();
        k1.setBookType("Kids");
        k1.requestBook();

        k1.setAge(18);
        k1.registerAccount();
        k1.setBookType("Fiction");
        k1.requestBook();

        //adult user instance
        AdultUser a1 = new AdultUser();

        a1.setAge(5);
        a1.registerAccount();
        a1.setBookType("Kids");
        a1.requestBook();

        a1.setAge(23);
        a1.registerAccount();
        a1.setBookType("Fiction");
        a1.requestBook();

    }
}
