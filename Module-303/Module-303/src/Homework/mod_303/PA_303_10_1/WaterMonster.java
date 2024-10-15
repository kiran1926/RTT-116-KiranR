package Homework.mod_303.PA_303_10_1;

public class WaterMonster extends Monster implements MonsterAttack{


    public WaterMonster (String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with Water!";
    }
}
