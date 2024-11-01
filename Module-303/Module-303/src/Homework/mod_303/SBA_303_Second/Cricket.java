package Homework.mod_303.SBA_303_Second;

import java.text.DecimalFormat;

public class Cricket implements Sport {

    private int[] playerIDs;
//    static FINAL playerID[0] = 0;

    //1)initialize an empty array playerIds to store 11 values and assign 1 to each element in playerIDs
    public Cricket (){

        int size = 11;
        playerIDs = new int[size+1]; //creating an array with one extra element
        playerIDs[0] = 0;

        for (int i =1; i<playerIDs.length; i++){

            playerIDs[i] = 1;

        }
        System.out.println("A new cricket team has been formed.");
    }

    public void calculateAvgAge(int[] age){
        double sum = 0;

        for (int i = 1; i < age.length; i++){
            sum += age[i];
        }
        double average_age = sum / (age.length-1);
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted_age = df.format(average_age);

        System.out.println("The average age of the team is "+ formatted_age);

    }

   public void retirePlayer(int id){
        if (id > 0){
            if (playerIDs[id] == -1){
                System.out.println("Player has already retired.");
            }else{
                playerIDs[id] = -1;
                System.out.println("PLayer with id: "+ id + "has retired.");
            }
        }

    }

}








//    String x = ""; // empty string
//    String y = null; // nothing in memory and empty pointer