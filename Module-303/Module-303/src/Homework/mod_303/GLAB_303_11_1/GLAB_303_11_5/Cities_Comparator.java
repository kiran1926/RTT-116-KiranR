package Homework.mod_303.GLAB_303_11_1.GLAB_303_11_5;

public class Cities_Comparator implements java.util.Comparator<String> {

    @Override
    public int compare(String cities1, String cities2) {
        int value = cities1.compareTo(cities2);
                //sort elements in reverse order
        if(value> 0){
           return -1;
        } else if (value<0) {
            return 1;
        }else{
        return 0;
    }   }
}
