package org.perscholas.Module_303_11;

public class GenericValueObjects<T> {

    private T typeT;

    public T getT(){
        return typeT;
    }
    public void setT(T typeT){
        this.typeT =typeT;
    }


    public static void main ( String args[]){
        //creating your own generic classes is something that is very rare for an engineer and primarily is
        //used when creating a library
        GenericValueObjects<String> str = new GenericValueObjects<>();
        str.setT("String1");
        String s1 = str.getT();

    }
}
