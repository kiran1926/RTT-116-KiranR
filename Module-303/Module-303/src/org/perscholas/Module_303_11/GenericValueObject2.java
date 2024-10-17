package org.perscholas.Module_303_11;

public class GenericValueObject2 <K,T extends Number>{

    private T typeT;
    private K typeK;

    public T getTypeT() {
        return typeT;
    }

    public void setTypeT(T typeT) {
        this.typeT = typeT;
    }

    public K getTypeK() {
        return typeK;
    }

    public void setTypeK(K typeK) {
        this.typeK = typeK;
    }
    public static void main (String args[]){
        GenericValueObject2<String, Integer> str = new GenericValueObject2<>();

        GenericValueObject2<Integer, Double> integ = new GenericValueObject2<>();

    }
}
