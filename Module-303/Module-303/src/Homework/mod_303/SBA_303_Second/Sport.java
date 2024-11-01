package Homework.mod_303.SBA_303_Second;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public interface Sport {

    List<Integer> retired = new ArrayList<Integer>();

    default void calculateAvgAge(int[] age) {    ///  Here's we have used java 8 feature, that is we can also defined the method in interface by using default keyword
        double sum = 0;
        for (int age1 = 0; age1 < age.length; age1++) {

            sum = sum + age[age1];
        }
        //System.out.println("sum "+sum);
        double avg = sum / age.length;

        System.out.println("The average age of the team is " + new DecimalFormat("####.##").format(avg)); // we are using only 2 digits after decimal

    }

    default void retirePlayer(int id) {    ///  again Here's we have used java 8 feature, that is we can also defined the method in interface by using default keyword

        if (!retired.contains(id)) {           /// we are using list for check player is already retired or not
            if (id >= 20) {                      // less then 20 are in retired player according to hackerrank conditions
                System.out.println("Player with id: " + id + " has retired");
            } else if (id <= 40) {                                // greater then 40 are in retired player according to hackerrank conditions
                System.out.println("Player with id: " + id + " has retired");
            }
        } else {
            System.out.println("Player has already retired");
        }

        retired.add(id);
    }

    default void playerTransfer(int fee, int id) {


        System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);

    }
}