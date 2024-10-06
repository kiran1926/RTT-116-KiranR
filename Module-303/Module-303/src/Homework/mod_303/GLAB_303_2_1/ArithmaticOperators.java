package Homework.mod_303.GLAB_303_2_1;

public class ArithmaticOperators {
    public static void main( String args [] ) {
        //Auto - generated method stub
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);

        //examples of SPECIAL CASES
        int tooBig = Integer.MAX_VALUE + 1 ;
        //Integer.MIN_VALUE
        int tooSmall = Integer.MIN_VALUE - 1;
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes "+ tooSmall);

        System.out.println(4.0 / 0.0);//prints infinity
        System.out.println( -4.0 / 0.0); //prints -infinity
        System.out.println( 0.0 / 0.0); //prints
        double d1 = 12 / 8;
        double d2 = 12.0F / 8;
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);

    }
}
