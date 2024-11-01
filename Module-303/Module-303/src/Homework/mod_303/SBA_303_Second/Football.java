package Homework.mod_303.SBA_303_Second;

import java.text.DecimalFormat;

public class Football implements Sport {
    private int[] playerIDs;

    public Football() {
        int number_of_players = 11;
        //create array size +1 to adjust 1 index based array
        playerIDs = new int[number_of_players + 1];
        playerIDs[0] = 0;

        for (int i = 1; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new football team has been formed.");
    }

    public void calculateAvgAge(int[] age) {
        double sum = 0;

        for (int i = 1; i < age.length; i++) {
            sum += age[i];
        }
        double average_age = sum / (age.length - 1);
        DecimalFormat df = new DecimalFormat("#.##");
        String avgAge = df.format(average_age);

        System.out.println("The average age of the team is " + avgAge);
    }

    public void retirePlayer(int id) {
        if (id > 0){
            if (playerIDs[id] == -1){
                System.out.println("Player has already retired.");
            }else{
                playerIDs[id] = -1;
                System.out.println("PLayer with id: "+ id + "has retired.");
            }
        }
    }

    public void playerTransfer(int fee, int id) {
        if (id > 0) {
            if (playerIDs[id] == 1) {
                System.out.println("player with id: " + playerIDs[id] + " has been transferred with a fee of " + fee);
            } else if (playerIDs[id] == -1) {
                System.out.println("PLayer has already retired.");
            }
        }
    }
}