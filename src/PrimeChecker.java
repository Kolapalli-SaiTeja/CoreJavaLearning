package src;

import java.util.Scanner;

    public class PrimeChecker {
        public static boolean isPrime(int number) {
            if (number <= 1|| number <=3){
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            for (int i = 5;  i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            scanner.close();

            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }

