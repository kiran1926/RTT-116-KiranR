package Homework.mod_303.GLAB_303_3_1;

import java.util.Arrays; //importing Arrays to convert array to string
// used for printing arrays

public class JavaStringMethods {
    public static void main(String args[]){

        // =====  1.length() Method  ======
        System.out.println("1.length() Method");
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length() + "\n");

        // ====== 2.isEmpty method ======
        System.out.println("2.isEmpty() Method");
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty() + "\n");

        // ======= 3. Trim() Method ==========
        System.out.println("3.trim() Method");
         s1 = "  hello  ";
         System.out.println(s1 + " how are you"); //without trim
        System.out.println(s1.trim() + " how are you \n");

        // ======= 4.toLowerCase() method =========
        System.out.println("4.toLowerCase() Method");
        s1 = "HELLO HOW Are You?";
        String s1Lower = s1.toLowerCase();
        System.out.println(s1Lower +"\n");

        // ======= 5.toUpper() method  =======
        System.out.println("5.toUpperCase() Method");
        s1 = "hello how are You?";
        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper +"\n");

        // ========= 6.concat() method ============
        System.out.println("6.concat() Method");
        // by using concat methos
        s1 = "Learn";
        s2 = "Java";
        //concatenate s1 and s2
        System.out.println(s1.concat(s2));
        //concatenate s2 and s1
        System.out.println(s2.concat(s1));

        //By using + operator
        s1 = "hello";
        s2 = "learners";
        // string s3 = s1.concat(s2) or
        String s3 = s1 + s2 ;
        System.out.println(s3);

        //string concatenate with number
        String s = "chapter" + 2;
        System.out.println(s);
        //string concatenate with character
        String str ="supplement" + 'B';
        System.out.println(str + "\n");

        // ======== 7. Split() method =========
        System.out.println("7.split() Method");
        String vowels = "a::e::i::o:u";
        //splitting the string at "::"
        //storing the result in an array of strings
        String[] result = vowels.split("::");
        System.out.println("result = " +Arrays.toString(result) + "\n");

        // ========= 8. charAt() method getting chars from a string ========
        System.out.println("8.charAt() Method");
        String message = "Welcome to Java";
        System.out.println("The first character in the message is "+ message.charAt(0) + "\n");

        // ========= 9.compareTo() Method ============
        System.out.println("9.compareTo() Method");
        s1 = "hello";
        s2 = "hello";
        s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2)); // returns 0 if both are equal
        System.out.println(s1.compareTo(s3)); //-ve number if s1 < s3
        System.out.println(s1.compareTo(s4) + "\n"); //+ve number if s1 > s4

        // ======== 10. substrings() Method =========
        System.out.println("10. substring() method : ");
        str1 = "java is fun";
        //extract substring from index 0 to 3
        System.out.println(str1.substring(0,3) +"\n");

        // ======== 11.indexOf() Method =========
        System.out.println("11. indexOf() method : ");
        str1 = "java is fun";
        int result1;
        //getting index of character 'j'
        result1 = str1.indexOf('j');
        System.out.println(result1);

        //getting index of character 'a'
        result1 = str1.lastIndexOf('a'); //the last occurrence of 'a' is returned
        System.out.println(result1);

        // character not in the string
        result1 = str1.lastIndexOf('J');
        System.out.println(result1); // -1

        // getting the last occurrence of "ava"
        result1 = str1.lastIndexOf("ava");
        System.out.println(result1); // 1

        //getting index of character 's'
        System.out.println("index of character s = " + str1.indexOf('s') +"\n");

        // ======== 12. contains() method ==========
        System.out.println("12. contains() method : ");
        str1 = "Learn Java";
        Boolean result2;

        //check if str1 contains "Java"
        result2 = str1.contains("Java");
        System.out.println(result2);
        //check if str1 contains "Python"
        result2 = str1.contains("Python");
        System.out.println(result2);
        //check if str1 contains ""
        result2 = str1.contains("");
        System.out.println(result2 + "\n");

        // ======= 13. replace() method ==========
        System.out.println("13. replace() method : ");
        str1 = "abc cba";

        //all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a','z'));

        //all occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L','J'));

        //character not in the string
        System.out.println("Hello".replace('4','J'));

        //all occurrences of "C++" replaced with "Java"
        System.out.println(str1.replace("c++", "Java"));

        //all occurrences of "aa" replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa","zz"));

        //substring not in the string
        System.out.println("Java".replace("C++", "C") +"\n");

        // ========= 14. replaceAll() method ========
        System.out.println("14. replaceAll() method : ");
        str1 = "Java123is456fun";
        //regex for sequence of digits
        String regex = "\\d+";

        //replace all occurrences of numeric digits by spaces
        System.out.println(str1.replaceAll(regex, " ") + "\n");

        // ======= 16. By using equals() method ==========
        s1 = "PerScholas";
        s2 = "PerScholas";
        s3 = new String ("PerScholas");
        s4 = "TEKsystem";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4) + "\n");

        // ======== 17. By using == operator =======
        //System.out.println("17. By using == operator : ");
        //s1 = "PerScholas";
        /*s2 = "PerScholas";
        s3 = new String ("PerScholas");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3); */

        // ====== 18. By using compareTo() method =========
        System.out.println("18. compareTo() method : ");
        s1 = "PerScholas";
        s2 = "PerScholas";
        s3 = "PerSchola";
        s4 = "PerscolasX";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

    }
}
