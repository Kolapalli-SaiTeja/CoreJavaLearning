package src;

import java.util.Scanner;

public class Candidatecode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {

            System.out.println("Enter the numbers for 17 phobia");
            int N = scanner.nextInt(); // Input number for each test case
            if (hasPanicAttack(N)) { // only enters into statement if true;
                System.out.println("Panic Attack");
            } else {
                System.out.println("Happy Face");
            }
        }
    }

    // Function to check if Maya will have a panic attack
    private static boolean hasPanicAttack(int number) {
        return number == 17 || contains17(number) || isDivisibleBy17(number);
    }

    // Function to check if the number contains 17 as a part of it
    private static boolean contains17(int number) {

        return String.valueOf(number).contains("17");
    }

    // Function to check if the number is divisible by 17
    private static boolean isDivisibleBy17(int number) {

        return number % 17 == 0;
    }
}