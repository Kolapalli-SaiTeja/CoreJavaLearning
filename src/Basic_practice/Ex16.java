package src.Basic_practice;

import java.util.*;

public class Ex16{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number: ");
        int x = 5;

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = 6;

        // Prompt the user to input the third number
        System.out.print("Input the third number: ");
        int z = 9;

        // Calculate the result using the sumoftwo function and display it
        System.out.print("The result is: " + sumoftwo(x, y, z));

        // Print a new line for better formatting
        System.out.print("\n");
    }

    // Function to check if the sum of two numbers equals the third number
    public static boolean sumoftwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }
}