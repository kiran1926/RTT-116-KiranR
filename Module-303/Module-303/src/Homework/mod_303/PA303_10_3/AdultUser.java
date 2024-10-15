package Homework.mod_303.PA303_10_3;

public class AdultUser extends User implements LibraryUser{

    //contsructor 1
    public AdultUser() {
    }

    //constructor 2
    public AdultUser(int age, String bookType) {
        super(age, bookType);
    }

    @Override
    public void registerAccount() {
        if (super.age >= 12){
            System.out.println("You have successfully registered under an Adult Account.");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (super.bookType.equalsIgnoreCase("Fiction")){
            System.out.println( "Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }

}
