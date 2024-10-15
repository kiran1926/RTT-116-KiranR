package Homework.mod_303.PA303_10_3;

public class User {
    protected int age;
    protected String bookType;

    //empty constructor
    public User (){

    }
    //constructor 1
    public User (String bookType){
        this.bookType = bookType;
    }
    //constructor 1
    public User (int age){
        this.age= age;
    }
    //constructor 2
    public User(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //getter and setter

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
