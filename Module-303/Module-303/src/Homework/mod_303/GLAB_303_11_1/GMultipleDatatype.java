package Homework.mod_303.GLAB_303_11_1;

public class GMultipleDatatype <DataTypeOne, DataTypeTwo> {

    DataTypeOne valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDatatype (DataTypeOne v1, DataTypeTwo v2){
        this.valueOne = v1;
        this.valueTwo = v2;
    }
    public DataTypeOne getValueOne(){
        return valueOne;
    }
    public void setValueOne(DataTypeOne valueOne){
        this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DataTypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
