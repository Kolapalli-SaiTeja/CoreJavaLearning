package src.Switch;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {


        // 3/(x^2 + y^2 -|Z|)    -> |Z| Means ABS values

        // A => x^2 ; B=> y^2 ; C => |Z|

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the values of x");
        double x = scanner.nextDouble();
        System.out.println(" Enter the values of y");
        double y = scanner.nextDouble();
        System.out.println(" Enter the values of z");
        double z = scanner.nextDouble();


     double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));




        System.out.println(result);


    }

}
