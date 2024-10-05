package org.perscholas;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringJoiner;

public class StringExamples {
    public static void main(String args[]) {

        //0 based indexing
        //          0123456
        String s = "abcdef";
        //this will print the length of the string
        System.out.println("The length of the string is " + s.length());

        //this will print string in upper case
        System.out.println("uppercase: " + s.toUpperCase());

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        //System.out.println(s.charAt(6)); //this will throw an error as there is no char at 6

        //string concatenation manual
        String concat = s.concat("ghijk");
        System.out.println(concat);

        //string replaceAll() use
        String r = "abc345abcd";
        System.out.println(r.replace('a', 'z'));
        System.out.println(r.replace("abc", "sss"));
        System.out.println(r.replaceAll("\\d", "r"));

        // ====Substring==== very very veryimp

        //             01234567890123
        String filename = "someiamge.jpg";
        //this goes from position 0 to position 4 but does not include position 4
        System.out.println(filename.substring(0, 4));
        System.out.println(filename.substring(1, 5));

        //if we use single argument to substring then it will begin from position and will print the rest of the string
        System.out.println(filename.substring(4));

        //we want to print out the index of . in the string
        //index of finds the first occurrece of what you looking for
        System.out.println("The . in the position" + filename.indexOf("."));

        //lastIndexOf will find the last index of what ever you are looking for
        //this can also be thought of search from the left to right
        //so to get the file extension we can use a combination of substring and lastIndexOf
        System.out.println(filename.substring(filename.lastIndexOf(".")));
        //challenge
        //how doi get just the filename without the extension
        System.out.println(filename.substring(0, filename.indexOf(".")));


        //this will not work properly
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("ABC");

        //this is never correct way to compare string
        System.out.println(s1 == s2); //this will print false as different memory location

        //the correct way to compare is to use .equals
        System.out.println(s1.equals(s2)); // this will show true

        //ignore case
        System.out.println(s1.equalsIgnoreCase(s3));

        //Convert from string to number
        String n = "101";
        //this will take the string 101 and convert it to the number one hundred one
        Integer n1 = Integer.parseInt(n);

        //this method can tghrow exception because the string may not contain only numbers
        //Integer n3 = Integer.parseInt("abc123");

        //converting from an int to a string is easy
        String n2 = n1.toString();

        //!!! IMPORTANT : String in Java are immutable meaning they cannot be changed after they are created
        String s4 = "abc";
        String s5 = "123";

        //when s4.toUpperCase is called, it creates another brand new string in memory that is ABC
        //it did not modify s4 ... it created a new string
        //then it concatenates on the string s5 when creates yet another new string in memory that is assigned to
        //variable s6
        String s6 = s4.toUpperCase() + s5;

        // =============== StringBuffer ====================

        //The StringBuffer is mutable meaning the internal con=tent of the stringBuffer can be changed and it is good
        // to use when doing lots of string manipulation is a high volume system
        //TODO - extra reading you should do - compare STringBuffer to the StringBuilder, they are similar
        //POtentioal Interview q " why would you use a StringBUffer or a StringBUilder over a regular string
        //answer - for memory management.. strings are immutable and the JVM creates a new string in memory and then
        //has to garbage collect them
        //whereas build and buffer
        StringBuffer sb = new StringBuffer();

        //append will add something to the end of the string and it has the same effect as concat for string
        //these 2 lines of code are equivalent of doing "abd" + "123"
        //or using .concat method on a string

        // 01234567890
        // abc1xyz23
        sb.append("abc");
        sb.append("123");
        // know this for KBA
        //this will start insert at position 4
        sb.insert(4, "xyz");

        //replace function for string buffer
        //start at position 0 and goto position 3 (but not include position 3)
        //starting at position 0 and going to position 3 is 3 characters that will essentially be deleted and
        //may be it's easier to think about replace as 2 operations
        //operation 1 - starting at position 0 and going to position 3 be deleted
        //operation 2-  starting at position 0 the string will be inserted
        sb.replace(0,3, "ABCDEF");

        System.out.println(sb.toString());

        //we can delete from a string buffer //ending position is exclusive
        sb.delete(0, 3);

        System.out.println(sb.toString());
        //not sure anyone would use this is na work environment but it exists
        //this reverses entire string
        sb.reverse();
        System.out.println(sb.toString());


        //KBA question .. study this section code so you can get KBA question

        //012345678901234567890
        //ABC
        //DEFG
        //12345DEFG
        //GFED54321
        //4321
        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0, 7, "DEFG");
        kba.insert(0,"12345");
        kba.reverse();
        kba.delete(0,5);    //or kba.reverse().delete(0,5);
        System.out.println(kba.toString());


        // ============ String Joiner =================
         //KBA question to study -- this is a memorize thing, forget later
        //a string joiner formats the list of strings and separates each one with a delimiter
        //but doesnt put a delimiter at the end of the line
        StringJoiner sj1 = new StringJoiner("|", "{", "}");
        StringJoiner sj2 = new StringJoiner(":","[", "]");

        sj1.add("Eric");
        sj1.add("Jessica");

        System.out.println(sj1);

        sj2.add("Jeff");
        sj2.add("Kiet");

        System.out.println(sj2);
        //maybe it's easier to memorize the outcome here and the pattern that was created
        System.out.println(sj1.merge(sj2).toString());
        //{Eric|Jessica|Jeff:Kiet} observe merging sj2 on sj1 so, properties of sj1 dominates

        // ========== Formatting =========

        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d and this is a byte: %d and one more variable %d \n", i, b, 10);
        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\n");

        // ============= Decimal Formatting ============

        //DecimalFormatter exists and makes it easy to format a number nicely
        //it takes in a pattern and  will apply that pattern to a number
        //when you need to use it.. google it
        //know that the DecimalFormatter exists

        String pattern = "##,###,###.##"; //can put $ in "$##,###,###.##" and get value printed in dollar
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(numberFormat.format(number));
        //self-practice
        String pattern1 = "$##,###,###.##"; //"##,###,###.00" - if we want to print upto 2 decimal places
        double num1 = 12345635.1234;
        DecimalFormat num1Format = new DecimalFormat(pattern1);
        System.out.println("Formatted num1 is " + num1Format.format(num1));


        // ========== TRIM ======

        String t = "    abc123    ";
        System.out.println("->" + t + "<-");
        System.out.println("->" + t.trim() + "<-");

        // ============ SPLIT ============

        String vowels = "a:e:i:o:u";
        //splitting the string at ","
        String[] result = vowels.split(":");
        //converting array to string and printing it
        System.out.println("result = "+ Arrays.toString(result));
    }
}