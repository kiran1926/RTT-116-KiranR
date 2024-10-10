package Homework.mod_303.GLAB_303_9_1;

public class HumanBeing {

    private double weight;
    private double height;
    private double BMI;

    // constructors
    public HumanBeing(){

    }
    public HumanBeing(double weight, double height, double BMI ){
        this.weight =weight;
        this.height =height;
        this.BMI = BMI;
    }

    // getters and setters
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

}
