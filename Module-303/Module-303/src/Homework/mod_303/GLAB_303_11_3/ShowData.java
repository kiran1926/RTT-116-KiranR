package Homework.mod_303.GLAB_303_11_3;

import java.util.ArrayList;

public class ShowData {

    public static void main(String[] args) {
        // instantiation to class AddDataToArrayList

        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookDetails();
        for(Book showValue: myBookList){
            System.out.println(showValue.getNumber() + " " +showValue.getName()+ " "+ showValue.getCategory()+ " "+
                    showValue.getAuthor());
        }
    }
}
