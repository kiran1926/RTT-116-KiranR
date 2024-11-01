package Homework.mod_303.SBA_303_Second.SBA_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList implements MyList{
     ArrayList<String> arrayToList;

    public void ArrayToList(){
        arrayToList = new ArrayList<>();
    }
    public void convert(String[] a){
        for (int i =0; i<a.length; i++){
            arrayToList.add(a[i]);
            System.out.println("I have added the string: "+ a[i] + "at the index: " + i);
        }
    }

    public void replace(int idx){
        if (idx >=0 && idx < arrayToList.size()) {
            arrayToList.set(idx, "");
            System.out.println("I have replaced the string: "+arrayToList.get(idx)+ "with an empty string");
        }
    }

    @Override
    public ArrayList<String> compact() {

        ArrayList<String> compactStr = new ArrayList<>();
        for(String str: arrayToList){
            if(!str.isEmpty()){
                compactStr.add(str);
            }
        }



        return null;
    }
}
