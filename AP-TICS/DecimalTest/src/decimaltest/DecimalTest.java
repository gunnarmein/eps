package decimaltest;

import java.util.Random;

public class DecimalTest {

    public static void main(String[] args) {

        Decimal x1 = new Decimal("1244309589827439328474958304");
        Decimal y1 = new Decimal("9000000000000000000000000096");

        x1 = x1.add(y1);
        System.out.println("add:" + x1);

        x1 = new Decimal("1244909589827439328474958304");
        y1 = new Decimal("1244345960804455556060946096");

        x1 = x1.subtract(y1);
        System.out.println("sub:" + x1);

        if (true) {
            return;
        }
        // MY IDEALOGY FOR THIS ENTIRE ASSIGNMENT IS AS SIMPLE CODE AS POSSIBLE. IT WOULD BE INTERESTING TO DO COMPLEXITY
        // CALCULATIONS BUT NOT ENOUGH TIME.
        Random random = new Random();
        int d = random.nextInt();
        int e = Integer.MAX_VALUE;

        Decimal x = new Decimal(d);
        Decimal j = new Decimal(e);
        System.out.println("Integer " + d + " is returned as " + x);
        System.out.println("Integer " + e + " is returned as " + j); // tests the limits of conversion

        Decimal a = new Decimal("0"); // 0.0 
        Decimal b = new Decimal("9999"); // 1.0
        Decimal h = new Decimal(9);
        Decimal f = new Decimal("10");
        Decimal g = new Decimal("2");
        Decimal c = new Decimal("3147");

        // add
        System.out.println("0+9 is " + (a.add(b)) + " Sign of " + a.add(b).sign); // testing basic functionality
        System.out.println("3147+9 is " + (b.add(b))); // testing carry
        System.out.println("Int Max + Int Max is " + (j.add(j))); // testing additon passed int level
        // subtract
        System.out.println("0-9 is " + (a.subtract(b)) + "Sign of " + a.subtract(b).sign); // testing basic functionality
        System.out.println("3147-1 is " + (c.subtract(b))); // testing inverse carrying
        System.out.println("IntMax - IntMax is " + (j.subtract(j))); // testing subtraction past int level

        //multiply
        System.out.println("9*9 is " + b.multiply(b));
        System.out.println("10 *9 is " + f.multiply(b));
        System.out.println("10 *10 is " + f.multiply(f));

        //divide
        System.out.println("10/2 is " + f.divide(g));
        System.out.println("3147/2 is " + c.divide(f));
        System.out.println("3147/9 is " + c.divide(b));

        //squareroot
        System.out.println("9 squareroot is " + h.squareRoot());
        System.out.println("3147 squareroot is " + c.squareRoot());
        System.out.println("10 squareroot is " + f.squareRoot());

      

    }

}
