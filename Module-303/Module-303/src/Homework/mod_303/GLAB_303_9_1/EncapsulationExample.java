package Homework.mod_303.GLAB_303_9_1;

public class EncapsulationExample {

    public static double calculateBMI (HumanBeing h1){
        return (h1.getWeight() / (h1.getHeight() * h1.getHeight() ) );
    }

    public static void main (String args[]) {
        HumanBeing h1 = new HumanBeing();
        h1.setWeight(68);
        h1.setHeight(1.65);
        h1.setBMI(calculateBMI(h1));
        System.out.println("person has  "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height "+ " BMI = "+ h1.getBMI());
    }
}
