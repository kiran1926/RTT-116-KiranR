package org.perscholas.Module303_5;

public class ForLoopString {
    public static void main(String args[]){
        //looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";

        for ( int i = 0; i < characters.length(); i++){ //note that string.length() does use the ()
            System.out.println("Character at position "+ i + " = "+ characters.charAt(i));
        }

        //conversion of a string or character into an integer
        //character with the value 1
        char one = '1';
        char two = 'a';
        char ch = '2';
        Character c = Character.valueOf(one);
        int x = Integer.parseInt(c.toString());
        System.out.println(x);

        //or
        int y = Integer.parseInt(String.valueOf(ch));
        System.out.println(ch);

        int z = Integer.parseInt("2");

    }
}
