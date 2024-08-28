package Besic_program;



// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


import java.util.Scanner;



public class p5_infiniteInputSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to calculate their sum. Enter 'x' to finish.");

        while (true) {
            System.out.print("Enter a number (or 'x' to finish): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }
            

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to finish.");
            }
            
        }

        System.out.println("Sum of the entered numbers: " + sum);
        scanner.close();
    }
}