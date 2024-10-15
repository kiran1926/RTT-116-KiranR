package org.perscholas;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte num;   // This can hold whole number between -128 and 127.
        num = 113;
        System.out.println(num);


        short sNum;
        sNum = 150;
        System.out.println(sNum);


        long lNum = -12332252626L;
        System.out.println(lNum);


        double dNum = -42937737.9d;
        System.out.println(dNum);


        float fNum = 19.98f;
        System.out.println(fNum);


        boolean b = false;
        System.out.println(b);


        char ch = 'Z';
        System.out.println(ch);
        Integer i = Integer.valueOf(45);


            int x = 2;
            int y = 0;
            for (; y < 10; ++y) {
                if (y % x == 0)
                    continue;
                else if (y == 8)
                    break;
                else

                    System.out.print(y + " ");
            }

    }
}

