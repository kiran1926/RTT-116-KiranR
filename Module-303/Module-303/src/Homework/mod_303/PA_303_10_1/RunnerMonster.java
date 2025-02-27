package Homework.mod_303.PA_303_10_1;

public class RunnerMonster {
    public static void main ( String args[]){

        Monster m1 = new FireMonster("r2u2");  //upcast
        Monster m2 = new WaterMonster("u2r2");  // upcast
        Monster m3 = new StoneMonster("r2r2");  // upcast

        // invoke attack
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        // m1 dies , generates a new instance and re-assign to m1
        m1 = new StoneMonster("a2b2");
        System.out.println(m1.attack());

        //we have a problem here
        Monster m4 = new Monster("u2u2");
        System.out.println(m4.attack()); // garbage!!


    }
}
