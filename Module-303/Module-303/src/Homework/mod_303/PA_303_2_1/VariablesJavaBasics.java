package Homework.mod_303.PA_303_2_1;

//Practice Assignment - 303.2.1 : Variables

public class VariablesJavaBasics {
    public static void main (String args [] ) {

        //declare 2 int variables and perform addition
        int a = 23;
        int b = 67;
        int z = a + b;
        System.out.println("The sum is "+ z);

        // declare 2 double variables and perform addition
        double d1 = 432.45;
        double d2 = 5667.23;
        double d3 = d1 + d2;
        System.out.println("The sum is "+(float) d3); //if printed in double it gives 6099.6799999999
                                               //to avoid typecast with float to get decimal upto 2 places

        // declare variables; one int and second double and perform addition
        int i = 23;
        double d4 = 546.67;
        double d5 = i + d4;
        System.out.println("The sum is "+ d5);
        //variable type of the sum should be a double

        //declare 2 int variables and perform division
        int i1 = 567;
        int i2 = 45;
        double i3 = (double)i1 / i2 ;
        System.out.println("The result is "+ i3);
        //corrections needed are : typecasting at least one of the integers in the expression to double

        //declare two double variables perform division
        double db1 = 788.87;
        double db2 = 34.43;
        double db = db1 + db2;
        System.out.println("The result is "+ db);
        System.out.println("The result is "+ (int)db);
        //typecasting the result to an int gives 823

        //declare two int variables a & b, a=5, b=6, c=b/a double
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("q is " + q);
        double qDouble = (double) y/x;
        System.out.println("qDouble is " +qDouble);

        //declare a named constant  and use it in calculation
         final double DISCOUNT  = .15;
         double chair = 12.50;
         double table = 19.40;
         double total = 4 * chair *( 1 - DISCOUNT) + 3 * table * (1 - DISCOUNT);
         System.out.println("The total price after discount is $"+ total);


        // SALES_TAX problem
        double greenTea = 4.50;
        double cappuccino = 5.32;
        double espresso = 3.68;
        double subTotal = 0;
        double totalSale = 0;
        subTotal = 3 * greenTea + 4 * cappuccino + 2 * espresso;
        final double SALES_TAX = 0.10 * subTotal;
        totalSale = subTotal + SALES_TAX;
        System.out.println("The total sale is $" + totalSale);



    }

}
