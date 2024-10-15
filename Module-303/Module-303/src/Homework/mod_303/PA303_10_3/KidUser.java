package Homework.mod_303.PA303_10_3;

public class KidUser extends User implements LibraryUser{


    //constructor 1
    public KidUser() {
    }


    //constructor 2
    public KidUser(int age, String bookType) {
        super(age, bookType);
    }

    @Override
    public void registerAccount() {
        if (super.age <= 11) {
            System.out.println("“You have successfully registered under a Kids Account”");
        } else {
            System.out.println("“Sorry, age must be less than 12 to register as a kid.” ");
        }
    }

    @Override
    public void requestBook() {
        if (super.bookType.equalsIgnoreCase("Kids")){
            System.out.println( "Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
