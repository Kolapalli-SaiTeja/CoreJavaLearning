package src.DecisionMaking;

import java.util.Scanner;
public class Assignment4 {

    public static void main(String[] args) {

        System.out.println("Enter two operands : 3+5");
        Scanner scanner =new Scanner(System.in);

        double d1 = scanner.nextDouble();
        char op =scanner.next().charAt(0);
        double d2 =scanner.nextDouble();


        if(op == '+') {

            System.out.println((int)(d1 + d2));
        }
            else if(op=='-'){

            System.out.println((int)(d1 - d2));
            }

            else if (op=='*') {

            System.out.println((int)(d1 * d2));

        }
    }
    }


