package Homework.mod_303.PA_303_10_1;

public  class Monster implements MonsterAttack {
    private String name;


    // constructor method for name
    public Monster(String name) {
        this.name = name;
    }


    // getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack (){
        return "I don't know how to attack!";
    }
}
